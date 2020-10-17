package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/15 10:22
 * @Description:
 */

import com.example.mimall.mi.entity.TbPanelContent;
import com.example.mimall.mi.entity.front.SearchResult;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.ContentService;
import com.example.mimall.mi.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName GoodsController
 * @Description 商品控制
 * @Author kotori
 */
@RestController
public class GoodsController extends BaseController{
    @Autowired
    ContentService contentService;
    @Autowired
    SearchService searchService;

    @GetMapping("/goods/navList")
    public ResultVO getNavList(){
        final List<TbPanelContent> navList = contentService.getNavList();
        return result(navList);
    }

    /**
     * 获取商品详情
     * @param productId
     * @return
     */
    @GetMapping("/goods/productDet")
    public ResultVO getProductDet(Long productId){
        return contentService.getProductDet(productId);
    }

    /**
     * 获取所有商品
     * @param page 页码
     * @param size 大小
     * @param sort 排序
     * @param cid 类别
     * @param priceGt 价格低
     * @param priceLte 价格高
     * @return
     */
    @GetMapping("/goods/allGoods")
    public ResultVO getAllProduct(@RequestParam(defaultValue = "1") int page,
                                  @RequestParam(defaultValue = "20") int size,
                                  @RequestParam(defaultValue = "") String sort,
                                  @RequestParam(defaultValue = "") Long cid,
                                  @RequestParam(defaultValue = "-1") int priceGt,
                                  @RequestParam(defaultValue = "-1") int priceLte){

        final ResultVO allProduct = contentService.getAllProduct(page, size, sort, cid, priceGt, priceLte);
        return allProduct;
    }

    /**
     * 搜索商品
     * @param key
     * @param page
     * @param size
     * @param sort
     * @param priceGt
     * @param priceLte
     * @return
     */
    @GetMapping("/goods/search")
    public ResultVO searchProduct(@RequestParam(defaultValue = "") String key,
                                  @RequestParam(defaultValue = "1") int page,
                                  @RequestParam(defaultValue = "20") int size,
                                  @RequestParam(defaultValue = "") String sort,
                                  @RequestParam(defaultValue = "-1") int priceGt,
                                  @RequestParam(defaultValue = "-1") int priceLte){
        final SearchResult search = searchService.search(key, page, size, sort, priceGt, priceLte);
        return result(search);
    }

    @GetMapping("/goods/recommend")
    public ResultVO getRecommendGoods(){
        final ResultVO recommendGoods = contentService.getRecommendGoods();
        return result(recommendGoods);
    }
}
