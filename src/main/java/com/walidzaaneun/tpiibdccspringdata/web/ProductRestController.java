package com.walidzaaneun.tpiibdccspringdata.web;

import com.walidzaaneun.tpiibdccspringdata.entities.Product;
import com.walidzaaneun.tpiibdccspringdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> allProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id) {
        return productRepository.findById(id).orElseThrow(
                ()->new RuntimeException("product not found")
        );
    }

    @GetMapping("/products/search")
    public List<Product> findByKeyword(@RequestParam(name = "keyword", defaultValue = "") String keyword) {
        return productRepository.findByNameContains(keyword);
    }

}
