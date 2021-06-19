/**
 * Extend the max method to also print the max to std out using Generic Method
 * Write printMax Generic Method which is internally called from testMaximum
 *
 * @author: SAYANI KOLEY
 * @since: 19.06.2021
 */

package com.sayani.max;

public class MaxFinder<T extends Comparable<T>> {
    T x, y, z;

    public MaxFinder() {
    }

    public  MaxFinder(T[] elements) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Integer textMaximumInteger(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        printMax(x, y, z, max);
        return max;
    }

    public static Float textMaximumFloat(Float x, Float y, Float z) {
        Float max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        printMax(x, y, z, max);
        return max;
    }

    public static String textMaximumString(String x, String y, String z) {
        String max = x;
        if(y.compareToIgnoreCase(max) > 0)
            max = y;
        if(z.compareToIgnoreCase(max) > 0)
            max = z;

        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s %s %s is %s \n", x, y, z, max);
    }

    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        printMax(x, y, z, max);
        return max;
    }

    public static void main(String[] args) {
        Integer integerValue1 = 10, integerValue2 =  34, integerValue3 = 27;
        Float floatValue1 = 16.75f, floatValue2 = 2.3f, floatValue3 =  8.76f;
        String stringValue1 = "apple", stringValue2 = "banana", stringValue3 = "orange";

        textMaximumString(stringValue1, stringValue2, stringValue3);
        textMaximumFloat(floatValue1, floatValue2, floatValue3);
        textMaximumInteger(integerValue1, integerValue2, integerValue3);

        findMax(integerValue1, integerValue2, integerValue3);
        findMax(stringValue1, stringValue2, stringValue3);
        findMax(floatValue1, floatValue2, floatValue3);
    }
}
