import java.util.Arrays;

public  class Board {

    public String[][]board = new String[8][8];
    public void setUpBoard(){

       for (int r = 0; r < 8; r++ ){
           for (int c = 0; c < 8; c++){
               this.board[c][r] = "[]";
           }
           this.board[7][r] = "[]\n";

       }
        System.out.println(Arrays.deepToString(board));

    }

}
