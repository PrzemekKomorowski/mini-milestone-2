package org.example.powerplants;

public class SolarPlant extends PowerPlant {
    private final double ENERGY_PRODUCTION = 2;
    private final double RESOURCE_CONSUMPTION = 0; // słońce = brak ograniczeń ( chyba że byśmy wprowadzili pogodę)

    @Override
    public double getEnergyProduction() {
        return ENERGY_PRODUCTION;
    }

    @Override
    public double getResourceConsumption() {
        return RESOURCE_CONSUMPTION;
    }
}