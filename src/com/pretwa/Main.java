package com.pretwa;

import static com.pretwa.Board.checkIfCanDoMove;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();

        board.printBoard();

        checkIfCanDoMove(17,18,State.RED);
    }
}
