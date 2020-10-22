package main.lesson7.task3.chess;

public final class ChessBoard {
    private final String letters = "ABCDEFGH";
    private final String digits = "12345678";

    public int getLetterIndex(char letter) {
        return letters.indexOf(letter);
    }

    public int getDigitIndex(char digit) {
        return digits.indexOf(digit);
    }

    public char getLetterByIndex(int index) {
        return letters.charAt(index);
    }

    public char getDigitByIndex(int index) {
        return digits.charAt(index);
    }
}
