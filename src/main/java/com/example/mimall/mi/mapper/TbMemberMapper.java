package com.example.mimall.mi.mapper;

import com.example.mimall.mi.entity.TbMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: kotori
 * @Date: 2020/10/15 15:52
 * @Description:
 */
@Mapper
public interface TbMemberMapper {
    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    TbMember selectByPrimaryKey(Long id);

    /**
     * 通过用户名查找
     * @param username
     * @return
     */
    TbMember selectByUsername(String username);

}
