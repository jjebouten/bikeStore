package com.BikeStore.Logic;

import com.BikeStore.Data.Modal.Customer;
import com.BikeStore.Data.Repository.Customer.CustomerRepository;

public class NewCustomerLogic {

    private CustomerRepository CustomerRepo = new CustomerRepository();

    public void createNewCustomer(String firstName, String lastName, String address, String city, String email) {
        Customer newCustomer = new Customer(createNewCustomerId(), firstName, lastName, address, city, email);
        CustomerRepo.newCustomer(newCustomer);
    }

    private int createNewCustomerId() {
        Integer customerId = null;
        return customerId = (CustomerRepo.getMaxCustomerId() + 1);
    }
}
