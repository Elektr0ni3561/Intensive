package ru.elektr0ni3561.homework7.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Buyer extends Thread implements IBuyer, IUseBasket {

    private final List<String> chosenGoods = new ArrayList<>();
    private final List<String> goodsInBasket = new ArrayList<>();
    private boolean hasBasket = false;

    @Override
    public void run() {
        enterToMarket();
        final int goodsCount = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < goodsCount; i++) {
            chooseGoods();
            if (this.hasBasket) {
                putGoodsToBasket();
            }
        }
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println(getName() + " enter to market");
        if (ThreadLocalRandom.current().nextInt(2) == 0) {
            takeBasket();
        }
    }

    @Override
    public void chooseGoods() {
        List<String> goodsList = new ArrayList<>(Main1.GOODS_PRICES.keySet());
        String randomGood = goodsList.get(ThreadLocalRandom.current().nextInt(goodsList.size()));
        this.chosenGoods.add(randomGood);
        System.out.println(getName() + " choose good: " + randomGood);
        try {
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(501, 2001));
        } catch (InterruptedException e) {
            System.err.println(getName() + " was interrupted");
        }
    }

    @Override
    public void takeBasket() {
        this.hasBasket = true;
        System.out.println(getName() + " take basket");
        try {
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(501, 2001));
        } catch (InterruptedException e) {
            System.err.println(getName() + " was interrupted");
        }
    }

    @Override
    public void putGoodsToBasket() {
        for (String good : this.chosenGoods) {
            this.goodsInBasket.add(good);
            System.out.println(getName() + " put to basket: " + good + " (price: " + Main1.GOODS_PRICES.get(good) + ")");
            try {
                TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(501, 2001));
            } catch (InterruptedException e) {
                System.err.println(getName() + " was interrupted");
            }
        }
        this.chosenGoods.clear();
    }

    @Override
    public void goOut() {
        System.out.println(getName() + " go to exit");
    }
}
