package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;
import java.util.Objects;

public class Rook extends Piece {

    boolean castle;

    public Rook(String color, Coordinates position, String icon) {
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

        // Must move in a straight line
        if (from.x != to.x && from.y != to.y) return false;

        // Check path between from and to
        int dx = Integer.compare(to.x, from.x);
        int dy = Integer.compare(to.y, from.y);

        int x = from.x + dx;
        int y = from.y + dy;

        while (x != to.x || y != to.y) {
            if (board.grid[x][y] != null) return false; // path blocked
            x += dx;
            y += dy;
        }

        // Target must be empty or opposite color
        return target == null || !target.color.equals(color);

    }

}