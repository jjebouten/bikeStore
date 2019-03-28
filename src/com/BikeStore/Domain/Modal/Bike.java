package com.BikeStore.Domain.Modal;

public class Bike {
    private int bikeId;
    private String bikeBrand;
    private int bikeType;
    private double rimSize;
    private int numberOfGears;
    private int dateLastTask;

    public Bike(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, int dateLastTask) {
        this.bikeId = bikeId;
        this.bikeBrand = bikeBrand;
        this.bikeType = bikeType;
        this.rimSize = rimSize;
        this.numberOfGears = numberOfGears;
        this.dateLastTask = dateLastTask;
    }

    public int getBikeId() {
        return bikeId;
    }

    public String getBikeBrand() {
        return bikeBrand;
    }

    public int getBikeType() {
        return bikeType;
    }

    public double getRimSize() {
        return rimSize;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public int getDateLastTask() {
        return dateLastTask;
    }
}


