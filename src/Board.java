import java.util.Arrays;

public class Board {


    public String[][] board = new String[8][8];
    private final char[] pieces = {'♖', '♙', '♘', '♙', '♗', '♙', '♕', '♙', '♔', '♙', '♗', '♙', '♘', '♙', '♖', '♙'};
    private boolean reversedPieces = false;

    public void setUpBoard() {


        byte iterator = 0;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                this.board[c][r] = "[ ]";
                if (c < 2) {
                    if (reversedPieces) {
                        reversedPieces = false;
                        reversePieces();
                    }
                    this.board[c][r] = board[c][r] = "[" + pieces[c + iterator] + "]";
                } else if (c > 5) {

                    if (!reversedPieces) {
                        reversedPieces = true;
                        reversePieces();
                    }
                    this.board[c][r] = board[c][r] = "[" + pieces[c + iterator - 6] + "]";
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

    public void reversePieces() {

        if (reversedPieces) {
            for (byte i = 0; i < pieces.length - 1; i++) {
                char temp = pieces[i];
                pieces[i] = pieces[i + 1];
                pieces[i + 1] = temp;
            }
        } else {
            for (byte i = 0; i < pieces.length - 1; i++) {
                char temp = pieces[i];
                pieces[i] = pieces[i + 1];
                pieces[i + 1] = temp;
            }

            System.out.println(Arrays.toString(pieces));
        }

    }
}

