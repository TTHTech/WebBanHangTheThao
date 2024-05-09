package org.example.test.repository;

import java.util.List;

import org.example.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductById(Long id);

    void deleteProductById(Long id);

    List<Product> findProductsByCategoryId(Long id);

}
