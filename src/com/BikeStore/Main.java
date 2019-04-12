package com.BikeStore;

import com.BikeStore.Controllers.CityBikeController;
import com.BikeStore.Controllers.ElectricBikeController;
import com.BikeStore.Controllers.MountainBikeController;

public class Main {

    public static void main(String[] args) {

//        CustomerController customerController = new CustomerController();
//        customerController.printAllCustomers();

        CityBikeController cityBikeController = new CityBikeController();
        ElectricBikeController electricBikeController = new ElectricBikeController();
        MountainBikeController mountainBikeController = new MountainBikeController();

        cityBikeController.printAllCityBikes();
        electricBikeController.printAllElectricBikes();
        mountainBikeController.printAllMountainBikes();

    }
}
