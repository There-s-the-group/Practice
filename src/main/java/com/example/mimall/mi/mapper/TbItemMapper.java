package com.example.mimall.mi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mimall.mi.entity.TbItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/15 09:50
 * @Description:
 */
@Mapper
public interface TbItemMapper extends BaseMapper<TbItem> {
    TbItem selectByPrimaryKey(Long id);
    List<TbItem> selectItemFront(@Param("cid") Long cid,
                                 @Param("orderCol") String orderCol,@Param("orderDir") String orderDir,
                                 @Param("priceGt") int priceGt,@Param("priceLte") int priceLte);
}
