package com.roxoft.trainingteamone.services;

import com.roxoft.trainingteamone.dao.BikeDao;
import com.roxoft.trainingteamone.daoImpl.BikeDaoImpl;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Bike;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class BikeService {

    BikeDao bikeDao = new BikeDaoImpl();

    public void createBike(Bike bike) {

    }

    public Bike getBikeById(long id) {
        return bikeDao.getBikeById(id);
    }

    public List<BikeDao> getAllBikes() {
        return null;
    }

    public void updateBike(BikeDao bikeDao) {

    }

    public void deleteBike(long id) {

    }
}
