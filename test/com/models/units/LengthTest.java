package com.models.units;

import org.junit.jupiter.api.Test;

import java.io.FilenameFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthTest {
    @Test
    void compareFeetToInch() {
        Length feet = Length.fromFeet(1);
        assert(feet.equals(Length.fromInch(12)));
    }

    @Test
    void compareInchToCM() {
        Length inch = Length.fromInch(1);
        assert(inch.equals(Length.fromCM(2.54)));
    }

    @Test
    void addUnitsTest() {
        Length length = Length.fromInch(1);
        assertEquals(Length.fromInch(3), length.add(Length.fromInch(2)));
        assertEquals(Length.fromInch(5), length.add(Length.fromInch(4)));

        length = Length.fromInch(2);
        assertEquals(Length.fromInch(3), length.add(Length.fromCM(2.5)));

    }
}