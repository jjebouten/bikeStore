package com.BikeStore.Logic.View;

import com.BikeStore.Data.Modal.BikeDefault;
import com.BikeStore.Data.Modal.MountainBike;
import com.BikeStore.Data.Repository.Bike.MountainBikeRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MountainBikeLogic extends BikeDefaultLogic implements Initializable {

    private MountainBikeRepository mountainBikeRepo = new MountainBikeRepository();

    @FXML
    private TableView<MountainBike> tableView;
    @FXML
    private TableColumn<BikeDefault, String> suspension;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        initializeBikeDefaultFields();
        suspension.setCellValueFactory(new PropertyValueFactory<>("suspension"));
        tableView.getItems().setAll(parseMountainBikeList());
    }

    private List parseMountainBikeList() {
        return mountainBikeRepo.getAllMountainBikes();
    }

}
