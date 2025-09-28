package pieces;

import logic.Board;
import logic.Coordinates;


public abstract class Piece implements Movable {
    String color;
    Coordinates position;
    int value;
    boolean captured;

    boolean isSameColor(Piece other) { return false; }
}