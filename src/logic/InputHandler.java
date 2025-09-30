package logic;

import java.util.ArrayList;
import java.util.Arrays;

class InputHandler {
    String regex;
    String concat;
    private final String[] ROW = {"a","b","c","d","e","f","g","h"};
    private final String[] COLUMN = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private ArrayList<String> coordinates = new ArrayList<String>();

    //Me want to translate for PC
    public Coordinates parseMove(String move) {
        removeTo(move);

        String regexTwo = "(?<=.)";
        String[] single = concat.split(regexTwo, 4);
        System.out.println(Arrays.deepToString(single));

        for (byte soEnSiech = 0; soEnSiech < 4; soEnSiech++ ) {

            if (soEnSiech == 0 || soEnSiech == 2) {
                rowCoordinates(soEnSiech, single);
            } else {
                columnCoordinates(soEnSiech, single);
            }

        }
        for (String i : coordinates) {
            System.out.println(i);
        }

        return null;
    }
    //Me want to check if its valid
    public boolean validateFormat(String move) {
        return false;

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

                coordinates.add(String.valueOf(iterator));

            }
        }

    }

    public void columnCoordinates(byte soEnSiech, String[] single){

        for (byte iterator = 0; iterator < COLUMN.length; iterator++){
            if (COLUMN[iterator].equals(single[soEnSiech])){

                coordinates.add(String.valueOf(iterator + 1));

            }
        }

    }







}
