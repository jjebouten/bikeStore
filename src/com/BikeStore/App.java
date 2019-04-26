package com.BikeStore;

import com.github.fxrouter.FXRouter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/home.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1024, 768));
        primaryStage.show();
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        FXRouter.bind(this, primaryStage);
//        FXRouter.when("BikeStore", "Resources/home.fxml");
//        FXRouter.goTo("BikeStore");
//    }


    public static void main(String[] args) {
        launch(args);
    }

}