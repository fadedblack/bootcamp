package com.models;

import com.models.shapes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testSquareArea() {
        Square square = new Square(4);
        assertEquals(16, square.area());

        square = new Square(12);
        assertEquals(144, square.area());
    }

    @Test
    void testSquarePerimeter(){
        Square square = new Square(4);
        assertEquals(16,square.perimeter());

        square = new Square(12);
        assertEquals(48,square.perimeter());
    }
}