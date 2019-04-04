package com.BikeStore.Domain.Repository;

import com.BikeStore.Database;
import com.BikeStore.Domain.Modal.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerRepository extends Database {

    public ArrayList getAllCustomers() {

        Connection conn = ConnectDB();
        ArrayList<Customer> CustomerList = new ArrayList<>();

        try {
            String query = "SELECT * FROM Customers";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet result = st.executeQuery(query);

            // iterate through the java resultset
            while (result.next()) {
                Customer customer = new Customer(result.getInt("CustomerId"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("Address"),
                        result.getString("City"),
                        result.getString("Email"));
                CustomerList.add(customer);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return CustomerList;
    }

}
