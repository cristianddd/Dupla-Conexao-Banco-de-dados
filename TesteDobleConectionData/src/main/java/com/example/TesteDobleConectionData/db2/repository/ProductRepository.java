package com.example.TesteDobleConectionData.db2.repository;

import com.example.TesteDobleConectionData.db1.model.Car;
import com.example.TesteDobleConectionData.db2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByCarId(Integer id);

    List<Product> findByName(String name);


}
