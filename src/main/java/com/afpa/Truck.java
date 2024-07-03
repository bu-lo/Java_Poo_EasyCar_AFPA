package com.afpa;

import java.time.LocalDate;

public class Truck extends MotorizedVehicle {
    private double cargoCapacity;

    //CONSTRUCTORS
    public Truck(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
    FuelType fuelType, int fuelConsumption, boolean integratedGPS, int seats){
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);
        this.cargoCapacity = cargoCapacity;
    }

    //GETTERS & SETTERS

    //CARGO CAPACITY

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    
    @Override
    public String toString() {
        return "Car [CargoCapacity=" + cargoCapacity + ", GetBrand()=" + getBrand() + ", GetModel()="
                + getModel() + ", GetFuelType()=" + getFuelType() + ", GetColor()=" + getColor()
                + ", GetFuelConsumption()=" + getFuelConsumption() + ", GetBuyingDate()=" + getBuyingDate()
                + ", IsIntegratedGPS()=" + isIntegratedGPS() + ", GetPricePerDay()=" + getPricePerDay()
                + "]";
    }

    
}

