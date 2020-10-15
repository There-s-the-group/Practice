package com.example.mimall.mi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mimall.mi.entity.TbPanel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/14 19:02
 * @Description:
 */
@Mapper
public interface TbPanelMapper extends BaseMapper<TbPanel> {
    List<TbPanel> getTbPanel();
}
