package main.lesson7.task3.figues;

import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Queen extends ChessFigure {

    public Queen(String position) {
        super(position);
        name = "Ферзь";
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

        indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        letter = board.getLetterByIndex(indexOfLetter);
        for (int i = 0; i < 7; i++) {
            if (indexOfDigit + 1 <= 7) { //вычисляем доступные ходы вверх
                digit = board.getDigitByIndex(indexOfDigit + 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfDigit++;
        }

        indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        for (int i = 0; i < 7; i++) { //вычисляем доступные ходы и вниз
            if (indexOfDigit - 1 >= 0) {
                digit = board.getDigitByIndex(indexOfDigit - 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfDigit--;
        }

        indexOfDigit = board.getDigitIndex(position.getVerticalPosition());
        digit = board.getDigitByIndex(indexOfDigit);
        for (int i = 0; i < 7; i++) {
            if (indexOfLetter - 1 >= 0) { //вычисляем доступные ходы влево
                letter = board.getLetterByIndex(indexOfLetter - 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfLetter--;
        }

        indexOfLetter = board.getLetterIndex(position.getHorizontalPosition());
        for (int i = 0; i < 7; i++) { //вычисляем доступные ходы вправо
            if (indexOfLetter + 1 <= 7) {
                letter = board.getLetterByIndex(indexOfLetter + 1);
                currentMove = new Position().setHorizontalPosition(letter).setVerticalPosition(digit);
                moves.add(currentMove);
            }
            indexOfLetter++;
        }
        return moves;
    }

    @Override
    public String getName() {
        return name;
    }


}
