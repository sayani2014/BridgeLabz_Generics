package com.sayani.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {

    //Test data has Max Number in the First position
    @Test
    void whenString1ShouldReturnMax() {
        String string1 = "orange", string2 = "apple", string3 = "banana";
        String max = MaxFinder.findMax(string1, string2, string3);

        Assertions.assertEquals("orange", max, "Validating max method");
    }

    //Test data has Max Number in the Second position
    @Test
    void whenString2ShouldReturnMax() {
        String string1 = "apple", string2 = "orange", string3 = "banana";
        String max = MaxFinder.findMax(string1, string2, string3);

        Assertions.assertEquals("orange", max, "Validating max method");
    }

    //Test data has Max Number in the Third position
    @Test
    void whenString3ShouldReturnMax() {
        String string1 = "apple", string2 = "banana", string3 = "orange";
        String max = MaxFinder.findMax(string1, string2, string3);

        Assertions.assertEquals("orange", max, "Validating max method");
    }

}
