package com.models;

public class Convert {
    public double convertToCM(Inches inches) {
        return inches.getValue() * 2.5;
    }

    public int convertToCM(Feet feet) {
        return 0;
    }

    public double convertToInch(Feet feet) {
        return feet.getValue() * 12;
    }

    public double convertToMM(Centimeter centimeter) {
        return centimeter.getValue() * 10;
    }

    public double convertToLitre(Gallon gallon) {
        return gallon.getValue() * 3.78;
    }
}
