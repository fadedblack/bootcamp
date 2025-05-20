package com.models;

import org.junit.jupiter.api.Test;

import java.sql.SQLRecoverableException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertTest {
    @Test
    void convertInchesToCM() {
        Convert convert = new Convert();

        assertEquals(25, convert.convertToCM(new Inches(10)));
        assertEquals(1.25, convert.convertToCM(new Inches(0.5)));
    }

    @Test
    void convertFeetToInches() {
        Convert convert = new Convert();
        assertEquals(120, convert.convertToInch(new Feet(10)));
    }

    @Test
    void convertCMToMM() {
        Convert convert = new Convert();
        assertEquals(10,convert.convertToMM(new Centimeter(1)));
    }

    @Test
    void convertGallonToLitre() {
        Convert convert = new Convert();
        assertEquals(3.78,convert.convertToLitre(new Gallon(1)));
        assertEquals(4.158,convert.convertToLitre(new Gallon(1.1)));
    }
}