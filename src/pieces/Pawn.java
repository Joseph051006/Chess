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


        String playerColor = currentTurn.getColor();

        if (Objects.equals(playerColor, selectedPiece.color)) {

            return checkPattern(from, to, board);

        } else {
            System.out.println("Not your turn");

            return false;
        }

    }

    @Override
    public boolean checkPattern(Coordinates from, Coordinates to, Board board) {
        Piece target = board.grid[to.x][to.y];
        String color = board.grid[from.x][from.y].color;


        int direction = color.equals("white") ? 1 : -1; // white moves down, black moves up

        int dx = to.x - from.x;
        int dy = to.y - from.y;


        if (dx == 0 && dy == direction && target == null) {
            return true;
        }


        boolean isFirstMove = (color.equals("white") && from.y == 1) || (color.equals("black") && from.y == 6);
        if (dx == 0 && dy == 2 * direction && isFirstMove) {

            if (board.grid[from.x][from.y + direction] == null && target == null) {
                return true;
            }
        }


        if ((dx == 1 || dx == -1) && dy == direction && target != null && !target.color.equals(color)) {
            return true;
        }

        return false;
    }
}


