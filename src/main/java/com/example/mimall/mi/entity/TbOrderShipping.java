package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:38
 * @Description:
 */

import lombok.Data;

import java.util.Date;

/**
 * @ClassName TbOrderShipping
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbOrderShipping {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 收货人全名
     */
    private String receiverName;
    /**
     * 收货人电话
     */
    private String receiverPhone;
    /**
     * 收货人移动电话
     */
    private String receiverMobile;
    /**
     * 省份
     */
    private String receiverState;
    /**
     * 收获城市
     */
    private String receiverCity;
    /**
     * 区/县
     */
    private String receiverDistrict;
    /**
     * 收货地址，如：xx路xx号
     */
    private String receiverAddress;
    /**
     * 邮政编码,如：310001
     */
    private String receiverZip;
    /**
     * 创建日期
     */
    private Date created;
    /**
     * 最近更新日期
     */
    private Date updated;
}
