package com.pretwa;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Node {
    private List<Move> moveList;

    private List<Node> childNodes;

    private boolean min; // if true it is MIN, if false it is MAX

    private int value;

    public Node() {
        moveList = new ArrayList<>();
        childNodes = new ArrayList<>();
    }

    public Node(boolean min, int value) {
        this.min = min;
        this.value = value;
    }

    public void addChildNodes(List<Move> moveList, boolean min, int value){
        this.moveList.addAll(moveList);
        this.moveList.forEach(move -> childNodes.add(new Node(min,value)));
    }
}
