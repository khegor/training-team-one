package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.CarStationDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.CarStation;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Natalia on 15.10.2017.
 */
public class CarStationDaoImpl implements CarStationDao {

    public void createCarStation(CarStation carStation) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.insert("com.roxoft.trainingteamone.mappers.carstationMapper.createCarStation", carStation);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public CarStation getCarStationById(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        CarStation carstation;
        try{
        	carstation = sqlSession.selectOne("com.roxoft.trainingteamone.mappers.carstationMapper.getCarStationById", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
		return carstation;
    }
    
    public List<CarStation> getCarStationsByRoadId(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        List<CarStation> carstations;
        try{
        	carstations = sqlSession.selectList("com.roxoft.trainingteamone.mappers.carstationMapper.getCarStationsByRoadId", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
		return carstations;
    }

    public List<CarStation> getAllCarStations() {
    	SqlSession sqlSession = SessionFactory.getSession();
    	List<CarStation> carstations;
    	try {
    		carstations = sqlSession.selectList("com.roxoft.trainingteamone.mappers.carstationMapper.getAllCarStations");
    		sqlSession.commit();
    	}
    	finally {
    		sqlSession.close();
    	}
		return carstations;
    }

    public void updateCarStation(CarStation carStation) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.update("com.roxoft.trainingteamone.mappers.carstationMapper.updateCarStation", carStation);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteCarStation(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete("com.roxoft.trainingteamone.mappers.carstationMapper.deleteCarStation", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }
}
