package main.lesson9.task3.figures;

public class Ellipse extends TwoParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * firstSide * secondSide;
    }

    @Override
    public double getLength() {
        return Math.PI * (firstSide + secondSide);
    }
}
