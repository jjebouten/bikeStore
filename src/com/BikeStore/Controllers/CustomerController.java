package com.BikeStore.Controllers;

import com.BikeStore.Domain.Modal.Customer;
import com.BikeStore.Domain.Repository.CustomerRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {

    private CustomerRepository CustomerRepo = new CustomerRepository();

    public void printAllCustomers() {
        ArrayList listWithCustomers = CustomerRepo.getAllCustomers();
        for (Object listWithCustomer : listWithCustomers) {
            printCustomer((Customer) listWithCustomer);
        }
    }

    private void printCustomer(Customer customer) {
        System.out.println("CustomerId = " + customer.getCustomerId() +
                " FirstName = " + customer.getFirstName() +
                " LastName = " + customer.getLastName() +
                " Address = " + customer.getAddress() +
                " City = " + customer.getCity() +
                " Email = " + customer.getEmail());
    }

    @FXML
    private TableView<Customer> tableView;
    @FXML
    private TableColumn<Customer, Integer> customerId;
    @FXML
    private TableColumn<Customer, String> firstName;
    @FXML
    private TableColumn<Customer, String> lastName;
    @FXML
    private TableColumn<Customer, String> address;
    @FXML
    private TableColumn<Customer, String> city;
    @FXML
    private TableColumn<Customer, String> email;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        customerId.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("customerId"));
        firstName.setCellValueFactory(new PropertyValueFactory<Customer, String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<Customer, String>("lastName"));
        address.setCellValueFactory(new PropertyValueFactory<Customer, String>("address"));
        city.setCellValueFactory(new PropertyValueFactory<Customer, String>("city"));
        email.setCellValueFactory(new PropertyValueFactory<Customer, String>("email"));

        tableView.getItems().setAll(parseCustomerList());

    }

    private List parseCustomerList() {
        return CustomerRepo.getAllCustomers();
    }

}
