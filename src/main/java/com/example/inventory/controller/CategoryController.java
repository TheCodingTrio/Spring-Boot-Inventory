package com.example.inventory.controller;


import com.example.inventory.dto.CategoryDTO;
import com.example.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/getStocks")
    public String getCategory(){
        return "categoryService";
    }

    @PostMapping("/saveCategory")
    public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.saveCategory(categoryDTO);
    }

    @PutMapping("updateCategory")
    public String updateCategory(){
        return "updated";
    }

    @DeleteMapping("/deleteCategory")
    public String deleteCategory(){
        return "deleted";
    }
}
