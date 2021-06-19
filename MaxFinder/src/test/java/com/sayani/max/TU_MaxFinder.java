package com.sayani.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {

    //Test data has Max Number in the First position
    @Test
    void whenString1ShouldReturnMax() {
        String[] string1 = {"orange", "apple", "banana"};
        String max = MaxFinder.findMax(string1);

        Assertions.assertEquals("orange", max, "Validating max method");
    }

    //Test data has Max Number in the Second position
    @Test
    void whenString2ShouldReturnMax() {
        String[] string1 = {"apple", "orange", "banana"};
        String max = MaxFinder.findMax(string1);

        Assertions.assertEquals("orange", max, "Validating max method");
    }

    //Test data has Max Number in the Third position
    @Test
    void whenString3ShouldReturnMax() {
        String[] string1 = {"apple", "banana", "orange"};
        String max = MaxFinder.findMax(string1);

        Assertions.assertEquals("orange", max, "Validating max method");
    }

    //Test data has Max Number in the First position
    @Test
    void whenInteger1ShouldReturnMax() {
        Integer[] int1 = {11, 1, 6};
        Integer max = MaxFinder.findMax(int1);

        Assertions.assertEquals(11, max, "Validating max method");
    }

    //Test data has Max Number in the Second position
    @Test
    void whenInteger2ShouldReturnMax() {
        Integer[] int1 = {1, 11, 6};
        Integer max = MaxFinder.findMax(int1);

        Assertions.assertEquals(11, max, "Validating max method");
    }

    //Test data has Max Number in the Third position
    @Test
    void whenInteger3ShouldReturnMax() {
        Integer[] int1 = {1, 6, 11};
        Integer max = MaxFinder.findMax(int1);

        Assertions.assertEquals(11, max, "Validating max method");
    }

    //Test data has Max Number in the First position
    @Test
    void whenFloat1ShouldReturnMax() {
        Float[] float1 = {7.98f, 4.56f, 1.34f};
        Float max = MaxFinder.findMax(float1);

        Assertions.assertEquals(7.98f, max, "Validating max method");
    }

    //Test data has Max Number in the Second position
    @Test
    void whenFloat2ShouldReturnMax() {
        Float[] float1 = {1.34f, 7.98f, 4.56f};
        Float max = MaxFinder.findMax(float1);

        Assertions.assertEquals(7.98f, max, "Validating max method");
    }

    //Test data has Max Number in the Third position
    @Test
    void whenFloat3ShouldReturnMax() {
        Float[] float1 = {1.34f, 4.56f, 7.98f};
        Float max = MaxFinder.findMax(float1);

        Assertions.assertEquals(7.98f, max, "Validating max method");
    }
}
