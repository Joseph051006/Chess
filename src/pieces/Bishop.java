package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;

import java.util.List;

public class Bishop extends Piece {
    public Bishop(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean isValidMove() { return false; }

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, GameController currentTurn) {
        return false;
    }

}