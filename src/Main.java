import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Board board = new Board();

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
            while (true) {
                board.printBoard();
                String move = bro.nextLine();
                board.reverseBoard();
            }
            }


    }
}
