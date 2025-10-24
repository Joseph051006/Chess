
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

        GameController gameController = new GameController();


        gameController.startGame();



       
    }




    }


