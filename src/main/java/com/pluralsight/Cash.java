package com.pluralsight;

public abstract class Cash extends Asset
{
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public abstract void double getValue()
}
