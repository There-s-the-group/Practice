package com.example.mimall.mi.service;


import com.example.mimall.mi.entity.vo.ResultVO;


/**
 * @Author: kotori
 * @Date: 2020/10/14 18:03
 * @Description:
 */
public interface ContentService {
    /**
     * 获取首页数据
     * @return
     */
    ResultVO getHome();
    ResultVO getProductDet();
}
