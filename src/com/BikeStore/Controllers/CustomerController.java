package com.BikeStore.Controllers;

import com.BikeStore.Domain.Modal.Customer;
import com.BikeStore.Domain.Repository.CustomerRepository;

import java.util.ArrayList;

public class CustomerController {

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

}
