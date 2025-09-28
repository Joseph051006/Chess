package logic;

public class GameController {
    public Board board;
    public Player[] players = new Player[2];
    public Player currentTurn;
    public Time timer;

    void startGame() {}
    void switchTurn() {}
    void playMove(String move) {}
    boolean isCheck(String color) { return false; }
    boolean isCheckmate(String color) { return false; }
}