package com.walidzaaneun.tpiibdccspringdata.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "PRODUCTS")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private double quantity;
}
