package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;
import java.util.Objects;

public class King extends Piece {
    boolean checkmate;
    boolean castle;

    public King(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }

    boolean canCastle() { return false; }
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

        int dx = Math.abs(to.x - from.x);
        int dy = Math.abs(to.y - from.y);

        // King moves one square in any direction
        if (dx > 1 || dy > 1) return false;

        return target == null || !target.color.equals(color);
    }

}