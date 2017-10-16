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
    	}
		finally {
			sqlSession.close();
		}
    }

    public CarStation getCarStationById(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        try{
        	return sqlSession.selectOne("com.roxoft.trainingteamone.mappers.carstationMapper.getCarStationById", id);
    	}
		finally {
			sqlSession.close();
		}
    }
    
    public List<CarStation> getCarStationsByRoadId(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        try{
        	return sqlSession.selectList("com.roxoft.trainingteamone.mappers.carstationMapper.getCarStationsByRoadId", id);
    	}
		finally {
			sqlSession.close();
		}
    }

    public List<CarStation> getAllCarStations() {
    	SqlSession sqlSession = SessionFactory.getSession();
    	try {
    		return sqlSession.selectList("com.roxoft.trainingteamone.mappers.carstationMapper.getAllCarStations");
    	}
    	finally {
    		sqlSession.close();
    	}
    }

    public void updateCarStation(CarStation carStation) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.update("com.roxoft.trainingteamone.mappers.carstationMapper.updateCarStation", carStation);
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteCarStation(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete("com.roxoft.trainingteamone.mappers.carstationMapper.deleteCarStation", id);
    	}
		finally {
			sqlSession.close();
		}
    }
}
