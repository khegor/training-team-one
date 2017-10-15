package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.Bike;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public interface BikeDao {

    void createBike(Bike bike);
    BikeDao getBikeById(long id);
    List<BikeDao> getAllBikes();
    void updateBike(BikeDao bikeDao);
    void deleteBike(long id);
}
