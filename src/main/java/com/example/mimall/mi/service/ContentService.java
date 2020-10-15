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

    /**
     * H获取商品详细数据
     * @return
     */
    ResultVO getProductDet(Long id);

    /**
     * 通过PanelID 获取 Panel里面的内容
     * @return
     */
    ResultVO getPanelContentListByPanelId();

    /**
     * 通过ID获取TbPanelContent
     * @return
     */
    ResultVO getTbPanelContentById();

    /**
     * 获取推荐物品
     * @return
     */
    ResultVO getRecommendGoods();

    /**
     * 获取全部商品
     * @param page 页码
     * @param size 每页数量
     * @param sort 排序方式
     * @param cid  所属分类
     * @param priceGt  价格低
     * @param priceLte 价格高
     * @return
     */
    ResultVO getAllProduct(int page, int size, String sort, Long cid, int priceGt, int priceLte);



}
