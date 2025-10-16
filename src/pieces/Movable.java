package pieces;


import logic.Board;
import logic.Coordinates;
import java.util.List;


public interface Movable {
    boolean isValidMove(Coordinates from, Coordinates to, Board board);
}