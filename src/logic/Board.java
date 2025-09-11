package logic;

public class Board {


    public String[][] board = new String[8][8];
    private final char[] whitePieces = {'♙', '♖', '♙', '♘', '♙', '♗', '♙', '♕', '♙', '♔', '♙', '♗', '♙', '♘', '♙', '♖'};
    private final char[] blackPieces ={'♜', '♟', '♞', '♟', '♝', '♟', '♚', '♟', '♛', '♟', '♝', '♟', '♞', '♟', '♜', '♟'};
    public boolean reversedBoard = false;
    public boolean reversedPieces = false;

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
                System.out.print(this.board[r][c] + " "); // Print not println cause yeah
            }
            System.out.println();
        }

    }

    public void reverseBoard() {

       byte iterator = 0;

        if (!reversedBoard) {
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
            this.reversedBoard = true;
        }else {
            for (int r = 0; r < 8; r++){
                for (int c = 0; c < 8; c++){
                    this.board[c][r] = "[ ]";
                    if (c < 2){
                        this.board[c][r] = "[" + blackPieces[c + iterator] + "]";
                    } else if (c > 5) {
                        this.board[c][r] = "[" + whitePieces[c + iterator - 6] + "]";

                    }
                }
                iterator += 2;
            }
            this.reversedBoard = false;
        }




    }
    public void reversePieces() {

        if (reversedPieces) {
            for (int i = whitePieces.length - 1; i > 0; i--) {
                char temp = whitePieces[i];
                whitePieces[i] = whitePieces[i - 1];
                whitePieces[i - 1] = temp;
            }

            for (byte i = 0; i < blackPieces.length - 1; i++) {
                char temp = blackPieces[i + 1];
                blackPieces[i+1] = blackPieces[i];
                blackPieces[i] = temp;
            }
            this.reversedPieces = false;

        } else  {
            for (byte i = 0; i < whitePieces.length - 1; i++) {
                char temp = whitePieces[i];
                whitePieces[i] = whitePieces[i + 1];
                whitePieces[i + 1] = temp;
            }

            for (int i = blackPieces.length - 1; i > 0; i--) {
                char temp = blackPieces[i];
                blackPieces[i] = blackPieces[i - 1];
                blackPieces[i - 1] = temp;
            }
            this.reversedPieces = true;
        }
        reverseBoard();



    }

}

