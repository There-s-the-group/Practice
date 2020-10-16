package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/15 15:49
 * @Description:
 */

import com.example.mimall.mi.entity.DtoUtil;
import com.example.mimall.mi.entity.TbMember;
import com.example.mimall.mi.entity.front.Member;
import com.example.mimall.mi.mapper.TbMemberMapper;
import com.example.mimall.mi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class LoginServiceImpl extends BaseService implements LoginService {
    @Autowired
    TbMemberMapper tbMemberMapper;

    @Override
    public Member userLogin(String username, String password) {
        final TbMember tM = tbMemberMapper.selectByUsername(username);
        if(tM == null){
            Member member=new Member();
            member.setState(0);
            member.setMessage("用户名或密码错误");
            return member;
        }
        //md5加密
        if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(tM.getPassword())) {
            Member member=new Member();
            member.setState(0);
            member.setMessage("用户名或密码错误");
            return member;
        }
        String token = "login_success";
        Member member= DtoUtil.TbMemer2Member(tM);
        member.setToken(token);
        member.setState(1);
        return member;
    }

    @Override
    public Member getUserByToken(String token) {

        return null;
    }

    @Override
    public int logout(String token,int id) {
        if ( "login_success".equals(token)) {
            final int login = tbMemberMapper.login(new Date(System.currentTimeMillis()), id);
            return login;
        }
        return 0;
    }
}
