package com.BikeStore.Domain.Modal;

import com.BikeStore.Domain.Interfaces.Bike;

import java.util.Date;

public class BikeDefault implements Bike {
    private int bikeId;
    private String bikeBrand;
    private int bikeType;
    private double rimSize;
    private int numberOfGears;
    private Date dateLastTask;

    public BikeDefault(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, Date dateLastTask) {
        this.bikeId = bikeId;
        this.bikeBrand = bikeBrand;
        this.bikeType = bikeType;
        this.rimSize = rimSize;
        this.numberOfGears = numberOfGears;
        this.dateLastTask = dateLastTask;
    }

    @Override
    public int getBikeId() {
        return bikeId;
    }

    @Override
    public String getBikeBrand() {
        return bikeBrand;
    }

    @Override
    public int getBikeType() {
        return bikeType;
    }

    @Override
    public double getRimSize() {
        return rimSize;
    }

    @Override
    public int getNumberOfGears() {
        return numberOfGears;
    }

    @Override
    public Date getDateLastTask() {
        return dateLastTask;
    }
}
