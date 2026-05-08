package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {
    @Test
    void shouldCompareDegreeAndCelsius() {
        Temperature celsius = Temperature.celsius(100);
        Temperature fahrenheit = Temperature.fahrenheit(212);
        assertTrue(celsius.isEqual(fahrenheit));
    }

    @Test
    void shouldBeFalseWithDifferentTemperatureValues() {
        Temperature celsius = Temperature.celsius(100);
        Temperature fahrenheit = Temperature.fahrenheit(100);
        assertFalse(celsius.isEqual(fahrenheit));
    }
}
