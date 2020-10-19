package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:44
 * @Description:
 */

import com.example.mimall.mi.entity.TbAddress;
import com.example.mimall.mi.mapper.TbAddressMapper;
import com.example.mimall.mi.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AddressServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class AddressServiceImpl extends BaseService implements AddressService {
    @Autowired
    TbAddressMapper tbAddressMapper;

    @Override
    public List<TbAddress> getAddressList(Long userId) {
        List<TbAddress> addressList=tbAddressMapper.getAddressListByUserId(userId);
        System.out.println(addressList);
        return addressList;
    }

    @Override
    public TbAddress getAddress(Long addressId) {

        return tbAddressMapper.getAddressByAddressId(addressId);
    }

    @Override
    public int addAddress(TbAddress tbAddress) {
        return tbAddressMapper.addAddress(tbAddress);
    }

    @Override
    public int updateAddress(TbAddress tbAddress) {
        if (tbAddress.getIsDefault()){
            changeAddress(tbAddress);
        }
        return tbAddressMapper.updateAddress(tbAddress);
    }

    @Override
    public int delAddress(TbAddress tbAddress) {
        return tbAddressMapper.deleteAddress(tbAddress);
    }

    @Override
    public int changeAddress(TbAddress tbAddress) {
        return tbAddressMapper.changeAddress(tbAddress);
    }
}
