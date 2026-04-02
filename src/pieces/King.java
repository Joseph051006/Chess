package pieces;

import logic.Board;
import logic.Coordinates;
import logic.Player;

import java.util.Objects;

public class King extends Piece {

    public King(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece) {
        String playerColor = currentTurn.getColor();

        if (Objects.equals(playerColor, selectedPiece.color)) {
            checkPattern(from, to, board);
            return true;
        } else {
            System.out.println("Not your turn");
            return false;
        }
    }

    @Override
    public boolean checkPattern(Coordinates from, Coordinates to, Board board) {
        Piece target = board.grid[to.x][to.y];
        String color = board.grid[from.x][from.y].color;
        int dx = Math.abs(to.x - from.x);
        int dy = Math.abs(to.y - from.y);
        if (dx > 1 || dy > 1) return false;
        return target == null || !target.color.equals(color);
    }
}