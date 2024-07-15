package me.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
