
import logic.Board;
import logic.GameController;
import logic.Player;
import logic.Time;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println(" _______           _______  _______  _______   \n" +
                "(  ____ \\|\\     /|(  ____ \\(  ____ \\(  ____ \\  \n" +
                "| (    \\/| )   ( || (    \\/| (    \\/| (    \\/  \n" +
                "| |      | (___) || (__    | (_____ | (_____   \n" +
                "| |      |  ___  ||  __)   (_____  )(_____  )  \n" +
                "| |      | (   ) || (            ) |      ) |  \n" +
                "| (____/\\| )   ( || (____/\\/\\____) |/\\____) |  \n" +
                "(_______/|/     \\|(_______/\\_______)\\_______)  \n" +
                "                                               ");

        GameController gameController = new GameController();
        Board board = new Board();
        Player player1 = new Player("Alice", "White");
        Player player2 = new Player("Bob", "Black");
        logic.Time timer = new Time();

        gameController.board = board;
        gameController.players[0] = player1;
        gameController.players[1] = player2;
        gameController.currentTurn = player1;
        gameController.timer = timer;

        System.out.println("Game initialized.");


    }
}
