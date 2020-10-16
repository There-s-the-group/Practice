package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/16 09:30
 * @Description:
 */

import lombok.Data;

import java.util.List;

/**
 * @ClassName SearchResult
 * @Description TODO
 * @Author kotori
 */
@Data
public class SearchResult {
    private Long recordCount;

    private int totalPages;

    private List<SearchItem> itemList;
}
