package pieces;

import logic.Board;
import logic.Coordinates;
import logic.Player;


public abstract class Piece implements Movable {
    public String color;
    Coordinates position;
    String icon;

    @Override
    public String toString() {
        return icon;
    }

    public Piece(String color, Coordinates position, String icon) {
        this.color = color;
        this.position = position;
        this.icon = icon;
    }

    public abstract boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece);

    public abstract boolean checkPattern(Coordinates from, Coordinates to, Board board);
}
