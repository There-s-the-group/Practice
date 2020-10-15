package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/15 10:22
 * @Description:
 */

import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodsController
 * @Description TODO
 * @Author kotori
 */
@RestController
public class GoodsController extends BaseController{
    @Autowired
    ContentService contentService;

    @GetMapping("/goods/productDet")
    public ResultVO getProductDet(Long productId){
        return contentService.getProductDet();
    }
}
