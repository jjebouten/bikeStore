package com.BikeStore.Domain.Repository;

import com.BikeStore.Domain.Modal.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerRepository extends Repository {

    public ArrayList getAllCustomers() {

        String query = getAll("Customers");

        Connection conn = ConnectDB();
        ArrayList<Customer> queryResult = new ArrayList<>();
        try {
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
                queryResult.add(customer);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return queryResult;
    }
}
