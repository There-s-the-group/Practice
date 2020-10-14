package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:31
 * @Description: 订单信息
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName TbOrder
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbOrder {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 实付金额
     */
    private BigDecimal payment;
    /**
     * 支付类型 1在线支付 2货到付款
     */
    private Integer paymentType;
    /**
     * 邮费
     */
    private BigDecimal postFee;
    /**
     * 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     */
    private Integer status;
    /**
     * 下单日期
     */
    private Date createTime;
    /**
     * 最近更新日期
     */
    private Date updateTime;
    /**
     * 付款时间
     */
    private Date paymentTime;
    /**
     * 发货时间
     */
    private Date consignTime;
    /**
     * 交易完成时间
     */
    private Date endTime;
    /**
     * 交易关闭时间
     */
    private Date closeTime;
    /**
     * 物流名称
     */
    private String shippingName;
    /**
     * 物流单号
     */
    private String shippingCode;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 买家留言
     */
    private String buyerMessage;
    /**
     * 买家昵称
     */
    private String buyerNick;
    /**
     * 买家是否评论了
     */
    private Boolean buyerComment;
}
