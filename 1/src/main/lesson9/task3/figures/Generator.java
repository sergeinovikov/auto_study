package main.lesson9.task3.figures;

import main.lesson9.task3.figures.*;

public class Generator {
    private static int index = 0;

    public static Figure generateFigure() {
        if (index == 0) {
            index++;
            return new Circle();
        } else if (index == 1) {
            index++;
            return new Ellipse();
        } else if (index == 2) {
            index++;
            return new EquilateralTriangle();
        } else if (index == 3) {
            index++;
            return new Rectangle();
        } else if (index == 4) {
            index++;
            return new RightTriangle();
        } else if (index == 5) {
            index = 0;
        }
        return new Square();
    }
}
