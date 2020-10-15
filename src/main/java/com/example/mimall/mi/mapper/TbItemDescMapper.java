package com.example.mimall.mi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mimall.mi.entity.TbItemDesc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbItemDescMapper extends BaseMapper<TbItemDesc> {
    TbItemDesc selectByPrimaryKey(Long itemId);
}
