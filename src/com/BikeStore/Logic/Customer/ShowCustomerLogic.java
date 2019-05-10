package com.BikeStore.Logic;

import com.BikeStore.Data.Repository.Customer.CustomerRepository;
import com.BikeStore.Presentation.Customer.CustomerPresentation;

import java.util.List;

public class ShowCustomerLogic {

    private CustomerPresentation customerPresentation = new CustomerPresentation();
    CustomerRepository customerRepo = new CustomerRepository();

    public List parseCustomerList() {
        customerPresentation.initializeCustomerFields();
        return customerRepo.getAllCustomers();
    }

}
