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

import java.util.Date;

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
    public boolean checkData(String userName) {
        if(tbMemberMapper.selectByUsername(userName)!=null){
            return false;
        }
        return true;
    }

    @Override
    public int register(String userName, String userPwd) {

        TbMember tbMember = new TbMember();
        tbMember.setUsername(userName);

        if (userName.isEmpty() || userPwd.isEmpty()) {
            return -1; //用户名密码不能为空
        }
        boolean result = checkData(userName);
        if (!result) {
            return 0; //该用户名已被注册
        }

        //MD5加密
        String md5Pass = DigestUtils.md5DigestAsHex(userPwd.getBytes());
        tbMember.setPassword(md5Pass);
        tbMember.setState(1);
        tbMember.setCreated(new Date());
        tbMember.setUpdated(new Date());

        return tbMemberMapper.register(tbMember);
    }
}
