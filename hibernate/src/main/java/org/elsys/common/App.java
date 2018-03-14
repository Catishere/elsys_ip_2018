package org.elsys.common;

import org.elsys.common.entity.Stock;
import org.elsys.common.service.StockService;

public class App {
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        StockService stockService = new StockService();
        Stock stock = new Stock();
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        stockService.insert(stock);
    }
}
