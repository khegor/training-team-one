package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.HotelDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Hotel;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Natalia on 15.10.2017.
 */
public class HotelDaoImpl implements HotelDao {

    public void createHotel(Hotel hotel) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.insert("com.roxoft.trainingteamone.mappers.hotelMapper.createHotel", hotel);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public Hotel getHotelById(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        Hotel hotel;
        try{
        	hotel = sqlSession.selectOne("com.roxoft.trainingteamone.mappers.hotelMapper.getHotelById", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
		return hotel;
    }
    
    public List<Hotel> getHotelsByRoadId(long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Hotel> hotels;
        try{
        	hotels = sqlSession.selectList("com.roxoft.trainingteamone.mappers.hotelMapper.getHotelsByRoadId", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
		return hotels;
    }
    
    public List<Hotel> getAllHotels() {
    	SqlSession sqlSession = SessionFactory.getSession();
    	List<Hotel> hotels;
    	try {
    		hotels = sqlSession.selectList("com.roxoft.trainingteamone.mappers.hotelMapper.getAllHotels");
        	sqlSession.commit();
    	}
    	finally {
    		sqlSession.close();
    	}
    	return hotels;
    }

    public void updateHotel(Hotel hotel) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.update("com.roxoft.trainingteamone.mappers.hotelMapper.updateHotel", hotel);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }

    public void deleteHotel(long id) {
    	SqlSession sqlSession = SessionFactory.getSession();
        try{
        	sqlSession.delete("com.roxoft.trainingteamone.mappers.hotelMapper.deleteHotel", id);
        	sqlSession.commit();
    	}
		finally {
			sqlSession.close();
		}
    }
}
