package logic;

public class Player {
    String name;
    String color;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Boolean makeMove(String move, Board board, Player currentTurn) {
        InputHandler input = new InputHandler(board);
        return input.validateFormat((input.parseMove(move)), currentTurn);
    }
    public String getColor() {
        return color;
    }

}