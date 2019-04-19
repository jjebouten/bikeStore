package com.BikeStore.Domain.Modal;

public class MountainBike implements Bike {
    private int bikeId;
    private String bikeBrand;
    private int bikeType;
    private double rimSize;
    private int numberOfGears;
    private int dateLastTask;
    private String suspension;

    public MountainBike(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, int dateLastTask, String suspension) {
        this.bikeId = bikeId;
        this.bikeBrand = bikeBrand;
        this.bikeType = bikeType;
        this.rimSize = rimSize;
        this.numberOfGears = numberOfGears;
        this.dateLastTask = dateLastTask;
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
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
