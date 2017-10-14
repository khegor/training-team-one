package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 14.10.2017.
 */
public class Autobus extends AbstractEntity{

    private String model;
    private double maxWeight;
    private Transport transport;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
