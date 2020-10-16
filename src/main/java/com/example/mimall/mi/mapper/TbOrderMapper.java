package com.example.mimall.mi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mimall.mi.entity.TbOrder;
import com.example.mimall.mi.entity.front.CartProduct;
import com.example.mimall.mi.entity.front.Order;
import com.example.mimall.mi.entity.front.OrderInfo;
import com.example.mimall.mi.entity.front.PageOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbOrderMapper extends BaseMapper<TbOrder> {
    List<Order> getOrderList(Long userId, int page, int size);

    List<CartProduct> getGoodsOfOrder(Long orderId);

    Order getOrder(Long orderId);

    int cancelOrder(Long orderId);

    Long createOrder(OrderInfo orderInfo);

    int delOrder(Long orderId);
}
