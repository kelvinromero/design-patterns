package org.example.entities;

import org.example.entities.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void getPoints() {
        Result result = new Result();
        assertEquals(0, result.getPoints());
    }

    @Test
    void incrementPoints() {
        Result result = new Result();
        result.incrementPoints(10);
        assertEquals(10, result.getPoints());
    }
}