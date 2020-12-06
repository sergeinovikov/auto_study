package main.lesson13.task3;

import java.util.List;

public class Functions {

    public static String toStringFunction(Object input) {
        Func<String, Object> toStringFunction = Object::toString;
        return toStringFunction.execute(input);
    }

    public static Integer summFunction(List<Integer> input) {
        Func<Integer, List<Integer>> summFunction = (listOfIntegers) -> listOfIntegers.stream()
                .reduce(0, Integer::sum);
        return summFunction.execute(input);
    }

    public static Boolean onlyEqualsObjects(List<Object> input) {
        Func<Boolean, List<Object>> onlyEqualsObjects = (listOfObjects) -> {
            for (int i = 0; i < listOfObjects.size(); i++) {
                for (int j = i + 1; j < listOfObjects.size(); j++) {
                    if (listOfObjects.get(i).equals(listOfObjects.get(j)))
                        return false;
                }
            }
            return true;
        };
        return onlyEqualsObjects.execute(input);
    }

    public static Comparable maxObject(List<Comparable> input) {
        Func<Comparable, List<Comparable>> maxObject = (listOfObjects) -> listOfObjects.stream()
                .max(Comparable::compareTo)
                .orElseThrow(() -> new RuntimeException("Список пуст"));
        return maxObject.execute(input);
    }
}
