package com.example.TesteDobleConectionData.db2.model;

import com.example.TesteDobleConectionData.db1.model.Car;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
@NamedNativeQueries(value = {
        @NamedNativeQuery(name = "Product.findByName", query = "select * from product where name = ?1", resultClass = Product.class),
        @NamedNativeQuery(name = "Product.findByCarId", query = "select * from product where productId = ?1", resultClass = Product.class) })

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String name;
    private int price;
}
