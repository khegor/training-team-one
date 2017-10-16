package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.Crossroad;

import java.util.List;

/**
 * Created by Natalia on 15.10.2017.
 */
public interface CrossroadDao {

    void createCrossroad(Crossroad crossroad);
    Crossroad getCrossroadById(long id);
    List<Crossroad> getAllCrossroads();
    void updateCrossroad(Crossroad crossroad);
    void deleteCrossroad(long id);
}
