package org.example.powerplants;

import java.sql.SQLOutput;

public abstract class PowerStation {
    private double amountOfResources;
    private double amountOfEnergy;

    public PowerStation(double amountOfResources,double amountOfEnergy){

        this.amountOfResources = amountOfResources;
        this.amountOfEnergy = amountOfEnergy;
    }



    public void generatePower(){}

    public double getAmountOfResources(){
        return amountOfResources;
    }

    public double getEnergyProduction(){
        return amountOfEnergy;
    }

    public abstract void useResources(double amountOfResources);

    public abstract void generatePower(double amountOfResources);
}
