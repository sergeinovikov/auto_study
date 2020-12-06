package lesson13.task3;

import main.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MaxObjectTest {

    @Test
    public void doubleMaxTest() {
        List<Comparable> numbers = Arrays.asList(4.0, 1.5, 5.5, 2.0, 3.9);
        Double actualResult = (Double) Functions.maxObject(numbers);
        Assertions.assertEquals(5.5, actualResult);
    }

    @Test
    public void stringMaxTest() {
        List<Comparable> strings = Arrays.asList("Аая", "Бяы", "Ввя", "Яяя", "Ыыя", "Яяю");
        String actualResult = (String) Functions.maxObject(strings);
        Assertions.assertEquals("Яяя", actualResult);
    }
}
