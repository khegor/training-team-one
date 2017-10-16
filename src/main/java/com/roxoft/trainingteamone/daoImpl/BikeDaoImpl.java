package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.BikeDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Bike;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class BikeDaoImpl implements BikeDao{


    public void createBike(Bike bike) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert("bikeMapper.createBike", bike);
        sqlSession.close();
    }

    public Bike getBikeById(long id) {

        SqlSession sqlSession = SessionFactory.getSession();
        Bike bike = sqlSession.selectOne("bikeMapper.getBikeById", id);
        sqlSession.close();
        return bike;
    }

    public List<Bike> getAllBikes() {

        SqlSession sqlSession = SessionFactory.getSession();
        List<Bike> bike = sqlSession.selectList("bikeMapper.getAllBikes");
        sqlSession.close();
        return bike;
    }

    public void updateBike(Bike bike) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.update("bikeMapper.updateBike", bike);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteBike(long id) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete("bikeMapper.deleteBike", id);
        sqlSession.commit();
        sqlSession.close();
    }
}
