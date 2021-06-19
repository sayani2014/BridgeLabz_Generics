package com.sayani.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {

    //Test data has Max Number in the First position
    @Test
    void whenInteger1ShouldReturnMax() {
        Integer int1 = 11, int2 = 1, int3 = 6;
        Integer max = MaxFinder.findMax(int1, int2, int3);

        Assertions.assertEquals(11, max, "Validating max method");
    }

    //Test data has Max Number in the Second position
    @Test
    void whenInteger2ShouldReturnMax() {
        Integer int1 = 1, int2 = 11, int3 = 6;
        Integer max = MaxFinder.findMax(int1, int2, int3);

        Assertions.assertEquals(11, max, "Validating max method");
    }

    //Test data has Max Number in the Third position
    @Test
    void whenInteger3ShouldReturnMax() {
        Integer int1 = 1, int2 = 6, int3 = 11;
        Integer max = MaxFinder.findMax(int1, int2, int3);

        Assertions.assertEquals(11, max, "Validating max method");
    }

    //Test data has Max Number in the First position
    @Test
    void whenFloat1ShouldReturnMax() {
        Float float1 = 7.98f, float2 = 4.56f, float3 = 1.34f;
        Float max = MaxFinder.findMax(float1, float2, float3);

        Assertions.assertEquals(7.98f, max, "Validating max method");
    }

    //Test data has Max Number in the Second position
    @Test
    void whenFloat2ShouldReturnMax() {
        Float float1 = 1.34f, float2 = 7.98f, float3 = 4.56f;
        Float max = MaxFinder.findMax(float1, float2, float3);

        Assertions.assertEquals(7.98f, max, "Validating max method");
    }

    //Test data has Max Number in the Third position
    @Test
    void whenFloat3ShouldReturnMax() {
        Float float1 = 1.34f, float2 = 4.56f, float3 = 7.98f;
        Float max = MaxFinder.findMax(float1, float2, float3);

        Assertions.assertEquals(7.98f, max, "Validating max method");
    }

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
