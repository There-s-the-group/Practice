package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/15 19:26
 * @Description:
 */

import com.example.mimall.mi.entity.TbAddress;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName AddressController
 * @Description 用户地址控制
 * @Author kotori
 */
@RestController
public class AddressController extends BaseController{

    @Autowired
    AddressService addressService;

    /**
     * 获取用户所有收货地址
     * @param tbAddress
     * @return
     */
    @PostMapping("/member/addressList")
    public ResultVO addressList(@RequestBody TbAddress tbAddress){
        final List<TbAddress> addressList = addressService.getAddressList(tbAddress.getUserId());
        return result(addressList);
    }

    /**
     * 通过id获得收货地址
     * @param tbAddress
     * @return
     */
    @PostMapping("/member/address")
    public ResultVO address(@RequestBody TbAddress tbAddress){
        final TbAddress address = addressService.getAddress(tbAddress.getAddressId());
        return result(address);
    }

    /**
     * 添加收货地址
     * @param tbAddress
     * @return
     */
    @PostMapping("/member/addAddress")
    public ResultVO addAddress(@RequestBody TbAddress tbAddress){
        final int i = addressService.addAddress(tbAddress);
        return result(i);
    }

    /**
     * 编辑收货地址
     * @param tbAddress
     * @return
     */
    @PostMapping("/member/updateAddress")
    public ResultVO updateAddress(@RequestBody TbAddress tbAddress){
        final int i = addressService.updateAddress(tbAddress);
        return result(i);
    }

    @PostMapping("/member/delAddress")
    public ResultVO delAddress(@RequestBody TbAddress tbAddress){
        final int i = addressService.delAddress(tbAddress);
        return result(i);
    }
}
