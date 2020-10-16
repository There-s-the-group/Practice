package com.example.mimall.mi.service;

import com.example.mimall.mi.entity.TbAddress;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/16 09:26
 * @Description: 地址接口
 */
public interface AddressService {
    /**
     * 获取地址
     * @param userId
     * @return
     */
    List<TbAddress> getAddressList(Long userId);

    /**
     * 获取单个
     * @param addressId
     * @return
     */
    TbAddress getAddress(Long addressId);

    /**
     * 添加
     * @param tbAddress
     * @return
     */
    int addAddress(TbAddress tbAddress);

    /**
     * 更新
     * @param tbAddress
     * @return
     */
    int updateAddress(TbAddress tbAddress);

    /**
     * 删除
     * @param tbAddress
     * @return
     */
    int delAddress(TbAddress tbAddress);
}
