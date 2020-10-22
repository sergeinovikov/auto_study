package main.lesson7.task3.chess;

public class Position {
    private char horizontalPosition;
    private char verticalPosition;

    public Position(String position) {
        this.horizontalPosition = position.charAt(0);
        this.verticalPosition = position.charAt(1);
        if (horizontalPosition < 65 || horizontalPosition > 72 || verticalPosition < 49 || verticalPosition > 56) {
            throw new IllegalArgumentException("Введите корректную ячейку а шахматной доске от A1 до H8");
        }
    }

    public Position() {
    }

    public char getHorizontalPosition() {
        return horizontalPosition;
    }

    public char getVerticalPosition() {
        return verticalPosition;
    }

    public Position setHorizontalPosition(char horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
        return this;
    }

    public Position setVerticalPosition(char verticalPosition) {
        this.verticalPosition = verticalPosition;
        return this;
    }

    public String getStringPosition() {
        return String.valueOf(horizontalPosition) + verticalPosition;
    }
}
