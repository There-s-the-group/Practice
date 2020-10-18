package com.example.mimall.mi.service;

/**
 * @Author: kotori
 * @Date: 2020/10/16 17:30
 * @Description: 注册接口
 */
public interface RegisterService {
    /**
     * 勾选
     * @param param
     * @param type
     * @return
     */
    boolean checkData(String userName);

    /**
     * 注册
     * @param userName
     * @param userPwd
     * @return
     */
    int register(String userName,String userPwd);
}
