package org.example.powerplants;

public class FusionPlant extends PowerPlant {
    private final double ENERGY_PRODUCTION = 20000;
    private final double RESOURCE_CONSUMPTION = 1; // hel

    @Override
    public double getEnergyProduction() {
        return ENERGY_PRODUCTION;
    }

    @Override
    public double getResourceConsumption() {
        return RESOURCE_CONSUMPTION;
    }
}