package ru.elektr0ni3561.homework2.task1.car;

public abstract class Car implements Vehicle {

    //Вынес в отдельный пакет, чтобы отделить клиента и логику

    protected int numberOfDoors;
    protected float trunkCapacity;
    protected FuelType fuelType;

    abstract public int getNumberOfDoors();

    abstract public float getTrunkCapacity();
}