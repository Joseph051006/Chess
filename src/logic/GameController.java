package logic;

class GameController {
    Board board;
    Player[] players = new Player[2];
    Player currentTurn;
    Time timer;

    void startGame() {}
    void switchTurn() {}
    void playMove(String move) {}
    boolean isCheck(String color) { return false; }
    boolean isCheckmate(String color) { return false; }
}