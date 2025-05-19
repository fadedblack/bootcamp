package com.models;

public class Square {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }
}
