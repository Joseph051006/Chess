
import logic.Board;
import logic.GameController;
import logic.Player;
import logic.Time;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println(" _______           _______  _______  _______   \n" +
                "(  ____ \\|\\     /|(  ____ \\(  ____ \\(  ____ \\  \n" +
                "| (    \\/| )   ( || (    \\/| (    \\/| (    \\/  \n" +
                "| |      | (___) || (__    | (_____ | (_____   \n" +
                "| |      |  ___  ||  __)   (_____  )(_____  )  \n" +
                "| |      | (   ) || (            ) |      ) |  \n" +
                "| (____/\\| )   ( || (____/\\/\\____) |/\\____) |  \n" +
                "(_______/|/     \\|(_______/\\_______)\\_______)  \n" +
                "                                               ");

        System.out.println("Welcome to Terminal Chess");
        Scanner bro = new Scanner(System.in);
        System.out.println("Consider: Player One will always be White.");

        Player player2 = null;
        Player player1 = null;

        for (byte increment = 1; increment < 3; increment++) {

            if (increment == 1) {
                System.out.println("Please Enter your name Player " + increment);
                player2 = new Player(bro.nextLine(), "Black");
            } else {
                System.out.println("Please Enter your name Player " + increment);
                player1 = new Player(bro.nextLine(), "White");
            }

        }


        GameController gameController = new GameController();
        Board board = new Board();


        Time timer = new Time();

        gameController.board = board;
        gameController.players[0] = player1;
        gameController.players[1] = player2;
        gameController.currentTurn = player1;
        gameController.timer = timer;

        System.out.println("Game initialized.");

        board.setUpBoard();
        board.printBoard();



    }




    }


