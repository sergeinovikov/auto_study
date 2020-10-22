package main.lesson7.task3.figues;

import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Bishop extends ChessFigure {

    public Bishop(String position) {
        super(position);
        name = "Слон";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> moves = new HashSet<>();
        int indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        int indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        Position currentMove;
        char letter;
        char digit;
        for (int i = 0; i < 7; i++) {
            if (indexOfLetter + 1 <= 7 && indexOfDigit + 1 <= 7) { //вычисляем доступные ходы по диагонали вправо и вверх
                letter = board.getLetterByIndex(indexOfLetter + 1);
                digit = board.getDigitByIndex(indexOfDigit + 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfLetter++;
            indexOfDigit++;
        }

        indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        for (int i = 0; i < 7; i++) { //вычисляем доступные ходы по диагонали влево и вниз
            if (indexOfLetter - 1 >= 0 && indexOfDigit - 1 >= 0) {
                letter = board.getLetterByIndex(indexOfLetter - 1);
                digit = board.getDigitByIndex(indexOfDigit - 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfLetter--;
            indexOfDigit--;
        }

        indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        for (int i = 0; i < 7; i++) {
            if (indexOfLetter - 1 >= 0 && indexOfDigit + 1 <= 7) { //вычисляем доступные ходы по диагонали влево и вверх
                letter = board.getLetterByIndex(indexOfLetter - 1);
                digit = board.getDigitByIndex(indexOfDigit + 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfLetter--;
            indexOfDigit++;
        }

        indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        for (int i = 0; i < 7; i++) { //вычисляем доступные ходы по диагонали вправо и вниз
            if (indexOfLetter + 1 <= 7 && indexOfDigit - 1 >= 0) {
                letter = board.getLetterByIndex(indexOfLetter + 1);
                digit = board.getDigitByIndex(indexOfDigit - 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfLetter++;
            indexOfDigit--;
        }
        return moves;
    }

    @Override
    public String getName() {
        return name;
    }
}
