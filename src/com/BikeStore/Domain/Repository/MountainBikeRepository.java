package com.BikeStore.Domain.Repository;


import com.BikeStore.Domain.Modal.MountainBike;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MountainBikeRepository extends Repository {

    public ArrayList getAllMountainBikes() {

        String query = getAllByLeftJoin("Bike_Type_Mountain", "Bikes", "BikeId");

        Connection conn = ConnectDB();
        ArrayList<MountainBike> queryResult = new ArrayList<>();
        try {
            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet result = st.executeQuery(query);

            // iterate through the java resultset
            while (result.next()) {
                MountainBike mountainBike = new MountainBike(result.getInt("BikeId"), result.getString("BikeBrand"), result.getInt("BikeType"), result.getDouble("RimSize"), result.getInt("NumberOfGears"), result.getInt("DateLastTask"), result.getString("Suspension"));
                queryResult.add(mountainBike);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return queryResult;
    }
}
