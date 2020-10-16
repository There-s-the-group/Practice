package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/16 09:10
 * @Description:
 */

import com.example.mimall.mi.entity.TbExpress;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @ClassName ExpressController
 * @Description TODO
 * @Author kotori
 */
@RestController
public class ExpressController extends BaseController{
    @Autowired
    ExpressService expressService;

    /**
     * 获取所有快递
     * @return
     */
    @GetMapping("/express/list")
    public ResultVO addressList(){
        final List<TbExpress> expressList = expressService.getExpressList();
        return result(expressList);
    }

    /**
     * 添加快递
     * @param tbExpress
     * @return
     */
    @PostMapping("/express/add")
    public ResultVO addTbExpress(@RequestBody TbExpress tbExpress){
        final int i = expressService.addExpress(tbExpress);
        return result(i);
    }

    /**
     * 编辑快递
     * @param tbExpress
     * @return
     */
    @PostMapping("/express/update")
    public ResultVO updateAddress(@RequestBody TbExpress tbExpress){
        final int i = expressService.updateExpress(tbExpress);
        return result(i);
    }

    @DeleteMapping("/express/del/{ids}")
    public ResultVO delAddress(@PathVariable int[] ids){
        for(int id:ids){
            expressService.delExpress(id);
        }
        return result("success");
    }
}
