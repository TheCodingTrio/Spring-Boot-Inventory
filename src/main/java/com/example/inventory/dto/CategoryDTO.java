package com.example.inventory.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryDTO {

    private String cid;
    private String name;
    private String quantityavilable;

    private String quantitysold;
}
