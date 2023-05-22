package com.up.upappbemongodb;

import java.text.DecimalFormat;

public class Test {

    @org.junit.jupiter.api.Test
    void test() {
        int number = 1234;
        double convertedValue = (number % 100) / 100.0;

        double result = (number / 100) + convertedValue;

        System.out.println(result);


    }
}
