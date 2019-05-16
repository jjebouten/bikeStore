package com.BikeStore.Presentation.Customer;

import com.BikeStore.Logic.Customer.NewCustomerLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static com.FieldValidator.FieldValidator.isNullOrEmptyString;
import static com.FieldValidator.FieldValidator.isValidEmailAddress;
import static com.BikeStore.Presentation.ActionComponents.AlertLogic.alertError;
import static com.BikeStore.Presentation.ActionComponents.AlertLogic.alertSucces;

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

        String firstName = txtFirstname.getText();
        String lastName = txtLastname.getText();
        String address = txtAddress.getText();
        String city = txtCity.getText();
        String email = txtEmail.getText();

        if (validateFields(firstName, lastName, address, city, email)) {
           newCustomerLogic.createNewCustomer(firstName, lastName, address, city, email);
           alertSucces("Succes", "Customer succesfully created");
           txtFirstname.setText("");
           txtLastname.setText("");
           txtAddress.setText("");
           txtCity.setText("");
           txtEmail.setText("");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private boolean validateFields(String firstName, String lastName, String address, String city, String email) {
        if (isNullOrEmptyString(firstName, lastName, address, city)) {
            alertError("Error 1557489176", "Invalid input all fields are required");
            return false;
        }

        if (!isValidEmailAddress(email)) {
            alertError("Error 1557489696", "Invalid email");
            return false;
        }
        return true;
    }

}
