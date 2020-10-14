package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:47
 * @Description: 权限，前端可进行哪些操作，是从数据库里获取的
 */

import lombok.Data;

/**
 * @ClassName TbPermission
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbPermission {
    /**
     * id
     */
    private Integer id;
    /**
     * 可操作的功能
     */
    private String name;
    /**
     * 可操作的功能路由
     */
    private String permission;
}
