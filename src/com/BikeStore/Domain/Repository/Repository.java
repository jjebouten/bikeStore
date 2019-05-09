package com.BikeStore.Domain.Repository;

import com.BikeStore.Database;
import com.BikeStore.Domain.Modal.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Repository extends Database {

    String getAll(String table) {
        return "SELECT * FROM " + table;
    }

    int getMax(String table, String field) {

        String query = "SELECT MAX(" + field + ") FROM " + table;

        Connection conn = ConnectDB();
        int max = 0;

        try {
            java.sql.Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                max = rs.getInt(1);
            }
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return max;
    }

    String getAllByLeftJoin(String tableName, String joinOnTable, String Using) {
        return "SELECT * from " + tableName + " LEFT JOIN " + joinOnTable + " USING (" + Using + ")";
    }

    String getByField(String table, String field, int value) {
        return "SELECT * FROM '" + table + "' WHERE '" + field + "'='" + value + "'";
    }

}
