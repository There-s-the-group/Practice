package com.example.mimall.mi.service.impl;

import com.example.mimall.mi.entity.TbPanel;
import com.example.mimall.mi.entity.TbPanelContent;
import com.example.mimall.mi.mapper.TbPanelContentMapper;
import com.example.mimall.mi.mapper.TbPanelMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: kotori
 * @Date: 2020/10/14 19:49
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContentServiceImplTest {
    @Autowired
    TbPanelMapper tbPanelMapper ;
    @Autowired
    TbPanelContentMapper tbPanelContentMapper;
    @Test
    public void getHome() {
        final List<TbPanel> panels = tbPanelMapper.getTbPanel();
        for(TbPanel tb : panels) {
            System.out.println(tb);
        }

    }
}