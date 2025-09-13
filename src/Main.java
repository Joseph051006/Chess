import logic.Board;
import logic.Turn;
import pieces.Pawn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Board board = new Board();
        Turn turn = new Turn();
        Pawn pawn = new Pawn();
        String move = "Default";

        System.out.println(" _______           _______  _______  _______   \n" +
                "(  ____ \\|\\     /|(  ____ \\(  ____ \\(  ____ \\  \n" +
                "| (    \\/| )   ( || (    \\/| (    \\/| (    \\/  \n" +
                "| |      | (___) || (__    | (_____ | (_____   \n" +
                "| |      |  ___  ||  __)   (_____  )(_____  )  \n" +
                "| |      | (   ) || (            ) |      ) |  \n" +
                "| (____/\\| )   ( || (____/\\/\\____) |/\\____) |  \n" +
                "(_______/|/     \\|(_______/\\_______)\\_______)  \n" +
                "                                               ");

        System.out.println("Singleplayer");
        System.out.println("Multiplayer");
        System.out.println("Exit");

        Scanner bro = new Scanner(System.in);
        String choice = bro.nextLine();
        

        if(choice.equals("Singleplayer")){
            System.out.println("Try again later");
        } else if (choice.equals("Multiplayer")) {
            board.setUpBoard();
            board.setPieces();
            board.printBoard();

            while (true) {
                System.out.println("'s Turn");
                String tess = bro.nextLine();
                board.reverseBoard();
                board.printBoard();



            }
            }


    }
}
