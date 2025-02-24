package main.lesson9.task4.food;

import main.lesson9.task4.restaraunt.Cooker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    public Food generateFood() {
        int randomFood = new Random().nextInt(6);
        switch (randomFood) {
            case 0:
                return new Meat();
            case 1:
                return new Fish();
            case 2:
                return new Rice();
            case 3:
                return new Buckwheat();
            case 4:
                return new Coffee();
            case 5:
                return new Tea();
            default:
                throw new IllegalArgumentException("Не верный порядковый номер блюда - " + randomFood);
        }
    }

    public List<Cooker> generateCookers() {
        List<Cooker> cookers = new ArrayList<>();
        int cookersAmount = new Random().nextInt(6) + 5;
        for (int i = 0; i < cookersAmount; i++) {
            cookers.add(new Cooker());
        }
        return cookers;
    }
}
