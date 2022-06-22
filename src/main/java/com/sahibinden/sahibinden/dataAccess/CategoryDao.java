package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
