package logic;

import pieces.*;

import java.util.ArrayList;
import java.util.Arrays;

class InputHandler {
    String regex;
    String concat;
    private final String[] ROW = {"a", "b", "c", "d", "e", "f", "g", "h"};
    private final String[] COLUMN = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private final ArrayList<Integer> coordinates = new ArrayList<Integer>();
    Board board = new Board();
    GameController game = new GameController();
    GameController currentTurn;

    public InputHandler(Board board) {
        this.board = board;
    }


    public Coordinates[] parseMove(String move) {
        removeTo(move);

        String regexTwo = "(?<=.)";
        String[] single = concat.split(regexTwo, 4);
        boolean valid;

        System.out.println(Arrays.deepToString(single));

        for (byte distribute = 0; distribute < 4; distribute++) {

            if (distribute == 0 || distribute == 2) {
                rowCoordinates(distribute, single);
            } else {
                columnCoordinates(distribute, single);
            }

        }


        return new Coordinates[]{(
                new Coordinates(coordinates.get(0), coordinates.get(1))),
                new Coordinates(coordinates.get(2), coordinates.get(3))
        };
    }

    public void removeTo(String move) {
        regex = " ";
        String[] split = move.split(regex, 3);
        String from = split[0];
        String to = split[2];
        concat = from.concat(to);

    }

    public void rowCoordinates(byte soEnSiech, String[] single) {

        for (byte iterator = 0; iterator < ROW.length; iterator++) {
            if (ROW[iterator].equals(single[soEnSiech])) {

                coordinates.add((int) iterator);

            }
        }

    }

    public void columnCoordinates(byte soEnSiech, String[] single) {

        for (byte iterator = 0; iterator < COLUMN.length; iterator++) {
            if (COLUMN[iterator].equals(single[soEnSiech])) {

                coordinates.add((int) iterator);

            }
        }

    }


    public boolean validateFormat(Coordinates[] move) {

        String[] validFrom = {String.valueOf(coordinates.get(0)), String.valueOf(coordinates.get(1))};
        String[] validTo = {String.valueOf(coordinates.get(2)), String.valueOf(coordinates.get(3))};
        boolean fromValid = validFrom[0].matches("[1-8]") && validFrom[1].matches("[1-8]");
        boolean toValid = validTo[0].matches("[1-8]") && validTo[1].matches("[1-8]");


        Piece selectedPiece = board.getPieceAt(coordinates.get(0), coordinates.get(1), board);
        System.out.println(selectedPiece);

        if (selectedPiece == null) {
            System.out.println("No Piece there");
            return false;
        } else {
            Coordinates to = new Coordinates(coordinates.get(2), coordinates.get(3));
            Coordinates from = new Coordinates(coordinates.get(0), coordinates.get(1));

            System.out.println("ValidateFromat test");
            System.out.println(from.x + " " + from.y);
            System.out.println(to.x + " " + to.x);

            switch (selectedPiece) {
                case Pawn pawn -> selectedPiece.isValidMove(from, to, board, currentTurn);
                case Knight knight -> selectedPiece.isValidMove(from, to, board, currentTurn);
                case Bishop bishop -> selectedPiece.isValidMove(from, to, board, currentTurn);
                case King king -> selectedPiece.isValidMove(from, to, board, currentTurn);
                case Queen queen -> selectedPiece.isValidMove(from, to, board, currentTurn);
                case Rook rook -> selectedPiece.isValidMove(from, to, board, currentTurn);
                default -> {
                    System.out.println("lol");
                }


            }
            if (selectedPiece.isValidMove(from, to, board, currentTurn)) {

                board.movePiece(from.x, from.y,to.x, to.y, board);

                return true;


            }

        }
        return false;

    }
}
