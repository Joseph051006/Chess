package logic;

import pieces.Piece;
import pieces.*;

public class Board {
    public Piece[][] grid;
    private boolean isBoardFlipped = false;
    public Board() {
        grid = new Piece[8][8];
    }


    public void setUpBoard() {

        this.grid[7][0] = new Rook("white", new Coordinates(7, 0), "♖");
        this.grid[7][7] = new Rook("black", new Coordinates(7, 7), "♜");
        this.grid[0][7] = new Rook("black", new Coordinates(0, 7), "♜");
        this.grid[0][0] = new Rook("white", new Coordinates(0, 0), "♖");

        this.grid[6][0] = new Knight("white", new Coordinates(6, 0), "♘");
        this.grid[6][7] = new Knight("black", new Coordinates(6, 7), "♞");
        this.grid[1][7] = new Knight("black", new Coordinates(1, 7), "♞");
        this.grid[1][0] = new Knight("white", new Coordinates(1, 0), "♘");

        this.grid[5][0] = new Bishop("white", new Coordinates(5, 0), "♗");
        this.grid[5][7] = new Bishop("black", new Coordinates(5, 7), "♝");
        this.grid[2][7] = new Bishop("black", new Coordinates(2, 7), "♝");
        this.grid[2][0] = new Bishop("white", new Coordinates(2, 0), "♗");

        this.grid[3][0] = new Queen("white", new Coordinates(3, 0), "♕");
        this.grid[3][7] = new Queen("black", new Coordinates(3, 7), "♛");

        this.grid[4][0] = new King("white", new Coordinates(4, 0), "♔");
        this.grid[4][7] = new King("black", new Coordinates(4, 7), "♚");

        this.grid[0][1] = new Pawn("white", new Coordinates(0, 1), "♙");
        this.grid[1][1] = new Pawn("white", new Coordinates(1, 1), "♙");
        this.grid[2][1] = new Pawn("white", new Coordinates(2, 1), "♙");
        this.grid[3][1] = new Pawn("white", new Coordinates(3, 1), "♙");
        this.grid[4][1] = new Pawn("white", new Coordinates(4, 1), "♙");
        this.grid[5][1] = new Pawn("white", new Coordinates(5, 1), "♙");
        this.grid[6][1] = new Pawn("white", new Coordinates(6, 1), "♙");
        this.grid[7][1] = new Pawn("white", new Coordinates(7, 1), "♙");
        this.grid[0][6] = new Pawn("black", new Coordinates(0, 6), "♟");
        this.grid[1][6] = new Pawn("black", new Coordinates(1, 6), "♟");
        this.grid[2][6] = new Pawn("black", new Coordinates(2, 6), "♟");
        this.grid[3][6] = new Pawn("black", new Coordinates(3, 6), "♟");
        this.grid[4][6] = new Pawn("black", new Coordinates(4, 6), "♟");
        this.grid[5][6] = new Pawn("black", new Coordinates(5, 6), "♟");
        this.grid[6][6] = new Pawn("black", new Coordinates(6, 6), "♟");
        this.grid[7][6] = new Pawn("black", new Coordinates(7, 6), "♟");

    }

    public void printBoard(Board board) {
        for (int y = 7; y >= 0; y--) {  // Von Reihe 8 bis 1 (7 bis 0)
            for (int x = 0; x < 8; x++) {  // Von Spalte a bis h (0 bis 7)
                if (grid[x][y] == null) {
                    System.out.print("[   ]");
                } else {
                    System.out.print("[ " + grid[x][y] + " ]");
                }
                if (x == 7) {
                    System.out.print("\n");
                }
            }
        }
    }


    Piece getPieceAt(int x, int y, Board board) {

        if (grid[x][y] == null) {
            return null;
        }
        return grid[x][y];


    }

    void movePiece(int fromX, int fromY, int toX, int toY, Board board) {
        System.out.println("movePiece test");
        System.out.println( fromX+ " " + fromY);
        System.out.println(toX + " " + toY);


        Piece piece = board.grid[fromX][fromY];
        if (piece == null){
            System.out.println("No Piece there");
            return;
        }
         // move it to the new square

        board.grid[toX][toY] = board.grid[fromX][fromY];
        board.grid[fromX][fromY] = null;

        board.printBoard(board);

    }

    boolean isPathClear(int fromX, int fromY, int toX, int toY) {
        return false;
    }



    public void switchBoard(Board board) {
        isBoardFlipped = !isBoardFlipped; // Toggle zwischen true/false

        if (isBoardFlipped) {
            // Schwarz unten
            for (int y = 0; y < 8; y++) {
                for (int x = 7; x >= 0; x--) {
                    if (grid[x][y] == null) {
                        System.out.print("[   ]");
                    } else {
                        System.out.print("[ " + grid[x][y] + " ]");
                    }
                    if (x == 0) {
                        System.out.print("\n");
                    }
                }
            }
        } else {
            // Weiß unten
            for (int y = 7; y >= 0; y--) {
                for (int x = 0; x < 8; x++) {
                    if (grid[x][y] == null) {
                        System.out.print("[   ]");
                    } else {
                        System.out.print("[ " + grid[x][y] + " ]");
                    }
                    if (x == 7) {
                        System.out.print("\n");
                    }
                }
            }
        }
    }
}
