package pieces;

import logic.Coordinates;


public abstract class Piece implements Movable {
    public String color;
    Coordinates position;
    String icon;
    int value;
    boolean captured;

    @Override
    public String toString() {
        return icon;
    }

    public Piece(String color, Coordinates position, String icon) {
        this.color = color;
        this.position = position;
        this.icon = icon;
    }

    boolean isSameColor(Piece other) {
        return false;
    }
}
