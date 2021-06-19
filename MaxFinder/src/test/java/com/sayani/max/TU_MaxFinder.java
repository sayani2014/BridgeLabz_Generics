package com.sayani.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenFloatShouldReturnMax() {
        Float float1 = 1.34f, float2 = 4.56f, float3 = 7.98f;
        Float max = MaxFinder.findMax(float1, float2, float3);

        Assertions.assertEquals(7.98f, max, "Validating max method");
    }

}
