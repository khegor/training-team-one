package com.roxoft.trainingteamone.services;

import java.util.List;
import java.util.stream.Stream;

import com.roxoft.trainingteamone.daoImpl.CarStationDaoImpl;
import com.roxoft.trainingteamone.daoImpl.HotelDaoImpl;
import com.roxoft.trainingteamone.daoImpl.RoadDaoImpl;
import com.roxoft.trainingteamone.models.CarStation;
import com.roxoft.trainingteamone.models.Hotel;
import com.roxoft.trainingteamone.models.Road;

/**
 * Created by Natalia on 15.10.2017.
 */
public class RoadService {
	private RoadDaoImpl roadDaoI;
	private HotelDaoImpl hotelDaoI;
	private CarStationDaoImpl carstationDaoI;


	public RoadService(){
		roadDaoI = new RoadDaoImpl();
		hotelDaoI = new HotelDaoImpl();
		carstationDaoI = new CarStationDaoImpl();
	}
	
	public void createRoad(Road road){		
		roadDaoI.createRoad(road);
		final long roadId = road.getId();
		List<Hotel> hotels = road.getHotels();
		hotels.stream().forEach((h) -> h.setRoadId(roadId));
		hotels.stream().forEach((h) -> hotelDaoI.createHotel(h));
		List<CarStation> cs = road.getCarStations();
		cs.stream().forEach((c) -> c.setRoadId(roadId));
		cs.stream().forEach((c) -> carstationDaoI.createCarStation(c));
	}
	
	public Road getRoad(int id){
		Road road = roadDaoI.getRoadById(id);
		List<Hotel> hotels = hotelDaoI.getHotelsByRoadId(id);
		List<CarStation> carstations = carstationDaoI.getCarStationsByRoadId(id);
		road.setHotels(hotels);
		road.setCarStations(carstations);
		return road;
	}
	
	public void updateRoad(Road road){
		roadDaoI.updateRoad(road);
	}
	
	public void deleteRoad(int id){
		roadDaoI.deleteRoad(id);
	}
}
