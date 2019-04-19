package com.BikeStore.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateProductController implements Initializable {

    private Stage prevStage;

    public void setPrevStage(Stage stage){
         this.prevStage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void gotoCreateCategory(ActionEvent event) throws IOException {
       Stage stage = new Stage();
       stage.setTitle("Shop Management");
       Pane myPane = null;
       myPane = FXMLLoader.load(getClass().getResource("createCategory.fxml"));
       Scene scene = new Scene(myPane);
       stage.setScene(scene);

       prevStage.close();

       stage.show();
    }

}