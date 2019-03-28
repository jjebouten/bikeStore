package com.BikeStore.Controllers;

import com.BikeStore.Domain.Modal.Bike;
import com.BikeStore.Domain.Repository.BikeRepository;

import java.util.ArrayList;

public class BikeController extends BikeRepository {

    private BikeRepository BikeRepo = new BikeRepository();

    public void printAllBikes() {
        ArrayList listWithBikes = BikeRepo.getAllBikes();
        for (Object listWithBike : listWithBikes) {
            printBike((Bike) listWithBike);
        }
    }

    private void printBike(Bike bike) {
        System.out.println("BikeId = " + bike.getBikeId() + " BikeBrand = " + bike.getBikeBrand() + " BikeType = " + bike.getBikeType() + " NumberOfGears = " + bike.getNumberOfGears() + " DateLastTask = " + bike.getDateLastTask() + " RimSize = " + bike.getRimSize());
    }


}
