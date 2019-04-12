package com.BikeStore.Domain.Repository;

public class BikeRepository extends Repository {

//    public ArrayList getAllBikes() {
//        String query = "SELECT * FROM Bikes";
//        return bikesQuery(query);
//    }
//
//    public ArrayList getBikeById(int bikeId) {
//        String query = "SELECT * FROM `Bikes` WHERE `BikeId`='" + bikeId + "'";
//        return bikesQuery(query);
//    }
//
//    public ArrayList getBikesByType(int bikeType) {
//        ArrayList<Bike> BikeList = new ArrayList<>();
//        String query = "SELECT * FROM `Bikes` WHERE `BikeType`='" + bikeType + "'";
//        return bikesQuery(query);
//    }
//
//    public ArrayList getAdditionalBikeInfoForType(String table, int bikeId) {
//        ArrayList<Bike> BikeList = new ArrayList<>();
//        String query = "SELECT * FROM '" + table + "' WHERE `BikeId`='" + bikeId + "'";
//        return bikesQuery(query);
//    }
//
//    private ArrayList bikesQuery(String query) {
//        Connection conn = ConnectDB();
//        ArrayList<Bike> queryResult = new ArrayList<>();
//        try {
//            // create the java statement
//            Statement st = conn.createStatement();
//
//            // execute the query, and get a java resultset
//            ResultSet result = st.executeQuery(query);
//
//            // iterate through the java resultset
//            while (result.next()) {
//                Bike bike = new Bike(result.getInt("BikeId"), result.getString("BikeBrand"), result.getInt("BikeType"), result.getDouble("RimSize"), result.getInt("NumberOfGears"), result.getInt("DateLastTask"));
//                queryResult.add(bike);
//            }
//            st.close();
//        } catch (Exception e) {
//            System.err.println("Got an exception!");
//            System.err.println(e.getMessage());
//        }
//        return queryResult;
//    }


}
