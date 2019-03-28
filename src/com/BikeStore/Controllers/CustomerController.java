package com.BikeStore.Controllers;

import com.BikeStore.Domain.Modal.Customer;
import com.BikeStore.Domain.Repository.CustomerRepository;

import java.util.ArrayList;

public class CustomerController {

    private CustomerRepository CustomerRepo = new CustomerRepository();

    public void printAllCustomers() {
        ArrayList listWithBikes = CustomerRepo.getAllCustomers();
        for (Object listWithBike : listWithBikes) {
            printCustomer((Customer) listWithBike);
        }
    }

    private void printCustomer(Customer customer) {
        System.out.println("CustomerId = " + customer.getCustomerId() + "FirstName = " + customer.getFirstName() + "LastName = " + customer.getLastName() + "Email = " + customer.getEmail() );
    }

}
