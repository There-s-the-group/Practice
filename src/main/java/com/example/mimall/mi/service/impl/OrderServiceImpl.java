package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:45
 * @Description:
 */

import com.example.mimall.mi.entity.TbMember;
import com.example.mimall.mi.entity.TbOrder;
import com.example.mimall.mi.entity.TbOrderItem;
import com.example.mimall.mi.entity.front.CartProduct;
import com.example.mimall.mi.entity.front.Order;
import com.example.mimall.mi.entity.front.OrderInfo;
import com.example.mimall.mi.entity.front.PageOrder;
import com.example.mimall.mi.mapper.TbCartMapper;
import com.example.mimall.mi.mapper.TbMemberMapper;
import com.example.mimall.mi.mapper.TbOrderItemMapper;
import com.example.mimall.mi.mapper.TbOrderMapper;
import com.example.mimall.mi.service.OrderService;
import com.example.mimall.mi.util.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class OrderServiceImpl extends BaseService implements OrderService {

    @Autowired
    TbOrderMapper tbOrderMapper;

    @Autowired
    TbMemberMapper tbMemberMapper;

    @Autowired
    TbOrderItemMapper tbOrderItemMapper;

    @Autowired
    TbCartMapper tbCartMapper;

    @Override
    public PageOrder getOrderList(Long userId, int page, int size) {
        final List<Order> orderList = tbOrderMapper.getOrderList(userId, (page-1)*size, size);
        for (Order o :
                orderList) {
            final List<CartProduct> goodsOfOrder = tbOrderMapper.getGoodsOfOrder(o.getOrderId());
            o.setGoodsList(goodsOfOrder);
            BigDecimal total=new BigDecimal("0.00");
            for (CartProduct c: goodsOfOrder ) {
                total= total.add(c.getSalePrice().multiply(new BigDecimal(c.getBuyNum())));
            }
            o.setOrderTotal(total);
        }
        PageOrder pageOrder = new PageOrder();
        pageOrder.setData(orderList);
        pageOrder.setTotal(orderList.size());
        return pageOrder;
    }

    @Override
    public Order getOrder(Long orderId) {
        return null;
    }

    @Override
    public int cancelOrder(Long orderId) {
        return 0;
    }

    @Override
    public Long createOrder(OrderInfo orderInfo) {
        TbMember tbMember = tbMemberMapper.selectByPrimaryKey(Long.valueOf(orderInfo.getUserId()));

        TbOrder order = new TbOrder();
        //生成订单ID
        Long orderId = IDUtil.getRandomId();
        order.setOrderId(String.valueOf(orderId));
        order.setUserId(Long.valueOf(orderInfo.getUserId()));
        order.setBuyerNick(tbMember.getUsername());
        order.setPayment(orderInfo.getOrderTotal());
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());
        //0、未付款，1、已付款，2、未发货，3、已发货，4、交易成功，5、交易关闭，6、交易失败
        order.setStatus(0);

        long createOrderResult=tbOrderMapper.createOrder(order);

        List<CartProduct> list = orderInfo.getGoodsList();
        int createOrderItemResult=1;
        int deleteItemInCartResult=1;
        for (CartProduct cartProduct : list) {
            TbOrderItem orderItem = new TbOrderItem();
            //生成订单商品ID
            Long orderItemId = IDUtil.getRandomId();
            orderItem.setId(String.valueOf(orderItemId));
            orderItem.setItemId(String.valueOf(cartProduct.getProductId()));
            orderItem.setOrderId(String.valueOf(orderId));
            orderItem.setNum(Math.toIntExact(cartProduct.getBuyNum()));
            orderItem.setPrice(cartProduct.getSalePrice());
            orderItem.setTitle(cartProduct.getProductName());
            orderItem.setPicPath(cartProduct.getProductImg());
            orderItem.setTotalFee(cartProduct.getSalePrice().multiply(BigDecimal.valueOf(cartProduct.getBuyNum())));

            if(tbOrderItemMapper.createOrderItem(orderItem)!=1){
                createOrderItemResult=0;
            }

            //生成订单的商品要在购物车内进行对应的删除
            if(tbCartMapper.deleteCart(Long.valueOf(orderInfo.getUserId()),cartProduct.getProductId())!=1){
                deleteItemInCartResult=0;
            }
        }
        if(createOrderItemResult==1&&deleteItemInCartResult==1){
            //tb_order_Item表添加数据成功或tb_cart表删除成功则返回订单ID
            return createOrderResult;
        }else{
            //返回值为0：tb_order_Item表添加数据失败或tb_cart表删除失败
            return 0l;
        }
    }

    @Override
    public int delOrder(Long orderId) {
        return tbOrderMapper.delOrder(orderId);
    }
}
