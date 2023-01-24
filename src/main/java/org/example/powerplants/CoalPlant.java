package org.example.powerplants;

public class CoalPlant extends PowerPlant {
    private final double ENERGY_PRODUCTION = 7; // MWh
    private final double RESOURCE_CONSUMPTION = 100; // ton węgla

    @Override
    public double getEnergyProduction() {
        return ENERGY_PRODUCTION;
    }

    @Override
    public double getResourceConsumption() {
        return RESOURCE_CONSUMPTION;
    }
}