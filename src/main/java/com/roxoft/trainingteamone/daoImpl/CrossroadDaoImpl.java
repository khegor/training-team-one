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
	final static String namespace = "crossroadMapper";
	
    public void createCrossroad(Crossroad crossroad) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.insert(namespace + ".createCrossroad", crossroad);
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
        	cr =  sqlSession.selectOne(namespace + ".getCrossroadById", id);
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
    		crlist = sqlSession.selectList(namespace + ".getAllCrossroads");
    	}
    	finally {
    		sqlSession.close();
    	}
    	return crlist;
    }

    public void updateCrossroad(Crossroad crossroad) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.update(namespace + ".updateCrossroad", crossroad);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteCrossroad(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete(namespace + ".deleteCrossroad", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }
}
