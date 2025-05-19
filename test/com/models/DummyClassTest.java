package com.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClassTest {
    DummyClass dummyClass;

    @BeforeEach
    void setup(){
        dummyClass = new DummyClass();
    }

    @Test
    void add() {
        assertEquals(3, dummyClass.add(1,2));
    }
}