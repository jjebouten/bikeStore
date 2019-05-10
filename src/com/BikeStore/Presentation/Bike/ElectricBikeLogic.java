package com.BikeStore.Presentation.Bike;

import com.BikeStore.Data.Modal.BikeDefault;
import com.BikeStore.Data.Repository.Bike.ElectricBikeRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ElectricBikeLogic extends BikeDefaultLogic implements Initializable {

    private ElectricBikeRepository electricBikeRepo = new ElectricBikeRepository();

    @FXML
    private TableView<BikeDefault> tableView;
    @FXML
    private TableColumn<BikeDefault, Double> power;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        initializeBikeDefaultFields();
        power.setCellValueFactory(new PropertyValueFactory<>("power"));
        tableView.getItems().setAll(parseCityBikeList());
    }

    private List parseCityBikeList() {
        return electricBikeRepo.getAllElectricBikes();
    }

//    private void printElectricBike(ElectricBike electricBike) {
//        System.out.println("BikeId = " + electricBike.getBikeId() + " BikeBrand = " + electricBike.getBikeBrand() + " BikeType = " + electricBike.getBikeType() + " NumberOfGears = " + electricBike.getNumberOfGears() + " DateLastTask = " + electricBike.getDateLastTask() + " RimSize = " + electricBike.getRimSize());
//        getAdditionalElectricBikeInfo(electricBike);
//    }
//
//    private void getAdditionalElectricBikeInfo(ElectricBike electricBike) {
//        System.out.println("BikePower = " + electricBike.getPower());
//    }
}
