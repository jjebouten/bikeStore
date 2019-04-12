package com.BikeStore.Controllers;

import com.BikeStore.Domain.Modal.MountainBike;
import com.BikeStore.Domain.Repository.MountainBikeRepository;

import java.util.ArrayList;

public class MountainBikeController extends MountainBikeRepository {

    private MountainBikeRepository mountainBikeRepo = new MountainBikeRepository();

    public void printAllMountainBikes() {
        ArrayList listOfMountainBikes = mountainBikeRepo.getAllMountainBikes();
        for (Object x : listOfMountainBikes) {
            printMountainBike((MountainBike) x);
        }
    }

    private void printMountainBike(MountainBike mountainBike) {
        System.out.println("BikeId = " + mountainBike.getBikeId() + " BikeBrand = " + mountainBike.getBikeBrand() + " BikeType = " + mountainBike.getBikeType() + " NumberOfGears = " + mountainBike.getNumberOfGears() + " DateLastTask = " + mountainBike.getDateLastTask() + " RimSize = " + mountainBike.getRimSize());
        getAdditionalMountainBikeInfo(mountainBike);
    }

    private void getAdditionalMountainBikeInfo(MountainBike mountainBike) {
        System.out.println("BikeBags = " + mountainBike.getSuspension());
    }

}
