package com.levietthang.eeshopserver.services.Impl;

import com.levietthang.eeshopserver.entities.Category;
import com.levietthang.eeshopserver.repositories.repository.CategoryRepository;
import com.levietthang.eeshopserver.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }
}
