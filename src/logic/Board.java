package logic;

import pieces.Piece;
import pieces.*;

import java.util.Arrays;

public class Board {
    Piece[][] grid;

    public Board(){
        grid = new Piece[8][8];
    }



    public void setUpBoard() {

        grid[0][7] = new Rook("White", new Coordinates(0,7), "♖");
        grid[7][7] = new Rook("Black", new Coordinates(7,7), "♜");
        grid[7][0] = new Rook("Black", new Coordinates(7,0), "♜");
        grid[0][0] = new Rook("White", new Coordinates(0,0), "♖");

        grid[0][6] = new Knight("White", new Coordinates(0,6), "♘");
        grid[7][6] = new Knight("Black", new Coordinates(7,6), "♞");
        grid[7][1] = new Knight("Black", new Coordinates(7,1), "♞");
        grid[0][1] = new Knight("White", new Coordinates(0,1), "♘");

        grid[0][5] = new Bishop("White", new Coordinates(0,5), "♗");
        grid[7][5] = new Bishop("Black", new Coordinates(7,5), "♝");
        grid[7][2] = new Bishop("Black", new Coordinates(7,2), "♝");
        grid[0][2] = new Bishop("White", new Coordinates(0,2), "♗");

        grid[0][3] = new Queen("White", new Coordinates(0,3), "♕");
        grid[7][3] = new Queen("Black", new Coordinates(7,3), "♛");

        grid[0][4] = new King("White", new Coordinates(0,4), "♔");
        grid[7][4] = new King("Black", new Coordinates(7,4), "♚");

        grid[1][0] = new Pawn("White", new Coordinates(1,0), "♙");
        grid[1][1] = new Pawn("White", new Coordinates(1,1), "♙");
        grid[1][2] = new Pawn("White", new Coordinates(1,2), "♙");
        grid[1][3] = new Pawn("White", new Coordinates(1,3), "♙");
        grid[1][4] = new Pawn("White", new Coordinates(1,4), "♙");
        grid[1][5] = new Pawn("White", new Coordinates(1,5), "♙");
        grid[1][6] = new Pawn("White", new Coordinates(1,6), "♙");
        grid[1][7] = new Pawn("White", new Coordinates(1,7), "♙");

        grid[6][0] = new Pawn("Black", new Coordinates(6,0), "♟");
        grid[6][1] = new Pawn("Black", new Coordinates(6,1), "♟");
        grid[6][2] = new Pawn("Black", new Coordinates(6,2), "♟");
        grid[6][3] = new Pawn("Black", new Coordinates(6,3), "♟");
        grid[6][4] = new Pawn("Black", new Coordinates(6,4), "♟");
        grid[6][5] = new Pawn("Black", new Coordinates(6,5), "♟");
        grid[6][6] = new Pawn("Black", new Coordinates(6,6), "♟");
        grid[6][7] = new Pawn("Black", new Coordinates(6,7), "♟");


    }
    public void printBoard() {

        for (int x = 0; x < 8; x++){
            for (int y = 0; y < 8; y++){

                if(x > 1 && x < 6) {
                    System.out.print("[   ]");
                } else {
                    System.out.print("[ " + grid[x][y] + " ]");
                }
                if (y == 7) {
                    System.out.print("\n");
                }
            }
        }

    }
    Piece getPieceAt(int x, int y) { return null; }
    void movePiece(int fromX, int fromY, int toX, int toY) {}
    boolean isPathClear(int fromX, int fromY, int toX, int toY) { return false; }
}
