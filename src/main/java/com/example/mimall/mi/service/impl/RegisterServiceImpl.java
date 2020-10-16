package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 17:31
 * @Description:
 */

import com.example.mimall.mi.service.RegisterService;
import org.springframework.stereotype.Service;

/**
 * @ClassName RegisterServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class RegisterServiceImpl extends BaseService implements RegisterService {
    @Override
    public boolean checkData(String param, int type) {
        return false;
    }

    @Override
    public int register(String userName, String userPwd) {
        return 0;
    }
}
