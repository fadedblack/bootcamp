package com.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void areaTest() {
        Square square = new Square(4);
        assertEquals(16, square.area());

        square = new Square(12);
        assertEquals(144, square.area());
    }
}