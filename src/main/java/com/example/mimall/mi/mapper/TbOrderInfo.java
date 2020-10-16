package com.example.mimall.mi.mapper;

import com.example.mimall.mi.entity.front.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/16 23:20
 * @Description:
 */
@Mapper
public interface TbOrderInfo {
    List<Order> getOrderInfoList();
}
