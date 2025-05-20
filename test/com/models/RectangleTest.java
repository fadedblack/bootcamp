package com.models;

import com.models.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.area());

        rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.area());
    }

    @Test
    void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(6, rectangle.perimeter());

        rectangle = new Rectangle(10, 2);
        assertEquals(24, rectangle.perimeter());
    }
}