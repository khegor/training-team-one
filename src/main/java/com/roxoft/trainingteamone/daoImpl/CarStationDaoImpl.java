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
	final static String namespace = "carstationMapper";
	
    public void createCarStation(CarStation carStation) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.insert(namespace + ".createCarStation", carStation);
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
        	carstation = sqlSession.selectOne(namespace + ".getCarStationById", id);
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
        	carstations = sqlSession.selectList(namespace + ".getCarStationsByRoadId", id);
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
    		carstations = sqlSession.selectList(namespace + ".getAllCarStations");
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
        	sqlSession.update(namespace + ".updateCarStation", carStation);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteCarStation(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete(namespace + ".deleteCarStation", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }
}
