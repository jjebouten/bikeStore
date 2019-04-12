package com.BikeStore.Domain.Modal;

public class MountainBike extends Bike {
    private String suspension;

    public MountainBike(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, int dateLastTask, String suspension) {
        super(bikeId, bikeBrand, bikeType, rimSize, numberOfGears, dateLastTask);
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }
}
