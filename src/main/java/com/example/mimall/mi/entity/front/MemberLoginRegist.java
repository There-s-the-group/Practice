package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 14:14
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName MemberLoginRegist
 * @Description TODO
 * @Author kotori
 */
@Data
public class MemberLoginRegist {
    private String userName;

    private String userPwd;

//    private String challenge;
//
//    private String validate;
//
//    private String seccode;

    private String statusKey;
}
