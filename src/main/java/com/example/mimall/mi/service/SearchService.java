package com.example.mimall.mi.service;

import com.example.mimall.mi.entity.front.SearchResult;

/**
 * @Author: kotori
 * @Date: 2020/10/15 20:37
 * @Description:
 */
public interface SearchService {
    /**
     * ES商品搜索
     * @param keyword
     * @param page
     * @param size
     * @param sort
     * @param priceGt
     * @param priceLte
     * @return
     */
    SearchResult search(String keyword, int page, int size, String sort, int priceGt, int priceLte);

    /**
     * restful搜索接口
     * @param key
     * @return
     */
    String quickSearch(String key);
}
