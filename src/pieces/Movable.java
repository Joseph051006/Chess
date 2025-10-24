package pieces;


import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;


public interface Movable {
    boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece);
}