package ru.elektr0ni3561.homework7.task1;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main1 {

    // Немного не понял задание. Товары с ценой наверное лучше перечислять в Enum, для корзины создать отдельный класс.

    public static final Map<String, Double> GOODS_PRICES = Map.of("Apple", 1.0,
            "Milk", 2.5,
            "Bread", 1.5,
            "Cheese", 3.0,
            "Coffee", 5.0);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 120; i++) {
            int newBuyers = ThreadLocalRandom.current().nextInt(3);
            for (int j = 0; j < newBuyers; j++) {
                new Buyer().start();
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
