package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 12.10.2017.
 */
public abstract class Car extends AbstractEntity {

    private String model;
    private double maxWeigth;
    private String color;
    private int numberOfWheels;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxWeigth() {
        return maxWeigth;
    }

    public void setMaxWeigth(double maxWeigth) {
        this.maxWeigth = maxWeigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
