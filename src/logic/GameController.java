package logic;

import java.util.Scanner;

public class GameController {
    public Board board = new Board();
    public Player[] players = new Player[2];
    public Player currentTurn;
    public Time timer;
    Player player2 = null;
    Player player1 = null;
    public int fromX;
    public int fromY;
    public int toX;
    public int toY;
    Scanner bro = new Scanner(System.in);
    public GameController(){



    }


    public void startGame() {
        createPlayer();
        board.setUpBoard();
        board.printBoard(board);
        System.out.println("Game initialized.");
        playMove();
    }
    public void switchTurn(Player currentTurn, Board board) {

        if (currentTurn == player1 ){
            this.currentTurn = player2;
            board.switchBoard(board);
        }else {
            this.currentTurn = player1;
        }

    }
    public void playMove() {
        if (currentTurn == player1){


            System.out.println("Code of player one");
            if ((possible(player1))){
                switchTurn(currentTurn, board);
            }else {
                System.out.println("Okay and why?");
            }



        }else{
            System.out.println("code of player Two");
        }






    }

    void createPlayer() {

        Scanner bro = new Scanner(System.in);

        for (byte increment = 1; increment < 3; increment++) {

            if (increment == 1) {
                System.out.println("Please Enter your name Player " + increment);
                player2 = new Player(bro.nextLine(), "Black");
            } else {
                System.out.println("Please Enter your name Player " + increment);
                player1 = new Player(bro.nextLine(), "White");
            }

            currentTurn = player1;

        }
    }

    public boolean possible(Player player){
        bro.nextLine();
        return player.makeMove(bro.nextLine(), board);
    }


    boolean isCheck(String color) { return false; }
    boolean isCheckmate(String color) { return false; }
}