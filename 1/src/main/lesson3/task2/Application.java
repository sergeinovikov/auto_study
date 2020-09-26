package main.lesson3.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Cat[] catArray = {new Cat(2, 5, "Барсик"),
                new Cat(3, 11, "Мурзик"),
                new Cat(7, 2, "Матильда"),
                new Cat(1, 3, "Леопольд"),
                new Cat(11, 4, "Базилио")};

        Arrays.sort(catArray , Cat::compareCats);

        for (Cat count : catArray) {
            System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", count.name, count.age, count.weight);
        }
    }
}

