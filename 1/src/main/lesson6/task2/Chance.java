package main.lesson6.task2;

import java.util.Random;

public class Chance {
    public static boolean calculateChance(int percent) {
        int randomNumber = new Random().nextInt(101);
        return randomNumber >= percent;
    }
}
