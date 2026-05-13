package com.walidzaaneun.tpiibdccspringdata.repository;

import com.walidzaaneun.tpiibdccspringdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
