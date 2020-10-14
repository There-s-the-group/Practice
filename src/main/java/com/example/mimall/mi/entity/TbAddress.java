package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:09
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName TbAddress
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbAddress {
    /**
     * 地址ID
     */
    private Long addressId;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户电话
     */
    private String tel;
    /**
     * 收货地址
     */
    private String streetName;
    /**
     * 是否是默认地址
     */
    private Boolean isDefault;
}
