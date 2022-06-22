package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.CategoryService;
import com.sahibinden.sahibinden.dataAccess.CategoryDao;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;

    @Autowired
    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
}
