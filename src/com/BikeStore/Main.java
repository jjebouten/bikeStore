package com.BikeStore;

import com.BikeStore.Controllers.BikeController;
import com.BikeStore.Controllers.CustomerController;

public class Main {

    public static void main(String[] args) {

        BikeController bikeController = new BikeController();
        CustomerController customerController = new CustomerController();

        bikeController.printAllBikes();
        customerController.printAllCustomers();



    }
}
