package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.BikeDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Bike;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class BikeDaoImpl {

    public void createBike(Bike bike) {

    }

    public Bike getBikeById(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Bike bike = sqlSession.selectOne("bikeMapper.getBikeById", id);
        sqlSession.close();
        return bike;
    }

    public List<Bike> getAllBikes() {
        return null;
    }

    public void updateBike(Bike bike) {

    }

    public void deleteBike(long id) {

    }
}
