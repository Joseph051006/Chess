package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.Objects;

public class Pawn extends Piece {
    public Pawn(String color, Coordinates position, String icon) {
        super(color, position, icon);
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
        return (dx == 1 || dx == -1) && dy == direction && target != null && !target.color.equals(color);
    }
}


