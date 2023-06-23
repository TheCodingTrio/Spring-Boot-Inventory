package com.example.inventory.controller;


import com.example.inventory.dto.CategoryDTO;
import com.example.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/getCategoriess")
    public List<CategoryDTO> getCategory(){
        return categoryService.getCategories();
    }

    @PostMapping("/saveCategory")
    public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO){   // CategoryDTO categoryDTO is the parameter of the saveCategory represents the data being sent in the request body.
        return categoryService.saveCategory(categoryDTO);
    }

    //@RequestBody annotation instructs Spring to map the JSON in the request body to this CategoryDTO object.

    @PutMapping("updateCategory")
    public CategoryDTO updateCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.updateCategory(categoryDTO);
    }

    @DeleteMapping("/deleteCategory")
    public boolean deleteCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.deleteCategory(categoryDTO);
    }


    @GetMapping("/getCategoryById/{catogoryID}")
    public CategoryDTO getCategoryByID(String categoryID){
        return categoryService.getCategoryByID(categoryID);
    }


    @GetMapping("/getCategoryByIdAndName/{categoryId}/{name}")
    public CategoryDTO getCategoryByIdAndName(String categoryId, String name){
        return categoryService.getCategotyByIdAndName(categoryId, name);
    }
}
