package org.elsys.common.dao;

import org.elsys.common.entity.Stock;

public interface StockDaoInterface {
    void insert(Stock stock);
    void update(Stock stock);
    void delete(long id);
    Stock findById(long id);
    Stock findByStockName(String name);
}
