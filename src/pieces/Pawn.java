package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.Objects;

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
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece) {

        System.out.println("Pawn");

        String playerColor = currentTurn.getColor();

        if (Objects.equals(playerColor, selectedPiece.color)){
        System.out.println(playerColor);
            checkPattern(from, to, board);
        return true;

        } else {
            System.out.println("Not your turn");
            System.out.println(playerColor);
            return false;
        }

    }

    @Override
    public boolean checkPattern(Coordinates from, Coordinates to, Board board){
        String color = board.grid[from.x][from.y].color;
        int direction = color.equals("white") ? -1 : 1;
        Piece target = board.grid[to.x][to.y];


        if (to.x == from.x + direction && to.y == from.y && target == null) {
            return true;
        }

        // 2. Two steps forward (first move)
        if ((color.equals("white") && from.x == 6) || (color.equals("black") && from.x == 1)) {
            if (to.x == from.x + 2 * direction && to.y == from.y) {
                if (board.grid[from.x + direction][from.y] == null && target == null) {
                    return true;
                }
            }
        }

        // 3. Capture
        if (to.x == from.x + direction && Math.abs(to.y - from.y) == 1) {
            if (target != null && !target.color.equals(color)) {
                return true;
            }
        }


        return false;
    }



}




