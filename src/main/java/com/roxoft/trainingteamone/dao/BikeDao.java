package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.Bike;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public interface BikeDao {

    void createBike(Bike bike);
    Bike getBikeById(long id);
    List<Bike> getAllBikes();
    void updateBike(Bike bike);
    void deleteBike(long id);
}
