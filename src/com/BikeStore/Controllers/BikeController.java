package com.BikeStore.Controllers;

import com.BikeStore.Domain.Repository.BikeRepository;

public class BikeController extends BikeRepository {

//    private BikeRepository BikeRepo = new BikeRepository();
//
//    public void printAllBikes() {
//        ArrayList listWithBikes = BikeRepo.getAllBikes();
//        for (Object listWithBike : listWithBikes) {
//            printBike((Bike) listWithBike);
//        }
//    }
//
//    public void printBike() {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter bike Id");
//
//        int bikeId = myObj.nextInt();
//
//        ArrayList result = BikeRepo.getBikeById(bikeId);
//        for (Object listWithBike : result) {
//            printBike((Bike) listWithBike);
//        }
//    }
//
//    private void printBike(Bike bike) {
//        System.out.println("BikeId = " + bike.getBikeId() + " BikeBrand = " + bike.getBikeBrand() + " BikeType = " + bike.getBikeType() + " NumberOfGears = " + bike.getNumberOfGears() + " DateLastTask = " + bike.getDateLastTask() + " RimSize = " + bike.getRimSize());
//        getAdditionalInfoByType(bike.getBikeId(), bike.getBikeType());
//    }

//    private void getAdditionalInfoByType(int bikeId, int bikeType) {
//        String tablePrefix = "Bike_Type_";
//        String tableName;
//
//        switch (bikeType) {
//            case 1:
//                tableName = "City";
//                System.out.println(tablePrefix+tableName);
//                BikeRepo.getAdditionalBikeInfoForType(tablePrefix+tableName, bikeId);
//                break;
//            case 2:
//                tableName = "Electric";
//                System.out.println(tablePrefix+tableName);
//                BikeRepo.getAdditionalBikeInfoForType(tablePrefix+tableName, bikeId);
//                break;
//            case 3:
//                tableName = "Mountain";
//                System.out.println(tablePrefix+tableName);
//                BikeRepo.getAdditionalBikeInfoForType(tablePrefix+tableName, bikeId);
//                break;
//            default:
//                System.out.println("No correct or missing bikeType");
//        }
//    }
}
