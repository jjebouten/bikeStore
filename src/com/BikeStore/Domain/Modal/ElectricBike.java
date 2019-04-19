package com.BikeStore.Domain.Modal;

public class ElectricBike implements Bike {
    private int bikeId;
    private String bikeBrand;
    private int bikeType;
    private double rimSize;
    private int numberOfGears;
    private int dateLastTask;
    private double power;

    public ElectricBike(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, int dateLastTask, double power) {
        this.bikeId = bikeId;
        this.bikeBrand = bikeBrand;
        this.bikeType = bikeType;
        this.rimSize = rimSize;
        this.numberOfGears = numberOfGears;
        this.dateLastTask = dateLastTask;
        this.power = power;
    }

    public double getPower() {
        return power;
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
