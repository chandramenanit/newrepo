package com.summa.spring.repository;


import com.summa.spring.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {
    // Add custom query methods if needed
}
