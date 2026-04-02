package pieces;


import logic.Board;
import logic.Coordinates;
import logic.Player;


public interface Movable {
    boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece);
}