package main.lesson7.task3.figues;

import main.lesson7.task3.chess.*;

import java.util.Set;

public abstract class ChessFigure {
    protected String name;
    protected Position position;
    protected Player color;
    protected ChessBoard board;

    public ChessFigure(Player color, String position) {
        this.position = new Position(position);
        this.board = new ChessBoard();
        this.color = color;
    }

    public ChessFigure(String position) {
        this.position = new Position(position);
        this.board = new ChessBoard();
    }

    public abstract Set<Position> getAvailableMoves();

    public abstract String getName();

}
