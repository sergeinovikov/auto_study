package lesson11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.lesson11.task3.*;

import java.util.Random;

public class StringGeneratorTest {

    @Test
    public void stringGenerationTest() {
        int startBound = 10;
        int endBound = 20;
        for (int i = 0; i < 10000; i++) {
            int startLength = new Random().nextInt(startBound);
            int endLength = new Random().nextInt(endBound - startLength + 1) + startLength;
            String result = Generator.randomString(startLength, endLength);
            System.out.printf("Начальный диапазон - %d, конечный дипазон - %d%n", startLength, endLength);
            System.out.printf("Результат - %s, длина слова - %s%n", result, result.length());
            Assertions.assertEquals(endBound, result.length(), endBound);
        }
    }
}

