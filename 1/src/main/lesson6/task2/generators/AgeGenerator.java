package main.lesson6.task2.generators;

import java.util.Random;

public class AgeGenerator {
    public int generate() {
        return new Random().nextInt(56) + 20;
    }
}
