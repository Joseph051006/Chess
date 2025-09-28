package pieces;

import logic.Board;
import logic.Coordinates;

import java.util.List;

class Pawn extends Piece {
    boolean twoMove;
    boolean enPassant;
    boolean promotion;

    void oneForward() {}
    boolean isValidMove() { return false; }
    void promote(Piece newPiece) {}

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board) {
        return false;
    }

    @Override
    public List<Coordinates> getPossibleMoves(Board board) {
        return List.of();
    }
}





