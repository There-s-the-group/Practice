package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:44
 * @Description:
 */

import com.example.mimall.mi.entity.TbAddress;
import com.example.mimall.mi.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AddressServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class AddressServiceImpl extends BaseService implements AddressService {
    @Override
    public List<TbAddress> getAddressList(Long userId) {
        return null;
    }

    @Override
    public TbAddress getAddress(Long addressId) {
        return null;
    }

    @Override
    public int addAddress(TbAddress tbAddress) {
        return 0;
    }

    @Override
    public int updateAddress(TbAddress tbAddress) {
        return 0;
    }

    @Override
    public int delAddress(TbAddress tbAddress) {
        return 0;
    }
}
