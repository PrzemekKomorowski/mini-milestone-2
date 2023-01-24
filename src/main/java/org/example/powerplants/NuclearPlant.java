package org.example.powerplants;

public class NuclearPlant extends PowerPlant {
    private final double ENERGY_PRODUCTION = 10000;
    private final double RESOURCE_CONSUMPTION = 1; // kg wzbogaconego uranu

    @Override
    public double getEnergyProduction() {
        return ENERGY_PRODUCTION;
    }

    @Override
    public double getResourceConsumption() {
        return RESOURCE_CONSUMPTION;
    }
}