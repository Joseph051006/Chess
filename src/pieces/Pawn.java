package pieces;

import logic.Board;
import logic.Pieces;
import logic.Turn;


public class Pawn extends Pieces {





    public String[][] currentState;

    Turn turn = new Turn();


    private boolean twoMove = true;
    private boolean enPassant = false;
    private boolean promotion = false;

    public void oneForward(){


        board.pieces[2][3] = board.pieces[1][2];
        board.board = board.pieces.clone();
        board.printBoard();

    }







}


