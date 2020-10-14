package main.lesson6.task3;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Application {
    private static boolean DESC = false;

    public static void main(String[] args) {
        Scholar boy = new Scholar();

        for (DayOfWeek day : DayOfWeek.values()) {
            List<Enum> randomLessons = Lesson.getRandomLessons();
            boy.setDiary(day, randomLessons);
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("%s : ", day.getDescription());
            List<Lesson> lessonsOfTheDay = boy.getDiary().get(day);
            for (int i = 0; i < lessonsOfTheDay.size(); i++) {
                System.out.printf("%s", lessonsOfTheDay.get(i).getDescription());
                if (i < lessonsOfTheDay.size() - 1) {
                    System.out.print(", ");
                } else {
                    System.out.printf("%n");
                }
            }
        }
        System.out.println();

        Map<Lesson, Integer> amountOfLessons = new HashMap<>();
        for (Lesson currentLessonType : Lesson.values()) {
            int currentLessonAmount = 0;
            for (DayOfWeek day : DayOfWeek.values()) {
                List<Lesson> lessonsOfTheDay = boy.getDiary().get(day);
                currentLessonAmount += Collections.frequency(lessonsOfTheDay, currentLessonType);
            }
            amountOfLessons.put(currentLessonType, currentLessonAmount);
        }

        Map<Lesson, Integer> sortedMapDesc = sortByValue(amountOfLessons, DESC);
        printMap(sortedMapDesc);
    }

    private static Map<Lesson, Integer> sortByValue(Map<Lesson, Integer> unsortMap, final boolean order)
    {
        List<Map.Entry<Lesson, Integer>> list = new LinkedList(unsortMap.entrySet());

        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));

    }

    private static void printMap(Map<Lesson, Integer> map)
    {
        map.forEach((key, value) -> System.out.println(key.getDescription() + " : " + value));
    }
}
