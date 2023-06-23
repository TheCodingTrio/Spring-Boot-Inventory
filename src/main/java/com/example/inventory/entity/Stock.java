package com.example.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Stock {

    @Id

    private String id;
    private String name;
    private int quantity;
    private int costprice;
    private int sellingprice;
    private String supplier;


}
