package main.lesson6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATHEMATICS("Математика"),
    PHYSICS("Физика"),
    CODING("Программирование"),
    HISTORY("История"),
    BIOLOGY("Биология"),
    GEOGRAPHY("География");

    private String description;

    public String getDescription() {
        return description;
    }

    Lesson(String description) {
        this.description = description;
    }

    public static List getRandomLessons() {
        int randomAmount = new Random().nextInt(3) + 4;
        List<Enum> listOfRandomLessons = new ArrayList<>();
        for (int i = 0; i < randomAmount; i++) {
            int randomLesson = new Random().nextInt(Lesson.values().length);
            listOfRandomLessons.add(Lesson.values()[randomLesson]);
        }
        return listOfRandomLessons;
    }
}
