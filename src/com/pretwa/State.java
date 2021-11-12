package com.pretwa;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum State {
    BLACK("B"),
    RED("R"),
    EMPTY("E");

    private final String name;

    @Override
    public String toString() {
        return this.name;
    }
}
