package pieces;

import logic.Board;
import logic.Coordinates;

import java.util.List;

public class Pawn extends Piece {
    boolean twoMove;
    boolean enPassant;
    boolean promotion;

    public Pawn(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

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





