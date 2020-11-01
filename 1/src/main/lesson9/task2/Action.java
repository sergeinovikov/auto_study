package main.lesson9.task2;

import main.lesson9.task2.interfaces.Drawable;
import main.lesson9.task2.interfaces.Movable;

public class Action {

    public static void action (Object object) {
        if (Drawable.class.isAssignableFrom(object.getClass())) {
            ((Drawable) object).draw();
        } else if (Movable.class.isAssignableFrom(object.getClass())) {
            ((Movable) object).move();
        }
    }
}
