package com.sayani.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    
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
}
