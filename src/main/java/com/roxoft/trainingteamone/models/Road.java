package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 12.10.2017.
 */
public class Road extends AbstractEntity {

    private String name;
    private Direction direction;
    private double dailyCarryingCapacity;
    private int hotelsNumber;
    private String hotelName;
    private int semaphoresNumber;


    public int getHotelsNumber() {
        return hotelsNumber;
    }

    public void setHotelsNumber(int hotelsNumber) {
        this.hotelsNumber = hotelsNumber;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getSemaphoresNumber() {
        return semaphoresNumber;
    }

    public void setSemaphoresNumber(int semaphoresNumber) {
        this.semaphoresNumber = semaphoresNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public double getDailyCarryingCapacity() {
        return dailyCarryingCapacity;
    }

    public void setDailyCarryingCapacity(double dailyCarryingCapacity) {
        this.dailyCarryingCapacity = dailyCarryingCapacity;
    }
}
