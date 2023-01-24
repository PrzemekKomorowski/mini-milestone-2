package org.example.powerplants;

public class CoalPlant extends PowerStation {


    public CoalPlant(double amountOfResources,double amountOfEnergy) {
        super(amountOfResources,amountOfEnergy);
    }

    @Override
    public void useResources(double amountOfResources){
         amountOfResources -= 100;
    }

    @Override
    public void generatePower(double amountOfResources) {
    }


}
