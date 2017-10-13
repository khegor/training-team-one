package com.roxoft.trainingteamone.models;

import java.util.List;

/**
 * Created by Esenin on 12.10.2017.
 */
public class Crossroad extends AbstractEntity {

    private  String name;
    private List<Road> roads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }
}
