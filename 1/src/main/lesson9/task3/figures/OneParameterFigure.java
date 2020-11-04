package main.lesson9.task3.figures;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {

    public OneParameterFigure() {
        firstSide = new Random().nextInt(11) + 1;
    }

    public double getFirstSide() {
        return firstSide;
    }
}
