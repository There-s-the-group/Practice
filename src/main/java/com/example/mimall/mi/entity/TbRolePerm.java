package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:51
 * @Description: 决定了哪种角色可使用哪种权限
 */

import lombok.Data;

/**
 * @ClassName TbRolePerm
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbRolePerm {
    /**
     * id
     */
    private Integer id;
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 权限ID
     */
    private Integer permissionId;
}
