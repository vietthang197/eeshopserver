package com.levietthang.eeshopserver.rest;

import com.levietthang.eeshopserver.entities.Category;
import com.levietthang.eeshopserver.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.levietthang.eeshopserver", "com.levietthang.eeshopserver.rest"})
@RequestMapping("/admin/api/category-product")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/get-all-category")
    public List<Category> findALlCategory() {
        return categoryService.findAllCategory();
    }
}
