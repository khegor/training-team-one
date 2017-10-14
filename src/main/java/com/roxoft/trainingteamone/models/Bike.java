package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 14.10.2017.
 */
public class Bike extends AbstractEntity{

    private String model;
    private double maxWeigth;
    private Transport transport;

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

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
