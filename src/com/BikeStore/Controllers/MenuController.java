package com.BikeStore.Controllers;

import com.github.fxrouter.FXRouter;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {

    @FXML AnchorPane content;

    private void setNewContent(Pane newContent) throws IOException {
        try {
            content.getChildren().clear();
            content.getChildren().add(newContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewAllBikes() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/allBikes.fxml"));
        Pane newContent = fxmlLoader.load();
        setNewContent(newContent);
    }

    @FXML
    private void viewAllCustomers() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/allCustomers.fxml"));
        Pane newContent = fxmlLoader.load();
        setNewContent(newContent);
    }

    @FXML
    private void viewAllTasks() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/allTasks.fxml"));
        Pane newContent = fxmlLoader.load();
        setNewContent(newContent);
    }

    @FXML
    private void viewNewBike() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/newBike.fxml"));
        Pane newContent = fxmlLoader.load();
        setNewContent(newContent);
    }

    @FXML
    private void viewNewCustomer() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/newCustomer.fxml"));
        Pane newContent = fxmlLoader.load();
        setNewContent(newContent);
    }

    @FXML
    private void viewNewTask() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/newTasks.fxml"));
        Pane newContent = fxmlLoader.load();
        setNewContent(newContent);
    }
}
