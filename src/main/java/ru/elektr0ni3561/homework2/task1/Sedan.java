package ru.elektr0ni3561.homework2.task1;

import ru.elektr0ni3561.homework2.task1.car.Car;
import ru.elektr0ni3561.homework2.task1.car.FuelType;

public class Sedan extends Car {

    {
        this.fuelType = FuelType.GASOLINE98;
    }

    public Sedan(int numberOfDoors, float trunkCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
    }

    public Sedan(int numberOfDoors, float trunkCapacity, FuelType fuelType) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    public String getLuxuryLevel() {
        return "Sedan S class!";
    }

    @Override
    public void start() {
        System.out.println("Sedan start!");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stop!");
    }

    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public float getTrunkCapacity() {
        return this.trunkCapacity;
    }

    @Override
    public FuelType getFuelType() {
        return this.fuelType;
    }
}
