package com.BikeStore;

import com.github.fxrouter.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application {

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXRouter.bind(this, primaryStage);
        FXRouter.when("bikes", "resources/bikes.fxml");
        FXRouter.when("home", "resources/home.fxml");
        FXRouter.goTo("home");                               // switch to "sample.fxml"
    }


    public static void main(String[] args) {
        launch(args);
    }

}