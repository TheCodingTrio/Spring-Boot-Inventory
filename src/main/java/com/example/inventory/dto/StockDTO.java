package com.example.inventory.dto;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockDTO {

    private String id;
    private String name;
    private int quantity;
    private int costprice;
    private int sellingprice;
    private String supplier;
}
