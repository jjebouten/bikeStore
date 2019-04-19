package com.BikeStore.Controllers;


import com.BikeStore.Domain.Modal.CityBike;
import com.BikeStore.Domain.Repository.CityBikeRepository;

import java.util.ArrayList;

public class CityBikeController extends CityBikeRepository {

    private CityBikeRepository cityBikeRepo = new CityBikeRepository();

    public void printAllCityBikes() {
        ArrayList listOfCityBikes = cityBikeRepo.getAllCityBikes();
        for (Object x : listOfCityBikes) {
            printCityBike((CityBike) x);
        }
    }

    private void printCityBike(CityBike cityBike) {
        System.out.println("BikeId = " + cityBike.getBikeId() + " BikeBrand = " + cityBike.getBikeBrand() + " BikeType = " + cityBike.getBikeType() + " NumberOfGears = " + cityBike.getNumberOfGears() + " DateLastTask = " + cityBike.getDateLastTask() + " RimSize = " + cityBike.getRimSize());
        getAdditionalCityBikeInfo(cityBike);
    }

    private void getAdditionalCityBikeInfo(CityBike cityBike) {
        System.out.println("BikeBags = " + cityBike.isBikeBags());
    }

}
