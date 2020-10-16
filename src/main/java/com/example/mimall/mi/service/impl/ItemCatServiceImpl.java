package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 09:08
 * @Description:
 */

import com.example.mimall.mi.entity.TbItemCat;
import com.example.mimall.mi.entity.ZTreeNode;
import com.example.mimall.mi.service.ItemCatService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ItemCatServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class ItemCatServiceImpl extends BaseService implements ItemCatService {
    @Override
    public TbItemCat getItemCatById(Long id) {
        return null;
    }

    @Override
    public List<ZTreeNode> getItemCatList(int parentId) {
        return null;
    }

    @Override
    public int addItemCat(TbItemCat tbItemCat) {
        return 0;
    }

    @Override
    public int updateItemCat(TbItemCat tbItemCat) {
        return 0;
    }

    @Override
    public void deleteItemCat(Long id) {

    }

    @Override
    public void deleteZTree(Long id) {

    }
}
