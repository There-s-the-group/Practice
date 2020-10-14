package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:50
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName TbRole
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbRole {
    /**
     * id
     */
    private Integer id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色描述
     */
    private String description;
}
