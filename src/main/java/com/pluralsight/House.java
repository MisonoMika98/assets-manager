package com.pluralsight;


public class House extends Asset
{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue()
    {
        if(this.condition == 4)
        {
            this.squareFoot = lotSize*lotSize;
            return 180.00 + (this.squareFoot / .25);
        }
        if(this.condition == 3)
        {
            this.squareFoot = lotSize*lotSize;
            return 130.00 + (this.squareFoot / .25);
        }
        if(this.condition == 2)
        {
            this.squareFoot = lotSize*lotSize;
            return 90.00 + (this.squareFoot / .25);
        }
        if(this.condition == 1)
        {
            this.squareFoot = lotSize*lotSize;
            return 80.00 + (this.squareFoot / .25);
        }
        return 0.00;
    }
}
