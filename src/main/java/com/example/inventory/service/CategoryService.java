package com.example.inventory.service;


import com.example.inventory.dto.CategoryDTO;
import com.example.inventory.entity.Category;
import com.example.inventory.repo.CategoryRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    public CategoryDTO saveCategory(CategoryDTO categoryDTO){
        categoryRepo.save(modelMapper.map(categoryDTO, Category.class));
        return categoryDTO;
    }

    public CategoryDTO updateCategory(CategoryDTO categoryDTO){
        categoryRepo.save(modelMapper.map(categoryDTO, Category.class));
        return categoryDTO;
    }

    public boolean deleteCategory(CategoryDTO categoryDTO){
        categoryRepo.delete(modelMapper.map(categoryDTO, Category.class));
        return  true;
    }

    public List<CategoryDTO> getCategories(){
        List<Category>categoryList = categoryRepo.findAll();
        return modelMapper.map(categoryList, new TypeToken<List<CategoryDTO>>(){}.getType());
    }

    public CategoryDTO getCategoryByID(String categoryID){
        Category category = categoryRepo.getCategoryByID(categoryID);
        return modelMapper.map(category, CategoryDTO.class);
    }

    public CategoryDTO getCategotyByIdAndName(String categoryId, String name){
        Category category = categoryRepo.getCategoryByIdAndName(categoryId, name);
        return modelMapper.map(category, CategoryDTO.class);
    }

}
