package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.CarDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Car;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class CarDaoImpl {

    public void createCar(Car car) {

    }

    public Car getCarById(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Car car = sqlSession.selectOne("carMapper.getCarById", id);
        sqlSession.close();
        return car;
    }

    public List<Car> getAllCars() {
        return null;
    }

    public void updateCar(Car car) {

    }

    public void deleteCar(long id) {

    }
}
