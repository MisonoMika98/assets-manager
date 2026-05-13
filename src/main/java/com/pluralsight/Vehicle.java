package com.pluralsight;

public class Vehicle extends Asset
{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue()
    {
        if (this.odometer >= 100000){
            if (this.makeModel.contains("Toyota" + "Honda"))
            {
                return getOriginalCost();
            }
            return getOriginalCost() / .25;
        }
        if(this.year >= 2023){
            return getOriginalCost() / .03;
        }
        if(this.year <= 2022 && this.year >= 2020){
            return getOriginalCost() / .06;
        }
        if(this.year <= 2019 && this.year >= 2016){
            return getOriginalCost() / .08;
        }
        if(this.year < 2016){
            return 1000.00;
        }
        return 0.00;
    }
}
