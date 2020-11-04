package main.lesson9.task3.figures;

import main.lesson9.task3.interfaces.FigureArea;
import main.lesson9.task3.interfaces.FigureLength;

public abstract class Figure implements FigureArea, FigureLength {
    protected double firstSide;
}
