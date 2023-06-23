package com.example.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category {


    @Id
    private String cid;
    private String name;
    private String quantityavilable;

    private String quantitysold;


}
