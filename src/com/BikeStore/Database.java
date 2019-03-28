package com.BikeStore;

import java.sql.*;

public class Database {

    protected static Connection ConnectDB() {
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