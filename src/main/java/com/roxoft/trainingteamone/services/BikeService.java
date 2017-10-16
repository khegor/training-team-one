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
    AdditionalInformationService additionalInformationService = new AdditionalInformationService();

    public Bike createBike(Bike bike) {

        additionalInformationService.createAdditionalInformation(bike.getAdditionalInformation());
        bikeDao.createBike(bike);
        return bike;
    }

    public Bike getBikeById(long id) {
        return bikeDao.getBikeById(id);
    }

    public List<Bike> getAllBikes() {
        return bikeDao.getAllBikes();
    }

    public void updateBike(Bike bike) {

        bikeDao.updateBike(bike);
    }

    public void deleteBike(long id) {

        bikeDao.deleteBike(id);
    }
}
