package main.lesson9.task1;

import main.lesson9.task1.cars.*;

import java.util.Random;

public class Factory {

    public static Car make() {
        int randomChance = new Random().nextInt(100) + 1;
        if (randomChance >= 1 && randomChance <= 40)
            return new Renault();
        if (randomChance >= 41 && randomChance <= 70)
            return new Nissan();
        if (randomChance >= 71 && randomChance <= 90)
            return new Mitsubishi();
        if (randomChance >= 90 && randomChance <= 100)
            return new Mercedes();
        throw new IllegalArgumentException("Введено не верное случайное значение: " + randomChance);
    }
}
