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

    public Boolean makeMove(String move, Board board) {

        InputHandler input = new InputHandler(board);

        return input.validateFormat((input.parseMove(move)));

    }

    public void createPlayer(){

    }
}