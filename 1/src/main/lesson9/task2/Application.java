package main.lesson9.task2;


import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Object object = Generator.generate();
            objects.add(object);
            System.out.printf("%d ", i);
            Action.action(object);
        }

        int boxes = 0;
        int tables = 0;
        int circles = 0;
        int squares = 0;
        for (Object currentObject : objects) {
            if (currentObject.getClass().getSimpleName().equals("Box"))
                boxes++;
            if (currentObject.getClass().getSimpleName().equals("Table"))
                tables++;
            if (currentObject.getClass().getSimpleName().equals("Circle"))
                circles++;
            if (currentObject.getClass().getSimpleName().equals("Square"))
                squares++;
        }

        System.out.println();
        System.out.println("первый объект - " + boxes);
        System.out.println("второй объект - " + tables);
        System.out.println("третий объект - " + circles);
        System.out.println("четвертый объект - " + squares);
    }
}
