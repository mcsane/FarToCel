package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitToCelciusTest {

    @Test
    void toFahrenheit() {
        assertEquals(32, FahrenheitToCelcius.toFahrenheit(0));
        assertEquals(212, FahrenheitToCelcius.toFahrenheit(100));
        assertEquals(98.6, FahrenheitToCelcius.toFahrenheit(37));
    }

    @Test
    void toCelsius() {
        assertEquals(0, FahrenheitToCelcius.toCelsius(32));
        assertEquals(100, FahrenheitToCelcius.toCelsius(212));
        assertEquals(37, FahrenheitToCelcius.toCelsius(98.6));
    }
    @Test
    void kelvintoCel() {
        assertEquals(0, FahrenheitToCelcius.kelvintoCel(272.15f));
        assertEquals(100, FahrenheitToCelcius.kelvintoCel(372.15f));
        assertEquals(37, FahrenheitToCelcius.kelvintoCel(309.15f));
    }
}