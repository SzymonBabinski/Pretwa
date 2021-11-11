package com.pretwa;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Board {

    private static final List<State> boardState = Arrays.asList(
            State.RED,      // 0
            State.RED,      // 1
            State.RED,      // 2
            State.BLACK,    // 3
            State.BLACK,    // 4
            State.BLACK,    // 5
            State.RED,      // 6
            State.RED,      // 7
            State.RED,      // 8
            State.BLACK,    // 9
            State.BLACK,    // 10
            State.BLACK,    // 11
            State.RED,      // 12
            State.RED,      // 13
            State.RED,      // 14
            State.BLACK,    // 15
            State.BLACK,    // 16
            State.BLACK,    // 17
            State.EMPTY     // 18
    );

    private static final List<List<Integer>> possibleMoves = Arrays.asList(
            Arrays.asList(2,6,7),               // 0
            Arrays.asList(1,3,8),               // 1
            Arrays.asList(2,4,9),               // 2
            Arrays.asList(3,5,10),              // 3
            Arrays.asList(4,6,11),              // 4
            Arrays.asList(1,5,12),              // 5
            Arrays.asList(1,12,8,13),           // 6
            Arrays.asList(2,7,9,14),            // 7
            Arrays.asList(3,8,10,15),           // 8
            Arrays.asList(4,9,11,16),           // 9
            Arrays.asList(5,10,12,17),          // 10
            Arrays.asList(6,11,7,18),           // 11
            Arrays.asList(7,18,14,19),          // 12
            Arrays.asList(8,13,15,19),          // 13
            Arrays.asList(9,14,16,19),          // 14
            Arrays.asList(10,15,17,19),         // 15
            Arrays.asList(11,16,18,19),         // 16
            Arrays.asList(12,17,13,19),         // 17
            Arrays.asList(13,14,15,16,17,18)    // 18
    );

    private static final List<List<Integer>> possibleHits = Arrays.asList(
            Arrays.asList(5,3,13),              // 0
            Arrays.asList(6,4,14),              // 1
            Arrays.asList(1,5,15),              // 2
            Arrays.asList(2,6,16),              // 3
            Arrays.asList(3,1,17),              // 4
            Arrays.asList(4,2,18),              // 5
            Arrays.asList(11,9,19),             // 6
            Arrays.asList(12,10,19),            // 7
            Arrays.asList(7,11,19),             // 8
            Arrays.asList(8,12,19),             // 9
            Arrays.asList(9,7,19),              // 10
            Arrays.asList(10,8,19),             // 11
            Arrays.asList(17,15,1,16),          // 12
            Arrays.asList(18,16,2,17),          // 13
            Arrays.asList(13,17,3,18),          // 14
            Arrays.asList(14,18,4,13),          // 15
            Arrays.asList(15,13,5,14),          // 16
            Arrays.asList(16,14,6,15),          // 17
            Arrays.asList(7,8,9,10,11,12)       // 18
    );
}
