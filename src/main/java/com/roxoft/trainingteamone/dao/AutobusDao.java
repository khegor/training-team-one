package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.Autobus;

import java.util.List;

/**
 * Created by Esenin on 14.10.2017.
 */
public interface AutobusDao {

    void createAutobus(Autobus autobus);
    Autobus getAutobusById(long id);
    List<Autobus> getAllAutobuses();
    void updateAutobus(Autobus autobus);
    void deleteAutobus(long id);
}
