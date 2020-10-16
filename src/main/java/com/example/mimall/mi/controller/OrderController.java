package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/15 19:38
 * @Description:
 */

import com.example.mimall.mi.entity.front.Order;
import com.example.mimall.mi.entity.front.OrderInfo;
import com.example.mimall.mi.entity.front.PageOrder;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName OrderController
 * @Description 订单控制
 * @Author kotori
 */
@RestController
public class OrderController extends BaseController{
    @Autowired
    OrderService orderService;

    /**
     * 获得用户所有订单 默认第一页 每页5单
     * @param userId
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/member/orderList")
    public ResultVO getOrderList(String userId,
                                 @RequestParam(defaultValue = "1") int page,
                                 @RequestParam(defaultValue = "5") int size){
        final PageOrder orderList = orderService.getOrderList(Long.valueOf(userId), page, size);
        return result(orderList);
    }

    /**
     * 通过订单号获取订单
     * @param orderId
     * @return
     */
    @GetMapping("/member/orderDetail")
    public ResultVO getOrder(String orderId){
        final Order order = orderService.getOrder(Long.valueOf(orderId));
        return result(order);
    }

    /**
     * 创建订单
     * @param orderInfo
     * @return
     */
    @PostMapping("/member/addOrder")
    public ResultVO addOrder(@RequestBody OrderInfo orderInfo){
        final Long order = orderService.createOrder(orderInfo);
        return result(order);
    }

    /**
     * 取消订单
     * @param order
     * @return
     */
    @PostMapping("/member/cancelOrder")
    public ResultVO cancelOrder(@RequestBody Order order){
        final int i = orderService.cancelOrder(order.getOrderId());
        return result(i);
    }

    /**
     * 删除订单
     * @param orderId
     * @return
     */
    @GetMapping("/member/delOrder")
    public ResultVO delOrder(String orderId){
        final int i = orderService.delOrder(Long.valueOf(orderId));
        return result(i);
    }
}
