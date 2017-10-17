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
	final static String namespace = "roadMapper";
			
    public void createRoad(Road road) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.insert(namespace + ".createRoad", road);
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
        	road = sqlSession.selectOne(namespace + ".getRoadById", id);
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
    		roads = sqlSession.selectList(namespace + ".getAllRoads");
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
        	sqlSession.update(namespace + ".updateRoad", road);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteRoad(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete(namespace + ".deleteRoad", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }
}
