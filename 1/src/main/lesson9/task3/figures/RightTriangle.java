package main.lesson9.task3.figures;

public class RightTriangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return (firstSide * secondSide) / 2;
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2)) + firstSide + secondSide;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
    }
}
