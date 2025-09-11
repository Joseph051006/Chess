package logic;

import java.util.Arrays;

public class Turn {

    private String[] coordinatesY = {"a", "b", "c", "d", "e", "f", "g", "h"};
    private int[] coordinatesX = {1, 2, 3, 4, 5, 6, 7, 8};
    private String regex = "(?<=.)";


    private String move;


    public String getCoordinates(String move){

        this.move = move;
        String[] split = move.split(regex);
        





        return Arrays.toString(split);
    }



}
