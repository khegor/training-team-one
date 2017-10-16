package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.RoadDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Road;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Natalia on 14.10.2017.
 */
public class RoadDaoImpl implements RoadDao {

    public void createRoad(Road road) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.insert("com.roxoft.trainingteamone.mappers.roadMapper.createRoad", road);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public Road getRoadById(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Road road;
        try{
        	road = sqlSession.selectOne("com.roxoft.trainingteamone.mappers.roadMapper.getRoadById", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
		return road;
    }

    public List<Road> getAllRoads() {
    	SqlSession sqlSession = SessionFactory.getSession();
    	List<Road> roads;
    	try {
    		roads = sqlSession.selectList("com.roxoft.trainingteamone.mappers.roadMapper.getAllRoads");
        	sqlSession.commit();
    	}
    	finally {
    		sqlSession.close();
    	}
		return roads;
    }

    public void updateRoad(Road road) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.update("com.roxoft.trainingteamone.mappers.roadMapper.updateRoad", road);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteRoad(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete("com.roxoft.trainingteamone.mappers.roadMapper.deleteRoad", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }
}
