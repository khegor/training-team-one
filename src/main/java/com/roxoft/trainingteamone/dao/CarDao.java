package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.Car;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public interface CarDao {

    void createCar(Car car);
    Car getCarById(long id);
    List<Car> getAllCars();
    void updateCar(Car car);
    void deleteCar(long id);
}
