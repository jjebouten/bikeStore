//package com.BikeStore.Logic.Bike;
//
//import com.BikeStore.Data.Modal.BikeDefault;
//import com.BikeStore.Data.Repository.Bike.BikeDefaultQueryBuilder;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//import java.net.URL;
//import java.util.Date;
//import java.util.List;
//import java.util.ResourceBundle;
//
//public class BikeDefaultLogic implements Initializable {
//
//
//    private BikeDefaultQueryBuilder BikeRepo = new BikeDefaultQueryBuilder();
//
//    @FXML
//    private TableView<BikeDefault> tableView;
//    @FXML
//    private TableColumn<BikeDefault, Integer> bikeId;
//    @FXML
//    private TableColumn<BikeDefault, String> bikeBrand;
//    @FXML
//    private TableColumn<BikeDefault, Integer> bikeType;
//    @FXML
//    private TableColumn<BikeDefault, Double> rimSize;
//    @FXML
//    private TableColumn<BikeDefault, Integer> numberOfGears;
//    @FXML
//    private TableColumn<BikeDefault, Date> dateLastTask;
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//        bikeId.setCellValueFactory(new PropertyValueFactory<>("bikeId"));
//        bikeBrand.setCellValueFactory(new PropertyValueFactory<>("bikeBrand"));
//        bikeType.setCellValueFactory(new PropertyValueFactory<>("bikeType"));
//        rimSize.setCellValueFactory(new PropertyValueFactory<>("rimSize"));
//        numberOfGears.setCellValueFactory(new PropertyValueFactory<>("numberOfGears"));
//        dateLastTask.setCellValueFactory(new PropertyValueFactory<>("dateLastTask"));
//        tableView.getItems().setAll(parseBikeList());
//
//    }
//
//    private List parseBikeList() {
//        return BikeRepo.getAllBikeDefaults();
//    }
//
//}
