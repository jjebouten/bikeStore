package com.BikeStore.Data.Repository;

import java.sql.ResultSet;

public interface QueryBuilderInterface {

    String getAll(String table);

    int getMax(String table, String field);

}
