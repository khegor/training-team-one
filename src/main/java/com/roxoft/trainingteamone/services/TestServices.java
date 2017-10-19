package com.roxoft.trainingteamone.services;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.roxoft.trainingteamone.models.CarStation;
import com.roxoft.trainingteamone.models.Crossroad;
import com.roxoft.trainingteamone.models.Hotel;
import com.roxoft.trainingteamone.models.Road;

/**
 * Created by Natalia on 15.10.2017.
 */
public class TestServices {
	private final static Logger LOGGER = Logger.getLogger(TestServices.class);
	
    public static void main(String args[]){
    	
	    Crossroad c101 = new Crossroad();
	    c101.setName("c101");
	    
	    Crossroad c102 = new Crossroad();
	    c102.setName("c102");
	    
	    Crossroad c103 = new Crossroad();
	    c103.setName("c103");
	    
	    Crossroad c104 = new Crossroad();
	    c104.setName("c104");
	    
	    Crossroad c105 = new Crossroad();
	    c105.setName("c105");
	    
	    Hotel hotel1 = new Hotel();
	    hotel1.setName("hotel1");
	    Hotel hotel2 = new Hotel();
	    hotel2.setName("hotel2");
	    Hotel hotel3 = new Hotel();
	    hotel3.setName("hotel3");
	    Hotel hotel4 = new Hotel();
	    hotel4.setName("hotel4");
	    Hotel hotel5 = new Hotel();
	    hotel5.setName("hotel5");
	    Hotel hotel6 = new Hotel();
	    hotel6.setName("hotel6");
	    List<Hotel> listHotel1 = new ArrayList<Hotel>();
	    listHotel1.add(hotel1);
	    listHotel1.add(hotel2);
	    List<Hotel> listHotel2 = new ArrayList<Hotel>();
	    listHotel2.add(hotel3);
	    listHotel2.add(hotel4);
	    List<Hotel> listHotel3 = new ArrayList<Hotel>();
	    listHotel3.add(hotel5);
	    listHotel3.add(hotel6);
	    
	    CarStation carstation1 = new CarStation();
	    carstation1.setName("carstation1");
	    CarStation carstation2 = new CarStation();
	    carstation2.setName("carstation2");
	    CarStation carstation3 = new CarStation();
	    carstation3.setName("carstation3");
	    CarStation carstation4 = new CarStation();
	    carstation4.setName("carstation4");
	    CarStation carstation5 = new CarStation();
	    carstation5.setName("carstation5");
	    CarStation carstation6 = new CarStation();
	    carstation6.setName("carstation6");
	    List<CarStation> listCarStation1 = new ArrayList<CarStation>();
	    listCarStation1.add(carstation1);
	    listCarStation1.add(carstation2);
	    List<CarStation> listCarStation2 = new ArrayList<CarStation>();
	    listCarStation2.add(carstation3);
	    listCarStation2.add(carstation4);
	    List<CarStation> listCarStation3 = new ArrayList<CarStation>();
	    listCarStation3.add(carstation5);
	    listCarStation3.add(carstation6);
	    
	    CrossroadService crs = new CrossroadService();
	    crs.createCrossroad(c101);
	    crs.createCrossroad(c102);
	    crs.createCrossroad(c103);
	    crs.createCrossroad(c104);
	    crs.createCrossroad(c105);
//	    System.out.println(crs.getCrossroad(25).getName());
//	    crs.updateCrossroad(c103);
//	    crs.deleteCrossroad(23);
//	    LOGGER.info(crs.getAllCrossroads());
	    
	    Road road1 = new Road();
	    road1.setName("road1");
	    road1.setDailyCarryingCapacity(60);
	    road1.setSemaphoresCount(20);
	    road1.setHotels(listHotel1);
	    road1.setCarStations(listCarStation1);
	    road1.setFromCrossroad(c101);
	    road1.setToCrossroad(c102);
	    
	    Road road2 = new Road();
	    road2.setName("road2");
	    road2.setDailyCarryingCapacity(30);
	    road2.setSemaphoresCount(10);
	    road2.setHotels(listHotel2);
	    road2.setCarStations(listCarStation2);
	    road2.setFromCrossroad(c103);
	    road2.setToCrossroad(c104);
	    
	    Road road3 = new Road();
	    road3.setName("road3");
	    road3.setDailyCarryingCapacity(30);
	    road3.setSemaphoresCount(10);
	    road3.setHotels(listHotel3);
	    road3.setCarStations(listCarStation3);
	    road3.setFromCrossroad(c103);
	    road3.setToCrossroad(c105);
	    
	    RoadService rs = new RoadService();
	    rs.createRoad(road1);
	    rs.createRoad(road2);
	    rs.createRoad(road3);
//	    Road rd = rs.getRoad(2);
//	    System.out.println(rd.getName().toString());
//	    System.out.println(rd.getHotels().toString());
//	    System.out.println(rd.getFromCrossroad().toString());

    }
}
