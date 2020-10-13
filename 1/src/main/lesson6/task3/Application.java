package main.lesson6.task3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
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

        for (Lesson currentLessonType : Lesson.values()) {
            System.out.printf("%s : %s%n", currentLessonType.getDescription(), amountOfLessons.get(currentLessonType));
        }
    }
}
