package org.example.powerplants;

public abstract class PowerPlant {
    protected double energyProduction; // MWh
    protected double resourceConsumption; // ton, kg, gram itp.

    public abstract double getEnergyProduction();
    public abstract double getResourceConsumption();
}
