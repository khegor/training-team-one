package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.Hotel;

import java.util.List;

/**
 * Created by Natalia on 15.10.2017.
 */
public interface HotelDao {

    void createHotel(Hotel hotel);
    Hotel getHotelById(long id);
    List<Hotel> getHotelsByRoadId(long id);
    List<Hotel> getAllHotels();
    void updateHotel(Hotel hotel);
    void deleteHotel(long id);
}
