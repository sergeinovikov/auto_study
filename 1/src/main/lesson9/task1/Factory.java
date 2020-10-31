package main.lesson9.task1;

import main.lesson9.task1.cars.*;

import java.util.Random;

public class Factory {

    public static Car make() {
        int randomChance = new Random().nextInt(100);
        if (randomChance > 0 && randomChance < 40)
            return new Renault();
        if (randomChance > 39 && randomChance < 70)
            return new Nissan();
        if (randomChance > 69 && randomChance < 90)
            return new Mitsubishi();
        if (randomChance > 89 && randomChance < 100)
            return new Mercedes();
        else {
            return null;
        }
    }
}
