package logic;

import pieces.Piece;

import java.util.Arrays;

public class Player {
    String name;
    String color;
    java.util.List<Piece> capturedPieces;

    public Player(String name, String color){
        this.name = name;
        this.color = color;
    }

    //Me want to make move
    public void makeMove(String move) {

        InputHandler input = new InputHandler();
        input.validateFormat((input.parseMove(move)));

    }
}