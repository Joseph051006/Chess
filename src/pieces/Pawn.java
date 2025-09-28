package pieces;

class Pawn extends Piece {
    boolean twoMove;
    boolean enPassant;
    boolean promotion;

    void oneForward() {}
    boolean isValidMove() { return false; }
    void promote(Piece newPiece) {}
}





