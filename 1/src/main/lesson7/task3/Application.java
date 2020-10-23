package main.lesson7.task3;

import main.lesson7.task3.chess.*;
import main.lesson7.task3.figues.*;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new Knight("E5"));
        figures.add(new King("H8"));
        figures.add(new Pawn(Player.WHITE, "C1"));
        figures.add(new Bishop("D4"));
        figures.add(new Rook("D5"));
        figures.add(new Queen("A1"));
        printMoves(figures);

    }

    public static void printMoves(List<ChessFigure> figures) {
        for (ChessFigure current : figures) {
            System.out.printf("%s : ", current.getName());
            if (current.getAvailableMoves().size() == 0) {
                System.out.printf("ходов нет%n");
            } else {
                Set<Position> moves = current.getAvailableMoves();
                List<Position> sortedMoves = new ArrayList<>(moves);
                sortedMoves.sort(new nameSorter());

                int i = 0;
                for (Position currentPosition : sortedMoves) {
                    if (++i == current.getAvailableMoves().size()) {
                        System.out.printf("%s%s%n", currentPosition.getHorizontalPosition(), currentPosition.getVerticalPosition());
                    } else {
                        System.out.printf("%s%s, ", currentPosition.getHorizontalPosition(), currentPosition.getVerticalPosition());
                    }
                }
            }
        }
    }

    public static class nameSorter implements Comparator<Position> //сортировка только по букве
    {
        @Override
        public int compare(Position p1, Position p2) {
            int result = String.valueOf(p1.getHorizontalPosition()).compareToIgnoreCase(String.valueOf(p2.getHorizontalPosition()));
            if (result==0) {
                result = String.valueOf(p1.getVerticalPosition()).compareToIgnoreCase(String.valueOf(p2.getVerticalPosition()));
            }
            return result;
        }
    }

}
