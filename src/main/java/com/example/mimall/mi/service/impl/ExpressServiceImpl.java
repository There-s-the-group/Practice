package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 09:02
 * @Description:
 */

import com.example.mimall.mi.entity.TbExpress;
import com.example.mimall.mi.service.ExpressService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ExpressServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class ExpressServiceImpl extends BaseService implements ExpressService {
    @Override
    public List<TbExpress> getExpressList() {
        return null;
    }

    @Override
    public int addExpress(TbExpress tbExpress) {
        return 0;
    }

    @Override
    public int updateExpress(TbExpress tbExpress) {
        return 0;
    }

    @Override
    public int delExpress(int id) {
        return 0;
    }
}
