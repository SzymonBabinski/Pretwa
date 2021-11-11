package com.pretwa;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Board {

    private static final Map<Integer, State> boardState = new HashMap<>() {{
        put(0, State.RED);
        put(1, State.RED);
        put(2, State.RED);

        put(3, State.BLACK);
        put(4, State.BLACK);
        put(5, State.BLACK);

        put(6, State.RED);
        put(7, State.RED);
        put(8, State.RED);

        put(9, State.BLACK);
        put(10, State.BLACK);
        put(11, State.BLACK);

        put(12, State.RED);
        put(13, State.RED);
        put(14, State.RED);

        put(15, State.BLACK);
        put(16, State.BLACK);
        put(17, State.BLACK);

        put(18, State.EMPTY);
    }};

    private static final Map<Integer, List<Integer>> possibleMoves = new HashMap<>() {{
        put(0, Arrays.asList(2, 6, 7));
        put(1, Arrays.asList(1, 3, 8));
        put(2, Arrays.asList(2, 4, 9));
        put(3, Arrays.asList(3, 5, 10));
        put(4, Arrays.asList(4, 6, 11));
        put(5, Arrays.asList(1, 5, 12));
        put(6, Arrays.asList(1, 12, 8, 13));
        put(7, Arrays.asList(2, 7, 9, 14));
        put(8, Arrays.asList(3, 8, 10, 15));
        put(9, Arrays.asList(4, 9, 11, 16));
        put(10, Arrays.asList(5, 10, 12, 17));
        put(11, Arrays.asList(6, 11, 7, 18));
        put(12, Arrays.asList(7, 18, 14, 19));
        put(13, Arrays.asList(8, 13, 15, 19));
        put(14, Arrays.asList(9, 14, 16, 19));
        put(15, Arrays.asList(10, 15, 17, 19));
        put(16, Arrays.asList(11, 16, 18, 19));
        put(17, Arrays.asList(12, 17, 13, 19));
        put(18, Arrays.asList(13, 14, 15, 16, 17, 18));
    }};

    private static final Map<Integer, List<Integer>> possibleHits = new HashMap<>() {{
        put(0, Arrays.asList(5, 3, 13));
        put(1, Arrays.asList(6, 4, 14));
        put(2, Arrays.asList(1, 5, 15));
        put(3, Arrays.asList(2, 6, 16));
        put(4, Arrays.asList(3, 1, 17));
        put(5, Arrays.asList(4, 2, 18));
        put(6, Arrays.asList(11, 9, 19));
        put(7, Arrays.asList(12, 10, 19));
        put(8, Arrays.asList(7, 11, 19));
        put(9, Arrays.asList(8, 12, 19));
        put(10, Arrays.asList(9, 7, 19));
        put(11, Arrays.asList(10, 8, 19));
        put(12, Arrays.asList(17, 15, 1, 16));
        put(13, Arrays.asList(18, 16, 2, 17));
        put(14, Arrays.asList(13, 17, 3, 18));
        put(15, Arrays.asList(14, 18, 4, 13));
        put(16, Arrays.asList(15, 13, 5, 14));
        put(17, Arrays.asList(16, 14, 6, 15));
        put(18, Arrays.asList(7, 8, 9, 10, 11, 12));
    }};

    /**
     * Checks if player can do a move
     *
     * @param from        integer number from which we do a move (0-19)
     * @param to          integer number to which we want do a move (0-19)
     * @param playerState the state of the player making the move
     * @return true if move is possible, false otherwise
     */
    private boolean checkIfCanDoMove(Integer from, Integer to, State playerState) {
        State enemyState = playerState.equals(State.RED) ? State.BLACK : State.RED;
        return possibleMoves.get(from).contains(to) &&
                (boardState.get(to).equals(enemyState) || boardState.get(to).equals(State.EMPTY));
    }
}
