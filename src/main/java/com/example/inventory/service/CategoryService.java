package com.example.inventory.service;


import com.example.inventory.dto.CategoryDTO;
import com.example.inventory.entity.Category;
import com.example.inventory.repo.CategoryRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
