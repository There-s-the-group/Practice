package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:46
 * @Description:
 */

import com.example.mimall.mi.entity.front.SearchResult;
import com.example.mimall.mi.service.SearchService;
import org.springframework.stereotype.Service;

/**
 * @ClassName SearchServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class SearchServiceImpl extends BaseService implements SearchService {
    @Override
    public SearchResult search(String keyword, int page, int size, String sort, int priceGt, int priceLte) {
        return null;
    }

    @Override
    public String quickSearch(String key) {
        return null;
    }
}
