package com.BikeStore.Data.Modal;

import java.util.Date;

public class CityBike extends BikeDefault {
    private boolean bikeBags;

    public CityBike(int bikeId, String bikeBrand, int bikeType, double rimSize, int numberOfGears, Date dateLastTask, boolean bikeBags) {
        super(bikeId, bikeBrand, bikeType, rimSize, numberOfGears, dateLastTask);
        this.bikeBags = bikeBags;
    }

    public boolean isBikeBags() {
        return bikeBags;
    }
}


