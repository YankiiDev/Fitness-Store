package com.eafc.springbootbackend.services.product;

import com.eafc.springbootbackend.entities.product.ProductInfo;
import com.eafc.springbootbackend.entities.product.Stock;

import java.util.Collection;
import java.util.Optional;

public interface StockService {

    Optional<Stock> findStockById(int stockId);

    Collection<Stock> findStocksByProduct(ProductInfo productInfo);

    Collection<Stock> findAllStocks();

    void refillStocks(Collection<Stock> stocksToRefill);

    void saveStock(Stock stock);

    void deleteStock(int id);
}
