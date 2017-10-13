package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 12.10.2017.
 */
public class Road extends AbstractEntity {

    private String name;
    private Direction direction;
    private double dailyCarryingCapacity;

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
