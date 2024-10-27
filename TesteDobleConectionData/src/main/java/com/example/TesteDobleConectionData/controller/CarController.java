package com.example.TesteDobleConectionData.controller;

import com.example.TesteDobleConectionData.db1.model.Car;
import com.example.TesteDobleConectionData.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {


    @Autowired
    private CarService service;

    @PostMapping("/saveUser")
    public ResponseEntity<Car> saveUser(@RequestBody Car car) {
        Car car1 = service.saveProduct(car);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Car> findById(@PathVariable("id") Integer id) {
        Car car1 = service.findById(id);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<List<Car>> findByName(@PathVariable("name") String name) {
        List<Car> car1 = service.findByName(name);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }


}
