package org.elsys.common.service;

import org.elsys.common.entity.Stock;
import org.elsys.common.dao.StockDao;

public class StockService {
    private static StockDao stockDAO;

    public StockService(){
        stockDAO = new StockDao();
    }
    public void update(Stock stock){
        stockDAO.openCurrentSessionWithTransaction();
        stockDAO.update(stock);
        stockDAO.closeCurrentSessionWithTransaction();
    }
    public void insert(Stock stock) {
        stockDAO.openCurrentSessionWithTransaction();
        stockDAO.insert(stock);
        stockDAO.closeCurrentSessionWithTransaction();
    }
    public Stock findById(long id){
        stockDAO.openCurrentSession();
        Stock stock = stockDAO.findById(id);
        stockDAO.closeCurrentSession();
        return stock;
    }

    public Stock findByStockname(String name){
        stockDAO.openCurrentSession();
        Stock stock = stockDAO.findByStockName(name);
        stockDAO.closeCurrentSession();
        return stock;
    }

    public void delete(long id){
        stockDAO.openCurrentSessionWithTransaction();
        stockDAO.delete(id);
        stockDAO.closeCurrentSessionWithTransaction();
    }
}
