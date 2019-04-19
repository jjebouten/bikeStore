package com.BikeStore.Controllers;

import com.BikeStore.Domain.Modal.ElectricBike;
import com.BikeStore.Domain.Repository.ElectricBikeRepository;

import java.util.ArrayList;

public class ElectricBikeController extends ElectricBikeRepository {

    private ElectricBikeRepository electricBikeRepo = new ElectricBikeRepository();

    public void printAllElectricBikes() {
        ArrayList listOfElectricBikes = electricBikeRepo.getAllElectricBikes();
        for (Object x : listOfElectricBikes) {
            printElectricBike((ElectricBike) x);
        }
    }

    private void printElectricBike(ElectricBike electricBike) {
        System.out.println("BikeId = " + electricBike.getBikeId() + " BikeBrand = " + electricBike.getBikeBrand() + " BikeType = " + electricBike.getBikeType() + " NumberOfGears = " + electricBike.getNumberOfGears() + " DateLastTask = " + electricBike.getDateLastTask() + " RimSize = " + electricBike.getRimSize());
        getAdditionalElectricBikeInfo(electricBike);
    }

    private void getAdditionalElectricBikeInfo(ElectricBike electricBike) {
        System.out.println("BikePower = " + electricBike.getPower());
    }
}
