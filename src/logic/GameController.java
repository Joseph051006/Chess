package logic;

import pieces.King;
import pieces.Piece;

import java.util.Scanner;

public class GameController {
    public Board board = new Board();
    public Player[] players = new Player[2];
    public Player currentTurn;
    Player player2 = null;
    Player player1 = null;
    Scanner bro = new Scanner(System.in);

    public GameController() {


    }


    public void startGame() {
        createPlayer();
        board.setUpBoard();
        board.printBoard(board);
        System.out.println("Game initialized.");
        playMove();
    }

    public void switchTurn(Player currentTurn, Board board) {

        if (currentTurn == player1) {
            this.currentTurn = player2;
            board.switchBoard(board);
            playMove();
        } else {
            this.currentTurn = player1;
            board.switchBoard(board);
            playMove();

        }

    }

    public void playMove() {
        boolean validMove = false;

        while (!validMove) {
            if (currentTurn == player1) {
                System.out.println(player1.name + " 's turn");

                if (possible(player1)) {
                    validMove = true;

                    if (isCheckmate("white", board)) {
                        System.out.println("Black wins!");
                        System.exit(0);
                    }

                    switchTurn(currentTurn, board);
                } else {
                    System.out.println("Invalid move. Try again.");
                }

            } else {
                System.out.println(player2.name + " 's turn");

                if (possible(player2)) {
                    validMove = true;

                    if (isCheckmate("black", board)) {
                        System.out.println("White wins!");
                        System.exit(0);
                    }

                    switchTurn(currentTurn, board);
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
        }
    }

    void createPlayer() {

        Scanner bro = new Scanner(System.in);

        for (byte increment = 1; increment < 3; increment++) {

            if (increment == 1) {
                System.out.println("Please Enter your name Player " + increment);
                player2 = new Player(bro.nextLine(), "black");
            } else {
                System.out.println("Please Enter your name Player " + increment);
                player1 = new Player(bro.nextLine(), "white");
            }

            currentTurn = player1;

        }
    }

    public boolean possible(Player player) {
        String moveInput = bro.nextLine();
        boolean moveResult = player.makeMove(moveInput, board, currentTurn);
//        System.out.println("Move result: " + moveResult);
        return moveResult;
    }



    public boolean isCheckmate(String color, Board board) {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Piece piece = board.grid[x][y];
                if (piece != null && piece instanceof King && piece.color.equals(color)) {
                    return false;
                }
            }
        }


        return true;
    }
}