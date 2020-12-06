package lesson13.task1;

import main.lesson13.task1.Filter;
import main.lesson13.task1.FilterHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FilterTest {

    @Test
    public void filterLessThan5() {
        List<Integer> numbers = Arrays.asList(-20, 0, 4, 5, 7, 9);
        Filter filter = number -> number < 5;
        List<Integer> actualResult = FilterHelper.filterNumbers(numbers, filter);
        List<Integer> expectedResult = Arrays.asList(-20, 0, 4);
        Assertions.assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    public void filterMoreThan5() {
        List<Integer> numbers = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = number -> number > 10;
        List<Integer> actualResult = FilterHelper.filterNumbers(numbers, filter);
        List<Integer> expectedResult = Arrays.asList(15, 25);
        Assertions.assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    public void filterByValues() {
        List<Integer> numbers = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = number -> Arrays.asList(-20, 4, 9, 12, 15).contains(number);
        List<Integer> actualResult = FilterHelper.filterNumbers(numbers, filter);
        List<Integer> expectedResult = Arrays.asList(-20, 4, 9, 15);
        Assertions.assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    public void filterDistinctValues() {
        List<Integer> numbers = Arrays.asList(-10, -7, 5, 15, 5, -2, 4, 15);
        Filter filter = number -> {
            int count = 0;
            for (Integer current : numbers)
                if (number == current)
                    count++;
            return count < 2;
        };
        List<Integer> actualResult = FilterHelper.filterNumbers(numbers, filter);
        List<Integer> expectedResult = Arrays.asList(-10, -7, -2, 4);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
