package com.example.mimall.mi.service;

import com.example.mimall.mi.entity.TbItemCat;
import com.example.mimall.mi.entity.ZTreeNode;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/16 09:07
 * @Description: 物品分类的接口
 */
public interface ItemCatService {
    /**
     * 通过id获取
     * @param id
     * @return
     */
    TbItemCat getItemCatById(Long id);

    /**
     * 获得分类树
     * @param parentId
     * @return
     */
    List<ZTreeNode> getItemCatList(int parentId);

    /**
     * 添加分类
     * @param tbItemCat
     * @return
     */
    int addItemCat(TbItemCat tbItemCat);

    /**
     * 编辑分类
     * @param tbItemCat
     * @return
     */
    int updateItemCat(TbItemCat tbItemCat);

    /**
     * 删除单个分类
     * @param id
     */
    void deleteItemCat(Long id);

    /**
     * 递归删除
     * @param id
     */
    void deleteZTree(Long id);
}
