package com.roxoft.trainingteamone.models;

/**
 * Created by Esenin on 14.10.2017.
 */
public class Hotel extends AbstractEntity {

    private String name;
    private long roadId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public long getRoadId() {
		return roadId;
	}

	public void setRoadId(long roadId) {
		this.roadId = roadId;
	}
}
