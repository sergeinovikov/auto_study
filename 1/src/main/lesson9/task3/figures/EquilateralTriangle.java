package main.lesson9.task3.figures;

public class EquilateralTriangle extends OneParameterFigure {

    @Override
    public double getArea() {
        return (Math.pow(firstSide, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double getLength() {
        return 3 * firstSide;
    }
}
