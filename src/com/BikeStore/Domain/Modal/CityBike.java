package com.BikeStore.Domain.Modal;

public class CityBike implements Bike {
    private int bikeId;
    private String bikeBrand;
    private int bikeType;
    private double rimSize;
    private int numberOfGears;
    private int dateLastTask;
    private boolean bikeBags;

    public CityBike(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, int dateLastTask, boolean bikeBags) {
        this.bikeId = bikeId;
        this.bikeBrand = bikeBrand;
        this.bikeType = bikeType;
        this.rimSize = rimSize;
        this.numberOfGears = numberOfGears;
        this.dateLastTask = dateLastTask;
        this.bikeBags = bikeBags;
    }

    public boolean isBikeBags() {
        return bikeBags;
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
    public int getDateLastTask() {
        return dateLastTask;
    }
}


