package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;
import java.util.Objects;

public class Queen extends Piece {
    public Queen(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean isValidMove() { return false; }

    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece) {


        String playerColor = currentTurn.getColor();

        if (Objects.equals(playerColor, selectedPiece.color)){
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

        boolean isDiagonal = Math.abs(to.x - from.x) == Math.abs(to.y - from.y);
        boolean isStraight = (to.x == from.x || to.y == from.y);

        if (!isDiagonal && !isStraight) return false;

        int dx = Integer.compare(to.x, from.x);
        int dy = Integer.compare(to.y, from.y);

        int x = from.x + dx;
        int y = from.y + dy;

        while (x != to.x || y != to.y) {
            if (board.grid[x][y] != null) return false;
            x += dx;
            y += dy;
        }

        return target == null || !target.color.equals(color);
    }


}
