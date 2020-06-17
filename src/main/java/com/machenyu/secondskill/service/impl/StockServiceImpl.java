package com.machenyu.secondskill.service.impl;

import com.machenyu.secondskill.dao.StockMapper;
import com.machenyu.secondskill.pojo.Stock;
import com.machenyu.secondskill.service.api.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "StockService")
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Override
    public int getStockCount(int id) {
        Stock stock = stockMapper.selectByPrimaryKey(id);
        return stock.getCount();
    }

    @Override
    public Stock getStockById(int id) {

        return stockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStockById(Stock stock) {

        return stockMapper.updateByPrimaryKeySelective(stock);
    }

    @Override
    public int updateStockByOptimistic(Stock stock) {

        return stockMapper.updateByOptimistic(stock);
    }

    @Override
    public int initDBBefore() {

        return stockMapper.initDBBefore();
    }
}
