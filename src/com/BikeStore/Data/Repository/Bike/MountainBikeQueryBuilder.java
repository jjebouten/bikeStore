package com.BikeStore.Data.Repository.Bike;

import com.BikeStore.Data.Modal.MountainBike;
import com.BikeStore.Data.Repository.QueryBuilder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MountainBikeQueryBuilder extends QueryBuilder {

    public ArrayList getAllMountainBikes() {

        String query = getAllByFieldThroughInt("Bikes", "BikeType", 3);

        Connection conn = ConnectDB();
        ArrayList<MountainBike> queryResult = new ArrayList<>();
        try {
            // create the java statement
            Statement st = conn.createStatement();

            // execute the query,// and get a java resultset
            ResultSet result = st.executeQuery(query);

            // iterate through the java resultset
            while (result.next()) {
                MountainBike mountainBike = new MountainBike(result.getInt("BikeId"),
                        result.getString("BikeBrand"),
                        result.getInt("BikeType"),
                        result.getDouble("RimSize"),
                        result.getInt("NumberOfGears"),
                        result.getDate("DateLastTask"),
                        result.getString("BikeSuspension"));
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
