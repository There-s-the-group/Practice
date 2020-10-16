package com.example.mimall.mi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mimall.mi.entity.TbOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbOrderMapper extends BaseMapper<TbOrder> {
    int deleteOrder(String orderId);


}
