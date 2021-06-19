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

}
