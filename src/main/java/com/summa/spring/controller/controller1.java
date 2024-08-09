package com.summa.spring.controller;

import com.summa.spring.entity.product;
import com.summa.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class controller1 {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<product> addProduct(@RequestBody product product) {
        product savedProduct = productService.saveProduct(product);
        return ResponseEntity.ok(savedProduct);
    }
}
