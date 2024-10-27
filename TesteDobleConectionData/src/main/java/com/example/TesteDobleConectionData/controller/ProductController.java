package com.example.TesteDobleConectionData.controller;

import com.example.TesteDobleConectionData.db1.model.Car;
import com.example.TesteDobleConectionData.db2.model.Product;
import com.example.TesteDobleConectionData.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("saveProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        Product product1 = productService.saveProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.OK);
    }


    @GetMapping("/findById/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Integer id) {
        Product car1 = productService.findById(id);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<List<Product>> findByName(@PathVariable("name") String name) {
        List<Product> car1 = productService.findByName(name);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

}
