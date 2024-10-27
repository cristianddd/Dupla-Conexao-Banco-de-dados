package com.example.TesteDobleConectionData.service;

import com.example.TesteDobleConectionData.db1.model.Car;
import com.example.TesteDobleConectionData.db2.model.Product;
import com.example.TesteDobleConectionData.db2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product findById(Integer id){
        return productRepository.findByCarId(id);
    }

    public List<Product> findByName(String name){
        return productRepository.findByName(name);
    }

}
