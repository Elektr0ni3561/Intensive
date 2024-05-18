package ru.elektr0ni3561.homework2.task1;

import ru.elektr0ni3561.homework2.task1.car.FuelType;

public class Main1 {

    public static void main(String[] args) {
        Sedan sedan = new Sedan(4,4.4f, FuelType.GASOLINE100);
        Truck truck = new Truck(2,4.7f, 80000);

        System.out.println("------------------------------");

        sedan.start();
        sedan.stop();

        System.out.println("Sedan luxury level: " + sedan.getLuxuryLevel());
        System.out.println("Sedan fuel type: " + sedan.getFuelType());
        System.out.println("Sedan number of doors: " + sedan.getNumberOfDoors());
        System.out.println("Sedan trunk capacity: " + sedan.getTrunkCapacity());
        System.out.println("---------------");

        truck.start();
        truck.stop();

        System.out.println("Truck max load capacity: " + truck.getMaxLoadCapacity());
        System.out.println("Truck fuel type: " + truck.getFuelType());
        System.out.println("Truck number of doors: " + truck.getNumberOfDoors());
        System.out.println("Truck trunk capacity: " + truck.getTrunkCapacity());
        System.out.println("------------------------------");
    }
}
