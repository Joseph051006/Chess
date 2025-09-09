public class Board {


    public String[][] board = new String[8][8];
    private final char[] whitePieces = {'♙', '♖', '♙', '♘', '♙', '♗', '♙', '♔', '♙', '♕', '♙', '♗', '♙', '♘', '♙', '♖'};
    private final char[] blackPieces ={'♜', '♟', '♞', '♟', '♝', '♟', '♛', '♟', '♚', '♟', '♝', '♟', '♞', '♟', '♜', '♟'};
    private boolean reversedBoard = false;

    public void setUpBoard() {


        byte iterator = 0;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                this.board[c][r] = "[ ]";
                if (c < 2) {
//                    if (reversedBoard) {
//                        reversedBoard = false;
//                        reverseBoard();
//                    }
                    this.board[c][r] = board[c][r] = "[" + blackPieces[c + iterator] + "]";
                } else if (c > 5) {

//                    if (!reversedBoard) {
//                        reversedBoard = true;
//                        reverseBoard();
//                    }
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

}

