package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;

import java.util.List;

public class Rook extends Piece {

    boolean castle;

    public Rook(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean isValidMove() { return false; }

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, GameController currentTurn) {
        System.out.println("Rook");
        return false;
    }

}