package com.pretwa;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Move {
    private Integer from;
    private Integer to;

    private Integer pawnHit;
    private boolean hit = false;

    public Move(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }
}
