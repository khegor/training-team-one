package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.Road;

import java.util.List;

/**
 * Created by Natalia on 14.10.2017.
 */
public interface RoadDao {

    void createRoad(Road road);
    Road getRoadById(long id);
    List<Road> getAllRoads();
    void updateRoad(Road road);
    void deleteRoad(long id);
}
