package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 12.10.2017.
 */
public class Road extends AbstractEntity {

    private String name;
    private double dailyCarryingCapacity;
    private Crossroad fromCrossroad;
    private Crossroad toCrossroad;
    private int hotelsCount;
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

    public int getHotelsCount() {
        return hotelsCount;
    }

    public void setHotelsCount(int hotelsCount) {
        this.hotelsCount = hotelsCount;
    }

    public int getSemaphoresCount() {
        return semaphoresCount;
    }

    public void setSemaphoresCount(int semaphoresCount) {
        this.semaphoresCount = semaphoresCount;
    }

}
