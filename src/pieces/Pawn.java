package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

public class Pawn extends Piece {
    boolean twoMove;
    boolean enPassant;
    boolean promotion;
    public int x;
    private int y;


    GameController currentTurn = new GameController();

    public Pawn(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }







    void promote(Piece newPiece) {
    }

    private String checkColor(Board board, Coordinates from) {
        if (board.grid[from.x][from.y].color.equals("white")) {
            System.out.println("Its White");
            return "white";
        } else {
            System.out.println("Its Black");
            return "black";
        }
    }


    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, GameController gameController) {

        System.out.println("Pawn");
        return true;
    }
}




