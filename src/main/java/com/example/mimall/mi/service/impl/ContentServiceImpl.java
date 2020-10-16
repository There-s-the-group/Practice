package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/14 18:34
 * @Description:
 */

import com.example.mimall.mi.entity.TbItem;
import com.example.mimall.mi.entity.TbItemDesc;
import com.example.mimall.mi.entity.TbPanel;
import com.example.mimall.mi.entity.TbPanelContent;
import com.example.mimall.mi.entity.front.ProductDet;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.mapper.TbItemDescMapper;
import com.example.mimall.mi.mapper.TbItemMapper;
import com.example.mimall.mi.mapper.TbPanelContentMapper;
import com.example.mimall.mi.mapper.TbPanelMapper;
import com.example.mimall.mi.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ContentServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class ContentServiceImpl extends BaseService implements ContentService {
    @Autowired
    TbPanelMapper tbPanelMapper;
    @Autowired
    TbPanelContentMapper tbPanelContentMapper;
    @Autowired
    TbItemMapper tbItemMapper;
    @Autowired
    TbItemDescMapper tbItemDescMapper;

    @Override
    public ResultVO getHome() {
        List<TbPanel> list = new ArrayList<>();
        //首先获取各个版块
        list = tbPanelMapper.getTbPanel();
        for(TbPanel tbPanel:list){
            //然后获取各个版块中的商品信息
            final List<TbPanelContent> list2 = tbPanelContentMapper.getTbPanelContentByPanelID(tbPanel.getId());
            tbPanel.setPanelContents(list2);
            for (TbPanelContent tb : list2){
                if (tb.getProductId()!= null){
                    final TbItem tbItem = tbItemMapper.selectByPrimaryKey(tb.getProductId());
                    tb.setProductName(tbItem.getTitle());
                    tb.setSubTitle(tbItem.getSellPoint());
                    tb.setSalePrice(tbItem.getPrice());
                }
            }
        }
        return result(list);
    }

    @Override
    public ResultVO getProductDet(Long id) {
        System.out.println(id);
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
        ProductDet productDet = new ProductDet();
        productDet.setProductId(id);
        productDet.setProductName(tbItem.getTitle());
        productDet.setSubTitle(tbItem.getSellPoint());
        if(tbItem.getLimitNum()!=null&&!tbItem.getLimitNum().toString().isEmpty()){
            productDet.setLimitNum(Long.valueOf(tbItem.getLimitNum()));
        }else{
            productDet.setLimitNum(Long.valueOf(tbItem.getNum()));
        }
        productDet.setSalePrice(tbItem.getPrice());
        TbItemDesc tbItemDesc=tbItemDescMapper.selectByPrimaryKey(id);
        productDet.setDetail(tbItemDesc.getItemDesc());

        if(tbItem.getImage()!=null&&!tbItem.getImage().isEmpty()){
            String images[]=tbItem.getImage().split(",");
            productDet.setProductImageBig(images[0]);
            List list=new ArrayList();
            for(int i=0;i<images.length;i++){
                list.add(images[i]);
            }
            productDet.setProductImageSmall(list);
        }
        return result(productDet);
    }

    @Override
    public ResultVO getPanelContentListByPanelId() {
        return null;
    }

    @Override
    public ResultVO getTbPanelContentById() {
        return null;
    }

    @Override
    public ResultVO getRecommendGoods() {
        return null;
    }

    @Override
    public ResultVO getAllProduct(int page, int size, String sort, Long cid, int priceGt, int priceLte) {
        return null;
    }

    @Override
    public List<TbPanelContent> getNavList() {
        return null;
    }
}
