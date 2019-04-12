package com.BikeStore.Domain.Repository;


import com.BikeStore.Domain.Modal.ElectricBike;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ElectricBikeRepository extends Repository {

    public ArrayList getAllElectricBikes() {

        String query = getAllByLeftJoin("Bike_Type_Electric", "Bikes", "BikeId");

        Connection conn = ConnectDB();
        ArrayList<ElectricBike> queryResult = new ArrayList<>();
        try {
            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet result = st.executeQuery(query);

            // iterate through the java resultset
            while (result.next()) {
                ElectricBike electricBike = new ElectricBike(result.getInt("BikeId"), result.getString("BikeBrand"), result.getInt("BikeType"), result.getDouble("RimSize"), result.getInt("NumberOfGears"), result.getInt("DateLastTask"), result.getDouble("BikePower"));
                queryResult.add(electricBike);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return queryResult;
    }

}
