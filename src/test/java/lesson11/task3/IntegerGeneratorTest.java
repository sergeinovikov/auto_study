package lesson11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.lesson11.task3.*;

import java.util.Random;

public class IntegerGeneratorTest {

    @Test
    public void integerGenerationTest() {
        int startBound = 10;
        int endBound = 20;
        for (int i = 0; i < 10000; i++) {
            int startLength = new Random().nextInt(startBound);
            int endLength = new Random().nextInt(endBound - startLength + 1) + startLength;
            int result = Generator.randomInteger(startLength, endLength);
            System.out.printf("Начальный диапазон - %d, конечный дипазон - %d%n", startLength, endLength);
            System.out.printf("Результат - %d%n", result);
            Assertions.assertEquals(endBound, result, endBound);
        }
    }
}
