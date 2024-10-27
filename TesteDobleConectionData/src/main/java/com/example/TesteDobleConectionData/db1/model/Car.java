package com.example.TesteDobleConectionData.db1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
@NamedNativeQueries(value = {
        @NamedNativeQuery(name = "Car.findByName", query = "select * from car where name = ?1", resultClass = Car.class),
        @NamedNativeQuery(name = "Car.findByCarId", query = "select * from car where carId = ?1", resultClass = Car.class) })
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;
    private String name;
    private int age;
}
