package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:28
 * @Description: 用户成员
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Member
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbMember {
    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 注册日期
     */
    private Date created;
    /**
     * 最近更新日期
     */
    private Date updated;
    /**
     * 性别
     */
    private String sex;
    /**
     * 住址
     */
    private String address;
    /**
     * 账号状态
     */
    private Integer state;

    private String file;
    /**
     * 用户描述
     */
    private String description;

    private Integer points;

    private Long balance;

    public TbMember() {
    }
}
