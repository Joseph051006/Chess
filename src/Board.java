import java.util.Arrays;

public class Board {


    public String[][] board = new String[8][8];
    private final char[] whitePieces = {'♙', '♖', '♙', '♘', '♙', '♗', '♙', '♕', '♙', '♔', '♙', '♗', '♙', '♘', '♙', '♖'};
    private final char[] blackPieces ={'♜', '♟', '♞', '♟', '♝', '♟', '♚', '♟', '♛', '♟', '♝', '♟', '♞', '♟', '♜', '♟'};
    private boolean reversedBoard = false;
    private boolean reversedPieces = false;

    public void setUpBoard() {


        byte iterator = 0;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                this.board[c][r] = "[ ]";
                if (c < 2) {
                    this.board[c][r] = board[c][r] = "[" + blackPieces[c + iterator] + "]";
                } else if (c > 5) {


                    this.board[c][r] = board[c][r] = "[" + whitePieces[c + iterator - 6] + "]";
                }

            }
            iterator += 2;
        }


    }


    public void printBoard() {


        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                System.out.print(board[r][c] + " "); // Print not print cause yeah
            }
            System.out.println();
        }
    }

    public void reverseBoard() {

       byte iterator = 0;

       for (int r = 0; r < 8; r++){
           for (int c = 0; c < 8; c++){
               this.board[c][r] = "[ ]";
               if (c < 2){
                   this.board[c][r] = "[" + whitePieces[c + iterator] + "]";
               } else if (c > 5) {
                   this.board[c][r] = "[" + blackPieces[c + iterator - 6] + "]";

               }
           }
           iterator += 2;
       }



    }
    public void reversePieces() {

        if (!reversedPieces) {
            for (byte i = 0; i < whitePieces.length - 1; i++) {
                char temp = whitePieces[i + 1];
                whitePieces[i + 1] = whitePieces[i];
                whitePieces[i] = temp;
            }

            for (byte i = 0; i < blackPieces.length - 1; i++) {
                char temp = blackPieces[i];
                blackPieces[i] = blackPieces[i + 1];
                blackPieces[i + 1] = temp;
            }
            reversedPieces = true;

        } else  {
            for (byte i = 0; i < whitePieces.length - 1; i++) {
                char temp = whitePieces[i];
                whitePieces[i] = whitePieces[i + 1];
                whitePieces[i + 1] = temp;
            }

            for (byte i = 0; i < blackPieces.length - 1; i++) {
                char temp = blackPieces[i + 1];
                blackPieces[i + 1] = blackPieces[i];
                blackPieces[i] = temp;
            }
        }


    }

}

