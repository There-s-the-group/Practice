package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/15 16:18
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName MemberDto
 * @Description TODO
 * @Author kotori
 */
@Data
public class MemberDto {

    private String username;

    private String password;

    private String phone;

    private String email;

    private String sex;

    private String province;

    private String city;

    private String district;

    private Integer state;

    private String memberfile;

    private String description;
}
