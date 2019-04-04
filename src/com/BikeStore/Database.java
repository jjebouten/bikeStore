package com.BikeStore;

import java.sql.*;

public class Database {

    protected static Connection ConnectDB() {
        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_bikestore?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "beech");
                    // JOptionPane.showMessageDialog(null, "Connected to db");
            return conn;

        } catch (Exception e) {
            System.out.println("DB error");
            return null;
        }

    }
}