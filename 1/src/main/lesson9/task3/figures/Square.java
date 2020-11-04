package main.lesson9.task3.figures;

public class Square extends OneParameterFigure {

    @Override
    public double getArea() {
        return Math.pow(firstSide, 2);
    }

    @Override
    public double getLength() {
        return 4 * firstSide;
    }
}
