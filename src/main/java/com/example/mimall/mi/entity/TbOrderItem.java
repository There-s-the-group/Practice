package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:35
 * @Description:订单详情
 */

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName TbOrderItem
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbOrderItem {
    /**
     * id
     */
    private String id;
    /**
     * 货物ID
     */
    private String itemId;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 购买数量
     */
    private Integer num;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品单价
     */
    private BigDecimal price;
    /**
     * 总金额
     */
    private BigDecimal totalFee;

    private String picPath;

}
