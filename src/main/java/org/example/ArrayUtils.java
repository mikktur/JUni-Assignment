package org.example;

public class ArrayUtils {
    public ArrayUtils() {

    }


    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean areMultiDimensionalArraysEqual(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!areArraysEqual(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }
}
