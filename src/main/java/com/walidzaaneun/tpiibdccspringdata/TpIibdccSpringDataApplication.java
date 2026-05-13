package com.walidzaaneun.tpiibdccspringdata;

import com.walidzaaneun.tpiibdccspringdata.entities.Product;
import com.walidzaaneun.tpiibdccspringdata.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TpIibdccSpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpIibdccSpringDataApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            Product p1 = Product.builder()
                    .name("Smartphone")
                    .price(1000)
                    .quantity(20)
                    .build();
            Product p2 = Product.builder()
                    .name("Speaker")
                    .price(300)
                    .quantity(17)
                    .build();
            Product p3 = Product.builder()
                    .name("TV")
                    .price(2000)
                    .quantity(35)
                    .build();

            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);

            List<Product> products = productRepository.findAll();
            products.forEach(
                    System.out::println
            );
        };
    }
}
