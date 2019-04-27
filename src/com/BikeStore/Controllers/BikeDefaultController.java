package com.BikeStore.Controllers;

import com.BikeStore.Domain.Modal.BikeDefault;
import com.BikeStore.Domain.Repository.BikeDefaultRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import javax.sound.midi.Track;
import javax.xml.crypto.Data;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class BikeDefaultController implements Initializable {


    private BikeDefaultRepository BikeRepo = new BikeDefaultRepository();

    @FXML
    private TableView<BikeDefault> tableView;
    @FXML
    private TableColumn<BikeDefault, Integer> bikeId;
    @FXML
    private TableColumn<BikeDefault, String> bikeBrand;
    @FXML
    private TableColumn<BikeDefault, Integer> bikeType;
    @FXML
    private TableColumn<BikeDefault, Double> rimSize;
    @FXML
    private TableColumn<BikeDefault, Integer> numberOfGears;
    @FXML
    private TableColumn<BikeDefault, Date> dateLastTask;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        bikeId.setCellValueFactory(new PropertyValueFactory<>("bikeId"));
        bikeBrand.setCellValueFactory(new PropertyValueFactory<>("bikeBrand"));
        bikeType.setCellValueFactory(new PropertyValueFactory<>("bikeType"));
        rimSize.setCellValueFactory(new PropertyValueFactory<>("rimSize"));
        numberOfGears.setCellValueFactory(new PropertyValueFactory<>("numberOfGears"));
        dateLastTask.setCellValueFactory(new PropertyValueFactory<>("dateLastTask"));
        tableView.getItems().setAll(parseBikeList());

    }

    private List parseBikeList() {
        return BikeRepo.getAllBikeDefaults();
    }

}
