package com.roxoft.trainingteamone.services;

import com.roxoft.trainingteamone.dao.AutobusDao;
import com.roxoft.trainingteamone.dao.CarDao;
import com.roxoft.trainingteamone.daoImpl.AutobusDaoImpl;
import com.roxoft.trainingteamone.daoImpl.CarDaoImpl;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Car;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class CarService {

    CarDao carDao = new CarDaoImpl();

    AdditionalInformationService additionalInformationService = new AdditionalInformationService();

    public Car createCar(Car car) {

        additionalInformationService.createAdditionalInformation(car.getAdditionalInformation());
        carDao.createCar(car);
        return car;
    }

    public Car getCarById(long id) {
        return carDao.getCarById(id);
    }

    public List<Car> getAllCars() {

        return carDao.getAllCars();
    }

    public void updateCar(Car car) {

        carDao.updateCar(car);
    }

    public void deleteCar(long id) {

        carDao.deleteCar(id);
    }
}
