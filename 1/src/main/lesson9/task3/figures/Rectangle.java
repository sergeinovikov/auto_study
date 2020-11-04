package main.lesson9.task3.figures;

public class Rectangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public double getLength() {
        return 2 * (firstSide + secondSide);
    }
}
