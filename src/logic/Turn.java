package logic;

import java.util.Arrays;

public class Turn {

    Board board = new Board();

    private String[] coordinatesY = {"a", "b", "c", "d", "e", "f", "g", "h"};
    private int[] coordinatesX = {1, 2, 3, 4, 5, 6, 7, 8};
    private String regex = "(?<=.)";

    public String[][] currentState;

    public String[][] getBoard() {
        return currentState = board.board  ;
    }

    private String move;


    public void getCoordinates(String move) {

        this.move = move;
        byte index = 0;
        String[] split = move.split(regex);
        for (byte x = 0; x < split.length - 1; x++) {
            for (byte i = 0; i < coordinatesY.length - 1; i++) {
                if (coordinatesY[i].equals(split[x])) {

                }

            }


            }
    }



    }
