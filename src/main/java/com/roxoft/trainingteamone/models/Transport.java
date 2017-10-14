package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 12.10.2017.
 */
public abstract class Transport extends AbstractEntity {

    private String model;
    private double maxWeight;
    private AdditionalInformation additionalInformation;

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

    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
}
