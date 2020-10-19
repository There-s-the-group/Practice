package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:46
 * @Description:
 */

import com.example.mimall.mi.entity.front.SearchItem;
import com.example.mimall.mi.entity.front.SearchResult;
import com.example.mimall.mi.mapper.TbSearchMapper;
import com.example.mimall.mi.service.SearchService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SearchServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class SearchServiceImpl extends BaseService implements SearchService {
    @Autowired
    TbSearchMapper tbSearchMapper;
    @Override
    public SearchResult search(String keyword, int page, int size, String sort, int priceGt, int priceLte) {
        if(page<=0) {
            page = 1;
        }
        String key = "%"+keyword+"%";
        //判断条件
        String orderCol="created";
        String orderDir="desc";
        if(sort.equals("1")){
            orderCol="price";
            orderDir="asc";
        }else if(sort.equals("-1")){
            orderCol="price";
            orderDir="desc";
        }else{
            orderCol="created";
            orderDir="desc";
        }
        PageHelper.startPage(page,size);
        final List<SearchItem> search = tbSearchMapper.search(key, orderCol, orderDir, priceGt, priceLte);
        PageInfo<SearchItem> pageInfo = new PageInfo<SearchItem>(search);
        SearchResult searchResult = new SearchResult();
        searchResult.setItemList(search);
        searchResult.setRecordCount((long) pageInfo.getTotal());
        searchResult.setTotalPages(pageInfo.getPageNum());
        return searchResult;
    }

    @Override
    public String quickSearch(String key) {
        return null;
    }
}
