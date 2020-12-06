package lesson13.task3;

import main.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SummFunctionTest {

    @Test
    public void summIntegerFromArray() {
        List<Integer> inputArray = Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6);
        Integer actualResult = Functions.summFunction(inputArray);
        Assertions.assertEquals(55, actualResult);
    }
}
