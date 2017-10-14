package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 14.10.2017.
 */
public class Auto extends Car {

    private String engineType;
    private String kppType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getKppType() {
        return kppType;
    }

    public void setKppType(String kppType) {
        this.kppType = kppType;
    }
}
