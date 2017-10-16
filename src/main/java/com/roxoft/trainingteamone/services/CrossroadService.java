package com.roxoft.trainingteamone.services;

import java.util.List;

import com.roxoft.trainingteamone.daoImpl.CrossroadDaoImpl;
import com.roxoft.trainingteamone.models.Crossroad;

/**
 * Created by Natalia on 15.10.2017.
 */
public class CrossroadService {
	private CrossroadDaoImpl crossroadDaoI;
	
	public CrossroadService(){
		crossroadDaoI = new CrossroadDaoImpl();
	}
	
	public void createCrossroad(Crossroad crossroad){		
		crossroadDaoI.createCrossroad(crossroad);
	}
	
	public Crossroad getCrossroad(int id){
		Crossroad crossroad = crossroadDaoI.getCrossroadById(id);
		return crossroad;
	}
	
	public List<Crossroad> getAllCrossroads(){
		List<Crossroad> crossroad = crossroadDaoI.getAllCrossroads();
		return crossroad;
	}
	
	public void updateCrossroad(Crossroad crossroad){
		crossroadDaoI.updateCrossroad(crossroad);
	}
	
	public void deleteCrossroad(int id){
		crossroadDaoI.deleteCrossroad(id);
	}
}
