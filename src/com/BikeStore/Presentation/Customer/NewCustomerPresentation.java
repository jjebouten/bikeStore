package com.BikeStore.Presentation.Customer;

import com.BikeStore.Data.Modal.Customer;
import com.BikeStore.Data.Repository.Customer.CustomerRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NewCustomerPresentation implements Initializable {

    private CustomerRepository CustomerRepo = new CustomerRepository();

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
    private void registerCustomer(ActionEvent event)
    {
        Integer customerId = null;
        String firstName = txtFirstname.getText();
        String lastName = txtLastname.getText();
        String address = txtAddress.getText();
        String city = txtCity.getText();
        String email = txtEmail.getText();

        customerId = (CustomerRepo.getMaxCustomerId() + 1);
        System.out.println(customerId);

        //Validation on email.

        Customer newCustomer = new Customer(customerId, firstName, lastName, address, city, email);

        CustomerRepo.newCustomer(newCustomer);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

}
