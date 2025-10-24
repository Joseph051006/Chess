package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;
import java.util.Objects;

public class Bishop extends Piece {
    public Bishop(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean isValidMove() { return false; }

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
    public boolean checkPattern(Coordinates from, Coordinates to, Board board) {
        Piece target = board.grid[to.x][to.y];
        String color = board.grid[from.x][from.y].color;

        // Must move diagonally
        if (Math.abs(to.x - from.x) != Math.abs(to.y - from.y)) return false;

        int dx = Integer.compare(to.x, from.x);
        int dy = Integer.compare(to.y, from.y);

        int x = from.x + dx;
        int y = from.y + dy;

        while (x != to.x || y != to.y) {
            if (board.grid[x][y] != null) return false; // blocked
            x += dx;
            y += dy;
        }

        return target == null || !target.color.equals(color);
    }

}