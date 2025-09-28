package pieces;

class King extends Piece {
    boolean checkmate;
    boolean castle;

    boolean canCastle() { return false; }
    boolean isValidMove() { return false; }
}