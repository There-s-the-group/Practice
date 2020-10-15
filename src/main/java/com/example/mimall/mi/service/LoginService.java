package com.example.mimall.mi.service;

import com.example.mimall.mi.entity.front.Member;

/**
 * @Author: kotori
 * @Date: 2020/10/15 15:43
 * @Description: 用于登录的服务操作
 */

public interface LoginService {
    /**
     * 判断用户是否可以登录
     * @param username
     * @param password
     * @return
     */
    Member userLogin(String username, String password);

    /**
     * 根据token信息获取用户
     * @param token
     * @return
     */
    Member getUserByToken(String token);

    /**
     * 注销token
     * @param token
     * @return
     */
    int logout(String token);
}
