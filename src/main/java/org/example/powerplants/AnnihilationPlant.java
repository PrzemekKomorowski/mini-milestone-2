package org.example.powerplants;

public class AnnihilationPlant extends PowerPlant {
    private final double ENERGY_PRODUCTION = 25000;
    private final double RESOURCE_CONSUMPTION = 1; // 1g antymaterii

    @Override
    public double getEnergyProduction() {
        return ENERGY_PRODUCTION;
    }

    @Override
    public double getResourceConsumption() {
        return RESOURCE_CONSUMPTION;
    }
}