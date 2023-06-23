package com.example.inventory.repo;

import com.example.inventory.dto.CategoryDTO;
import com.example.inventory.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepo extends JpaRepository<Category, String> {


    @Query(value = "SELECT * FROM CATEGORY WHERE CID = ?1", nativeQuery = true)
    Category getCategoryByID(String categoryID);



    @Query(value  = "SELECT * FROM CATEGORY WHERE CID = ?1 AND NAME = ?2", nativeQuery = true)
    Category getCategoryByIdAndName(String categoryId, String name);
}
