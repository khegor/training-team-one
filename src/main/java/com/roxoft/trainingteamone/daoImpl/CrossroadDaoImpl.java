package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.CrossroadDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Crossroad;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natalia on 15.10.2017.
 */
public class CrossroadDaoImpl implements CrossroadDao {

    public void createCrossroad(Crossroad crossroad) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.insert("com.roxoft.trainingteamone.mappers.crossroadMapper.createCrossroad", crossroad);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public Crossroad getCrossroadById(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Crossroad cr = new Crossroad();
        try{
        	cr =  sqlSession.selectOne("com.roxoft.trainingteamone.mappers.crossroadMapper.getCrossroadById", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
        return cr;
    }

    public List<Crossroad> getAllCrossroads() {
    	SqlSession sqlSession = SessionFactory.getSession();
    	List<Crossroad> crlist = new ArrayList<Crossroad>();
    	try {
    		crlist = sqlSession.selectList("com.roxoft.trainingteamone.mappers.crossroadMapper.getAllCrossroads");
    	}
    	finally {
    		sqlSession.close();
    	}
    	return crlist;
    }

    public void updateCrossroad(Crossroad crossroad) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.update("com.roxoft.trainingteamone.mappers.crossroadMapper.updateCrossroad", crossroad);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteCrossroad(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete("com.roxoft.trainingteamone.mappers.crossroadMapper.deleteCrossroad", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }
}
