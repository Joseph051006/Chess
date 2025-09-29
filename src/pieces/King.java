package pieces;

import logic.Board;
import logic.Coordinates;

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
    public boolean isValidMove(Coordinates from, Coordinates to, Board board) {
        return false;
    }

    @Override
    public List<Coordinates> getPossibleMoves(Board board) {
        return List.of();
    }
}