package com.BikeStore.Domain.Modal;

public class CityBike extends BikeDefault {
    private boolean bikeBags;

    public CityBike(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, int dateLastTask, boolean bikeBags) {
        super(bikeId, bikeBrand, bikeType, rimSize, numberOfGears, dateLastTask);
        this.bikeBags = bikeBags;
    }

    public boolean isBikeBags() {
        return bikeBags;
    }
}


