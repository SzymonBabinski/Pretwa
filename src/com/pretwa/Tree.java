package com.pretwa;

import java.util.List;
import java.util.Map;

import static com.pretwa.Board.*;

public class Tree {
    private Node node = new Node();

    private final Board board = new Board();

//    public void createTree(State playerState) {
//        createTree(node, 0, playerState, true, board.getBoardState());
//    }



//    private void createTree(Node node, int level, State player, boolean min, Map<Integer, State> boardState) {
//        Map<Integer, State> boardCopy = copyBoardState(boardState);
//
//        State enemy = getEnemy(player);
//
//        if (level == 0) {
//            List<Move> possibleHits = generateHits(player, boardCopy);
//
//            node.addChildNodes(possibleHits, min, 0);
//
//            if (possibleHits.isEmpty()) {
//                List<Move> possibleMoves = generateMoves(player, boardCopy);
//
//                node.addChildNodes(possibleMoves, min, 0);
//            }
//
//            node.getChildNodes().forEach(childNode -> createTree(childNode, level + 1, enemy, !min, boardCopy));
//        } else{
//
//        }
//
//    }

}
