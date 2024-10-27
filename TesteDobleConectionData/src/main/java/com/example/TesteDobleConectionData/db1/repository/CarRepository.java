package com.example.TesteDobleConectionData.db1.repository;

import com.example.TesteDobleConectionData.db1.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByCarId(Integer id);

    List<Car> findByName(String name);


}
