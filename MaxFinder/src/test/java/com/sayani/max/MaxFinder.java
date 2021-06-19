/**
 * Refactor all the 3 t One Generic Method and find the maximum
 * Ensure the Generic Type extends Comparable
 * Make the test case work
 *
 * @author: SAYANI KOLEY
 * @since: 19.06.2021
 */

package com.sayani.max;

public class MaxFinder {
    public static <T extends Comparable<T>> T findMax(T[] elements) {
        T max = elements[0];
        for (T i: elements) {
            if(i.compareTo(max) > 0)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integerValue = {10, 34, 27};
        Float[]  floatValue = {16.75f, 2.3f, 8.76f};
        String[] stringValue = {"apple", "banana", "orange"};

        findMax(integerValue);
        findMax(floatValue);
        findMax(stringValue);
    }
}
