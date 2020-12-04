package main.lesson13.task1;

import java.util.ArrayList;
import java.util.List;

public class FilterHelper {

    public static List<Integer> filterOut(List<Integer> numbers, Filter filter) {
        List<Integer> result = new ArrayList<>();
        for (Integer current : numbers) {
            if (filter.filter(current))
                result.add(current);
        }
        return result;
    }
}
