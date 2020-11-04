package main.lesson9.task3;

import main.lesson9.task3.figures.*;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            figureList.add(Generator.generateFigure());
        }

        for (Figure currentFigure : figureList) {
            if (currentFigure instanceof OneParameterFigure)
                System.out.printf("%s [%.1f]: Длина - %.1f, Площадь - %.1f%n", currentFigure.getClass().getSimpleName(), ((OneParameterFigure) currentFigure).getFirstSide(), currentFigure.getLength(), currentFigure.getArea());
            if (currentFigure instanceof TwoParameterFigure)
                System.out.printf("%s [%.1f, %.1f]: Длина - %.1f, Площадь - %.1f%n", currentFigure.getClass().getSimpleName(), ((TwoParameterFigure) currentFigure).getFirstSide(), ((TwoParameterFigure) currentFigure).getSecondSide(), currentFigure.getLength(), currentFigure.getArea());
            }

        for (Figure currentFigure : figureList) {
            if (currentFigure instanceof RightTriangle)
                System.out.printf("Гипотенуза треугольника [%.1f, %.1f] равна %.1f%n", ((TwoParameterFigure) currentFigure).getFirstSide(), ((TwoParameterFigure) currentFigure).getSecondSide(), ((RightTriangle) currentFigure).getHypotenuse());
        }
    }
}
