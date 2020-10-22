package main.lesson7.task3.figues;

import main.lesson7.task3.chess.Player;
import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends ChessFigure {

    public Pawn(Player color, String position) {
        super(color, position);
        name = "Пешка";
    }

    public Pawn(String position) {
        super(position);
        name = "Пешка";
        throw new IllegalArgumentException("Необходимо ввести цвет фигуры для пешки");
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> moves = new HashSet<>();
        int indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        int indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        Position currentMove;
        char letter = board.getLetterByIndex(indexOfLetter);
        char digit;
        if (color == Player.WHITE) {
            if (indexOfDigit == 1) { // если белая пешка стоит на позиции 2, то вычисляем ход белой фишки на 2 вперёд
                digit = board.getDigitByIndex(indexOfDigit + 2);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            if (indexOfDigit <= 6) {// вычисляем ход белой фишки на 1 вперёд
                digit = board.getDigitByIndex(indexOfDigit + 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
        }

        if (color == Player.BLACK) {
            if (indexOfDigit == 6) { // если чёрная пешка стоит на позиции 7, то вычисляем ход белой фишки на 2 вперёд (с точки зрения чёрной пешки)
                digit = board.getDigitByIndex(indexOfDigit - 2);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            if (indexOfDigit >= 1) {
                digit = board.getDigitByIndex(indexOfDigit - 1); // вычисляем ход чёрной фишки на 1 вперёд (с точки зрения чёрной пешки)
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
        }
        return moves;
    }


    @Override
    public String getName() {
        return name;
    }
}
