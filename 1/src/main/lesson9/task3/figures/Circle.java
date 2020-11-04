package main.lesson9.task3.figures;

public class Circle extends OneParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(firstSide, 2));
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * firstSide;
    }
}
