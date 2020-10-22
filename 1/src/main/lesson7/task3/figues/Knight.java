package main.lesson7.task3.figues;

import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Knight extends ChessFigure {

    public Knight(String position) {
        super(position);
        name = "Конь";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> moves = new HashSet<>();
        int indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        int indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        Position currentMove;
        char letter;
        char digit;
        if (indexOfLetter - 2 >= 0) { //начинаем вычислять ходы слева - можем пойти вправо на 2 клетки или нет
            letter = board.getLetterByIndex(indexOfLetter - 2);
            if (indexOfDigit - 1 >= 0) { //если можем пойти влево на 1 клетку и вниз
                digit = board.getDigitByIndex(indexOfDigit - 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            if (indexOfDigit + 1 <= 7) { //если можем пойти влево на 1 клетку и вверх
                digit = board.getDigitByIndex(indexOfDigit + 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
        }

        if (indexOfLetter - 1 >= 0) { //начинаем вычислять буквы слева, если мы можем пойти вправо на 1 клетку
            letter = board.getLetterByIndex(indexOfLetter - 1);
            if (indexOfDigit - 2 >= 0) {//если можем пойти влево на 2 клетки и вниз
                digit = board.getDigitByIndex(indexOfDigit - 2);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            if (indexOfDigit + 2 <= 7) {
                digit = board.getDigitByIndex(indexOfDigit + 2); //если можем пойти влево на 2 клетки и вверх
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
        }

        //по аналогии начинаем вычислять ходы справа

        if (indexOfLetter + 2 <= 7) {
            letter = board.getLetterByIndex(indexOfLetter + 2);
            if (indexOfDigit - 1 >= 0) {
                digit = board.getDigitByIndex(indexOfDigit - 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            if (indexOfDigit + 1 <= 7) {
                digit = board.getDigitByIndex(indexOfDigit + 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
        }

        if (indexOfLetter + 1 <= 7) {
            letter = board.getLetterByIndex(indexOfLetter + 1);
            if (indexOfDigit - 2 >= 0) {
                digit = board.getDigitByIndex(indexOfDigit - 2);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            if (indexOfDigit + 2 <= 7) {
                digit = board.getDigitByIndex(indexOfDigit + 2);
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
