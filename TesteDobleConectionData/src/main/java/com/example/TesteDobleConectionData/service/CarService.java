package com.example.TesteDobleConectionData.service;

import com.example.TesteDobleConectionData.db1.model.Car;
import com.example.TesteDobleConectionData.db1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Car saveProduct(Car car) {
        return carRepository.save(car);
    }

    public Car findById(Integer id){
        return carRepository.findByCarId(id);
    }

    public List<Car> findByName(String name){
        return carRepository.findByName(name);
    }
}
