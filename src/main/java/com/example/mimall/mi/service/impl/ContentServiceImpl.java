package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/14 18:34
 * @Description:
 */

import com.example.mimall.mi.entity.*;
import com.example.mimall.mi.entity.front.AllGoodsResult;
import com.example.mimall.mi.entity.front.ProductDet;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.mapper.TbItemDescMapper;
import com.example.mimall.mi.mapper.TbItemMapper;
import com.example.mimall.mi.mapper.TbPanelContentMapper;
import com.example.mimall.mi.mapper.TbPanelMapper;
import com.example.mimall.mi.service.ContentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

//    @Value("${HEADER_PANEL_ID}")
//    private int HEADER_PANEL_ID;

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
        AllGoodsResult allGoodsResult=new AllGoodsResult();
        List<Product> list=new ArrayList<>();
        if(page<=0) {
            page = 1;
        }
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
        List<TbItem> tbItemList = tbItemMapper.selectItemFront(cid,orderCol,orderDir,priceGt,priceLte);
        PageInfo<TbItem> pageInfo=new PageInfo<TbItem>(tbItemList);
        for(TbItem tbItem:tbItemList){
            Product product= DtoUtil.TbItem2Product(tbItem);
            list.add(product);
        }
        allGoodsResult.setData(list);
        allGoodsResult.setTotal((int) pageInfo.getTotal());
        return result(allGoodsResult);
    }

    @Override
    public List<TbPanelContent> getNavList() {
        List<TbPanelContent> list = new ArrayList<>();
        list = tbPanelContentMapper.selectByExample();
        return list;
    }
}
