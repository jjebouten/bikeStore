package com.BikeStore.Data.Repository.Customer;

import com.BikeStore.Data.Modal.Customer;
import com.BikeStore.Data.Repository.QueryBuilder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerRepository extends QueryBuilder {

    static String Table = "Customers";

    public ArrayList getAllCustomers() {

        String query = getAll(Table);

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

    public void newCustomer(Customer customer) {
    }

    public int getMaxCustomerId() {
        return getMax(Table, "customerId");
    }
}
