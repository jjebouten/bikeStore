package com.BikeStore;

import java.sql.*;

public class Database {

    public static void main(String[] args) {

        Connection conn = ConnectDB();

        try {
            String query = "SELECT * FROM Bikes";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int bikeId = rs.getInt("BikeId");
                String bikeBrand = rs.getString("BikeBrand");
                // print the results
                System.out.format("%s, %s\n", bikeId, bikeBrand);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public static Connection ConnectDB() {

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_bikestore", "root", "xxx");
                    // JOptionPane.showMessageDialog(null, "Connected to db");
            return conn;

        } catch (Exception e) {
            System.out.println("DB error");
            return null;
        }

    }
}