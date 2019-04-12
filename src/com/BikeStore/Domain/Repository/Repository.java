package com.BikeStore.Domain.Repository;

import com.BikeStore.Database;

public class Repository extends Database {

    public String getAll(String table) {
        return "SELECT * FROM '" + table + "'";
    }

    String getAllByLeftJoin(String tableName, String joinOnTable, String Using) {
        return "SELECT * from " + tableName + " LEFT JOIN " + joinOnTable + " USING (" + Using + ")";
    }

    public String getByField(String table, String field, int value) {
        return "SELECT * FROM '" + table + "' WHERE '" + field + "'='" + value + "'";
    }

}