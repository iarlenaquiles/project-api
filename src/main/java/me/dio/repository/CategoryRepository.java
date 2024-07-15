package me.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}