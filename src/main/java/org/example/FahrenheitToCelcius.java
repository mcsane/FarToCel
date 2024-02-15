package org.example;

public class FahrenheitToCelcius {

    public static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static float kelvintoCel(float kel){
        return (kel-272.15f);
    }
}
