package ru.elektr0ni3561.homework2.task1;

import ru.elektr0ni3561.homework2.task1.car.Car;
import ru.elektr0ni3561.homework2.task1.car.FuelType;

public class Truck extends Car {

    {
        this.fuelType = FuelType.DIESEL;
    }

    /**
     * <p>Measured in pounds</p>
     */
    protected int maxLoadCapacity;

    public Truck(int numberOfDoors, float trunkCapacity, int maxLoadCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public Truck(int numberOfDoors, float trunkCapacity, int maxLoadCapacity, FuelType fuelType) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
        this.fuelType = fuelType;
    }

    /**
     * @return maxLoadCapacity measured in pounds
     */
    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck start!");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop!");
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
