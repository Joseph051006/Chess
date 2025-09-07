public class Board {



        public String[][]board = new String[8][8];
        public void setUpBoard(){

            char[] pieces = {'♖','♙','♘','♙','♗','♙','♕','♙','♔','♙','♗','♙','♘','♙','♖','♙'};

            byte iterator = 0;
            for (int r = 0; r < 8; r++ ){
                for (int c = 0; c < 8; c++){
                    this.board[c][r] = "[ ]";
                    if (c < 2){
                        this.board[c][r] = board[c][r] = "[" + pieces[c + iterator ] + "]";
                    } else if (c > 5) {
                        this.board[c][r] = board[c][r] = "[" + pieces[c + iterator - 6] + "]";

                    }

                }
                iterator += 2;
            }

        }



    public void printBoard(){


        for (int r = 0; r < 8; r++){
            for (int c = 0; c < 8; c++){
                System.out.print(board[r][c] + " "); // Print not print cause yeah
            }
            System.out.println();
        }
    }

}
