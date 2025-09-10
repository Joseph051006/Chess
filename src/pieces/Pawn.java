package pieces;

import logic.Board;
import logic.Pieces;


public class Pawn extends Pieces {

    Board board = new Board();

    private boolean twoMove = true;
    private boolean enPassant = false;
    private boolean promotion = false;

    public void oneForward(){

        board.board[3][2] = board.board[2][1];
        board.printBoard();

    }







}


