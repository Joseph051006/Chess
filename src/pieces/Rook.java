package pieces;

import logic.Board;
import logic.Coordinates;

import java.util.List;

class Rook extends Piece {
    boolean castle;

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