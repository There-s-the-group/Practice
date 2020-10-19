package com.example.mimall.mi.mapper;

import com.example.mimall.mi.entity.front.SearchItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/19 08:36
 * @Description:
 */
@Mapper
public interface TbSearchMapper {
    List<SearchItem> search(@Param("key") String key,
                            @Param("orderCol") String orderCol,@Param("orderDir") String orderDir,
                            @Param("priceGt") int priceGt,@Param("priceLte") int priceLte);
}
