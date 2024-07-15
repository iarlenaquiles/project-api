package me.dio.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import me.dio.model.Category;

public interface CategoryService {
    Page<Category> findAll(Pageable pageable);
    Category findById(Long id);
    Category save(Category category);
    void deleteById(Long id);
}
