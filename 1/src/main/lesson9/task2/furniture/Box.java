package main.lesson9.task2.furniture;

import main.lesson9.task2.interfaces.Movable;

public class Box implements Movable {

    @Override
    public void move() {
        System.out.printf("Предмет %s перемещен%n", getClass().getSimpleName());
    }
}
