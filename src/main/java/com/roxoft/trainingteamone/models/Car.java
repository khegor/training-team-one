package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 12.10.2017.
 */
public class Car extends AbstractEntity {

    private String model;
    private double maxWeigth;

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
}
