package com.sayani.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer int1 = 1, int2 = 11, int3 = 6;
        Integer max = MaxFinder.findMax(int1, int2, int3);

        Assertions.assertEquals(11, max, "Validating max method");
    }

}
