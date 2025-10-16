package pieces;

import logic.Board;
import logic.Coordinates;

import java.util.List;

public class Queen extends Piece {
    public Queen(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean isValidMove() { return false; }

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board) {
        return false;
    }


}
