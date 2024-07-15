package me.dio.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import me.dio.model.Product;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Product findById(Long id);

    Product save(Product product);

    void deleteById(Long id);
}
