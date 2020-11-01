package main.lesson9.task2.shapes;

import main.lesson9.task2.interfaces.Drawable;

public class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.printf("Фигура %s нарисована%n", getClass().getSimpleName());
    }
}
