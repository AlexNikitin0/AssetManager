package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        //load two houses
        assets.add(new House("my main home yo","10/02/2020",400000,"123 fake street",2,2000,500));
        assets.add(new House("my vacation home","11/03/2021",500000,"125 fake street",1,2500,700));
        //load two cars
        assets.add(new Vehicle("my dream car","09/01/2011",10000,"Ford Mustang gt500",2011,1200));
        assets.add(new Vehicle("my work truck","09/01/1998",1000,"Ford F-150",1998,12000));

            String message = "";

        for(int i = 0; i < assets.size(); i++){
            if(assets.get(i) instanceof House) {
                House house = (House) assets.get(i);
                message = house.getAddress() + " " + "Original cost: " + house.getOriginalCost() + " " + "Current cost: " + house.getValue();
                System.out.println(message);
            }
            else if(assets.get(i) instanceof Vehicle){
                Vehicle vehicle = (Vehicle) assets.get(i);
                message = vehicle.getDescription() + " " + vehicle.getMakeModel() + " " + "Original Cost: " + vehicle.getOriginalCost() + " " + "Current cost: " + vehicle.getValue();
                System.out.println(message);
            }



        }



    }


}
