package com.example.mimall.mi.mapper;

import com.example.mimall.mi.entity.TbPanelContent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/14 19:30
 * @Description:
 */
@Mapper
public interface TbPanelContentMapper {
    List<TbPanelContent> getTbPanelContentByPanelID(int id);
}
