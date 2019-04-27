package com.BikeStore.Domain.Interfaces;

import java.util.Date;

public interface Bike {

    int getBikeId();

    String getBikeBrand();

    int getBikeType();

    double getRimSize();

    int getNumberOfGears();

    Date getDateLastTask();
}


