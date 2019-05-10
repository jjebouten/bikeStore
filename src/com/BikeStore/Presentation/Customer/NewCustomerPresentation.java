package com.BikeStore.Presentation.Customer;

import com.BikeStore.Logic.Customer.NewCustomerLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NewCustomerPresentation implements Initializable {

    private NewCustomerLogic newCustomerLogic = new NewCustomerLogic();

    @FXML
    private TextField txtFirstname;
    @FXML
    private TextField txtLastname;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtEmail;

    //Method use the handle the different buttons' action.
    @FXML
    private void registerCustomer(ActionEvent event) {
        newCustomerLogic.createNewCustomer(txtFirstname.getText(), txtLastname.getText(), txtAddress.getText(), txtCity.getText(), txtEmail.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
