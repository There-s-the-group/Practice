package com.example.mimall.mi.mapper;

import com.example.mimall.mi.entity.TbAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbAddressMapper {
    List<TbAddress> getAddressListByUserId(Long userId);

    TbAddress getAddressByAddressId(Long addressId);

    int addAddress(TbAddress tbAddress);

    int updateAddress(TbAddress tbAddress);

    int changeAddress(TbAddress tbAddress);
    int deleteAddress(TbAddress tbAddress);
}
