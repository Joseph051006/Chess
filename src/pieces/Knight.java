package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;

public class Knight extends Piece {
    boolean jumping;

    public Knight(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean isValidMove() { return false; }

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece) {
        System.out.println("Knight");
        return false;
    }

    @Override
    public boolean checkPattern(Coordinates from, Coordinates to, Board board) {
        return false;
    }

}