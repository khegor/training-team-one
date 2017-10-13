package com.roxoft.trainingteamone.models;

import java.util.Date;

/**
 * Created by Esenin on 12.10.2017.
 */
public abstract class AbstractEntity {

    private long id;
    private Date createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
