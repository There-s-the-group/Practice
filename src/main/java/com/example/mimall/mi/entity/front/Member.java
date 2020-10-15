package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 15:47
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName Member
 * @Description TODO
 * @Author kotori
 */
@Data
public class Member {
    private Long id;

    private String username;

    private String phone;

    private String email;

    private String sex;

    private String address;

    private String file;

    private String description;

    private Integer points;

    private Long balance;

    private int state;

    private String token;

    private String message;
}
