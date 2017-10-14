package com.roxoft.trainingteamone.models;

import java.util.List;

/**
 * Created by Esenin on 12.10.2017.
 */
public class Road extends AbstractEntity {

    private String name;
    private double dailyCarryingCapacity;
    private Crossroad fromCrossroad;
    private Crossroad toCrossroad;
    private List<Hotel> hotels;
    private List<CarStation> carStations;
    private int semaphoresCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyCarryingCapacity() {
        return dailyCarryingCapacity;
    }

    public void setDailyCarryingCapacity(double dailyCarryingCapacity) {
        this.dailyCarryingCapacity = dailyCarryingCapacity;
    }

    public Crossroad getFromCrossroad() {
        return fromCrossroad;
    }

    public void setFromCrossroad(Crossroad fromCrossroad) {
        this.fromCrossroad = fromCrossroad;
    }

    public Crossroad getToCrossroad() {
        return toCrossroad;
    }

    public void setToCrossroad(Crossroad toCrossroad) {
        this.toCrossroad = toCrossroad;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<CarStation> getCarStations() {
        return carStations;
    }

    public void setCarStations(List<CarStation> carStations) {
        this.carStations = carStations;
    }

    public int getSemaphoresCount() {
        return semaphoresCount;
    }

    public void setSemaphoresCount(int semaphoresCount) {
        this.semaphoresCount = semaphoresCount;
    }

}
