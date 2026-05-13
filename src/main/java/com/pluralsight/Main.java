package com.pluralsight;

import java.util.ArrayList;

public class Main {
    static void main()
    {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        assets.add(new House("Vacation House", "March 2025", 300000.01, "Japan", 4, 2500, 1000));
        assets.add(new House("Main House", "December 2023", 500000.25, "Canada", 3, 3000,1000));
        assets.add(new Vehicle("Main Car", "April 2024", 100000.50, "Honda Accord", 2023, 50050));
        assets.add(new Vehicle("2nd Car", "August 2005", 50000.99, "Nissan Sentra", 2006, 250000));

        for (Asset asset : assets)
        {
            System.out.println();
            System.out.println(asset.getDescription() + ", " + asset.getDateAcquired() + ", $" + asset.getOriginalCost() + " $" + asset.getValue());
        }

        String message = "";

        if (assets.get(0) instanceof House){
            House house = (House) assets.get(0);
            message = "House at " + house.getAddress();
        }
        else if (assets.get(2) instanceof Vehicle){
            Vehicle vehicle = (Vehicle) assets.get(2);
            message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
        }
        System.out.println();
        System.out.println(message);
    }
}
