package com.models.units;

import java.util.Objects;

public class Length {
    private final double value;
    private final String unit;

    public Length(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length fromFeet(double feet) {
        return new Length(feet * 304.8,"ft");
    }

    public static Length fromInch(double inch) {
        return new Length(inch * 25.4, "inch");
    }

    public static Length fromCM(double cm) {
        return new Length(cm * 10, "cm");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return compare(value, length.value, 1);
    }

    private boolean compare(double thisValue, double otherValue, int delta) {
        return Math.abs(thisValue - otherValue) <= delta;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Length add(Length length) {
        return new Length(value + length.value, unit);
    }
}
