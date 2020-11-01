package main.lesson9.task2;

import main.lesson9.task2.furniture.*;
import main.lesson9.task2.shapes.*;

public class Generator {
    private static int count = 0;

    public static Object generate() {
        if (count == 0) {
            count++;
            return new Box();
        }
        if (count == 1) {
            count++;
            return new Table();
        }
        if (count == 2) {
            count++;
            return new Circle();
        }
        if (count == 3) {
            count = 0;
            return new Square();
        }
        throw new IllegalArgumentException("Не можем создать объект, т.к. нет делителя для числа " + count);
    }
}
