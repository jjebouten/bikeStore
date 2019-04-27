package com.BikeStore.Domain.Repository;

import com.BikeStore.Domain.Modal.CityBike;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CityBikeRepository extends Repository {

    public ArrayList getAllCityBikes() {

        String query = getAll("Bikes");

        Connection conn = ConnectDB();
        ArrayList<CityBike> queryResult = new ArrayList<>();
        try {
            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet result = st.executeQuery(query);

            // iterate through the java resultset
            while (result.next()) {
                CityBike cityBike = new CityBike(result.getInt("BikeId"),
                        result.getString("BikeBrand"),
                        result.getInt("BikeType"),
                        result.getDouble("RimSize"),
                        result.getInt("NumberOfGears"),
                        result.getDate("DateLastTask"),
                        result.getBoolean("BikeBag"));
                queryResult.add(cityBike);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return queryResult;
    }

}
