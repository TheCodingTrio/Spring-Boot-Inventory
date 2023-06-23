package com.example.inventory.repo;

import com.example.inventory.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StockRepo extends JpaRepository<Stock, String> {

    @Query(value = "SELECT * FROM STOCK WHERE ID = ?1", nativeQuery = true)
    Stock getStockByID(String stockId);


    @Query(value = "SELECT * FROM STOCK WHERE ID = ?1 AND NAME = ?2",nativeQuery = true)
    Stock getStockByIDAndName(String stockId, String name);



}
