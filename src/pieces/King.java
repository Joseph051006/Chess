package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;

public class King extends Piece {
    boolean checkmate;
    boolean castle;

    public King(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean canCastle() { return false; }
    boolean isValidMove() { return false; }

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece) {
        return false;
    }

    @Override
    public boolean checkPattern(Coordinates from, Coordinates to, Board board) {
        return false;
    }

}