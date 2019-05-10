package com.BikeStore.Presentation.View.Bike;


import com.BikeStore.Data.Modal.BikeDefault;
import com.BikeStore.Data.Repository.Bike.CityBikeRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CityBikeLogic extends BikeDefaultLogic implements Initializable {

    private CityBikeRepository cityBikeRepo = new CityBikeRepository();

    @FXML
    private TableView<BikeDefault> tableView;
    @FXML
    private TableColumn<BikeDefault, Boolean> bikeBags;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        initializeBikeDefaultFields();
        bikeBags.setCellValueFactory(new PropertyValueFactory<>("bikeBags"));
        tableView.getItems().setAll(parseCityBikeList());
    }

    private List parseCityBikeList() {
        return cityBikeRepo.getAllCityBikes();
    }

//    private void printCityBike(CityBike cityBike) {
//        System.out.println("BikeId = " + cityBike.getBikeId() + " BikeBrand = " + cityBike.getBikeBrand() + " BikeType = " + cityBike.getBikeType() + " NumberOfGears = " + cityBike.getNumberOfGears() + " DateLastTask = " + cityBike.getDateLastTask() + " RimSize = " + cityBike.getRimSize());
//        getAdditionalCityBikeInfo(cityBike);
//    }
//
//    private void getAdditionalCityBikeInfo(CityBike cityBike) {
//        System.out.println("BikeBags = " + cityBike.isBikeBags());
//    }

}
