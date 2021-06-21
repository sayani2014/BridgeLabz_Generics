package com.sayani.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {

    //Test data has Max Number of Integer type
    @Test
    void whenIntegerShouldReturnMax() {
        Integer[] intValue = {11, 1, 6};
        Integer max = MaxFinder.findMax(intValue);

        Assertions.assertEquals(11, max, "Validating max method");
    }

    //Test data has Max Number of Float type
    @Test
    void whenFloatShouldReturnMax() {
        Float[] floatValue = {7.98f, 4.56f, 1.34f, 40.56f};
        Float max = MaxFinder.findMax(floatValue);

        Assertions.assertEquals(40.56f, max, "Validating max method");
    }

    //Test data has Max Value of String type
    @Test
    void whenStringShouldReturnMax() {
        String[] stringValue = {"apple", "orange", "banana", "peach", "pomegranate"};
        String max = MaxFinder.findMax(stringValue);

        Assertions.assertEquals("pomegranate", max, "Validating max method");
    }
}
