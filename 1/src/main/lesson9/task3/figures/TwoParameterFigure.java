package main.lesson9.task3.figures;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {
    protected double secondSide;

    public TwoParameterFigure() {
        firstSide = new Random().nextInt(11) + 1;
        secondSide = new Random().nextInt(11) + 1;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }
}
