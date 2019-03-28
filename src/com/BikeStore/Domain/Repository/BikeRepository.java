package com.BikeStore.Domain.Repository;

import com.BikeStore.Database;
import com.BikeStore.Domain.Modal.Bike;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BikeRepository extends Database {

    public ArrayList getAllBikes() {
        Connection conn = ConnectDB();
        ArrayList<Bike> BikeList = new ArrayList<>();

        try {
            String query = "SELECT * FROM Bikes";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet result = st.executeQuery(query);

            // iterate through the java resultset
            while (result.next()) {
                Bike bike = new Bike(result.getInt("BikeId"), result.getString("BikeBrand"), result.getInt("BikeType"), result.getDouble("RimSize"), result.getInt("NumberOfGears"), result.getInt("DateLastTask"));
                BikeList.add(bike);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return BikeList;
    }

}
