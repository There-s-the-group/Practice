package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/19 17:38
 * @Description:
 */

import com.example.mimall.mi.mapper.TbMemberMapper;
import com.example.mimall.mi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName MemberServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class MemberServiceImpl extends BaseService implements MemberService {
    @Autowired
    TbMemberMapper tbMemberMapper;
    @Override
    public int imgaeUpload(String filePath, Long userID) {
        tbMemberMapper.imgaeUpload(filePath,userID);
        return 0;
    }
}
