package logic;

import pieces.Piece;

public class Player {
    String name;
    String color;
    java.util.List<Piece> capturedPieces;

    public Player(String name, String color){
        this.name = name;
        this.color = color;
    }

    void makeMove(String move) {}
}