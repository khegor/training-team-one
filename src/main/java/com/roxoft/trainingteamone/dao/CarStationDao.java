package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.CarStation;

import java.util.List;

/**
 * Created by Natalia on 15.10.2017.
 */
public interface CarStationDao {

    void createCarStation(CarStation carStation);
    CarStation getCarStationById(long id);
    List<CarStation> getCarStationsByRoadId(long id);
    List<CarStation> getAllCarStations();
    void updateCarStation(CarStation carStation);
    void deleteCarStation(long id);
}
