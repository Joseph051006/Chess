package logic;

import pieces.Piece;

import java.util.ArrayList;
import java.util.Arrays;

class InputHandler {
    String regex;
    String concat;
    private final String[] ROW = {"a","b","c","d","e","f","g","h"};
    private final String[] COLUMN = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private ArrayList<Integer> coordinates = new ArrayList<Integer>();
    Board board = new Board();
    //Me want to translate for PC
    public InputHandler(Board board){
        this.board = board;
    }



    public Coordinates[] parseMove(String move) {
        removeTo(move);

        String regexTwo = "(?<=.)";
        String[] single = concat.split(regexTwo, 4);
        boolean valid;

        System.out.println(Arrays.deepToString(single));

        for (byte soEnSiech = 0; soEnSiech < 4; soEnSiech++ ) {

            if (soEnSiech == 0 || soEnSiech == 2) {
                rowCoordinates(soEnSiech, single);
            } else {
                columnCoordinates(soEnSiech, single);
            }

        }


        return new Coordinates[]{ (
                new Coordinates(coordinates.get(0), coordinates.get(1))),
                new Coordinates(coordinates.get(1), coordinates.get(3))
        };
    }

    public void removeTo(String move){
        regex = " ";
        String[] split = move.split(regex, 3);
        String from = split[0];
        String to = split[2];
        concat = from.concat(to);

    }

    public void rowCoordinates(byte soEnSiech, String[] single){

        for (byte iterator = 0; iterator < ROW.length; iterator++) {
            if (ROW[iterator].equals(single[soEnSiech])) {

                coordinates.add((int) iterator);

            }
        }

    }

    public void columnCoordinates(byte soEnSiech, String[] single){

        for (byte iterator = 0; iterator < COLUMN.length; iterator++){
            if (COLUMN[iterator].equals(single[soEnSiech])){

                coordinates.add((int) iterator);

            }
        }

    }


    //Me want to check if its valid
    public boolean validateFormat(Coordinates[] move) {

        String[] from = {String.valueOf(coordinates.get(0)), String.valueOf(coordinates.get(1))};
        String[] to = {String.valueOf(coordinates.get(2)), String.valueOf(coordinates.get(3))};
        boolean fromValid = from[0].matches("[1-8]") && from[1].matches("[1-8]");
        boolean toValid = to[0].matches("[1-8]") && to[1].matches("[1-8]");

        board.getPieceAt(coordinates.get(0), coordinates.get(1));
        System.out.println(board.getPieceAt(coordinates.get(0), coordinates.get(1)));


        return (fromValid == toValid);


    }








}
