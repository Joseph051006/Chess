package pieces;

import logic.Board;
import logic.Coordinates;
import logic.GameController;
import logic.Player;

import java.util.List;
import java.util.Objects;

public class Knight extends Piece {
    boolean jumping;

    public Knight(String color, Coordinates position, String icon) {
        super(color, position, icon);
    }


    @Override
    public boolean isValidMove(Coordinates from, Coordinates to, Board board, Player currentTurn, Piece selectedPiece) {

        String playerColor = currentTurn.getColor();

        if (Objects.equals(playerColor, selectedPiece.color)){
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

        int dx = Math.abs(to.x - from.x);
        int dy = Math.abs(to.y - from.y);


        if (!((dx == 2 && dy == 1) || (dx == 1 && dy == 2))) return false;

        return target == null || !target.color.equals(color);
    }


}