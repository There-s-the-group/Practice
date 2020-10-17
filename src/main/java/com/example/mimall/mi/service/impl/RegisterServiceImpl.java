package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 17:31
 * @Description:
 */

import com.example.mimall.mi.entity.DtoUtil;
import com.example.mimall.mi.entity.TbMember;
import com.example.mimall.mi.entity.front.Member;
import com.example.mimall.mi.mapper.TbMemberMapper;
import com.example.mimall.mi.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @ClassName RegisterServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class RegisterServiceImpl extends BaseService implements RegisterService {
    @Autowired
    TbMemberMapper tbMemberMapper;
    @Override
    public boolean checkData(String param, int type) { return false; }

    @Override
    public int register(String userName, String userPwd) {
        final int tbm=tbMemberMapper.register(userName,userPwd);
        System.out.println(tbm);
        return tbm;
    }
}
