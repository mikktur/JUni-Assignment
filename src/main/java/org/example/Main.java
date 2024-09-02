package org.example;
import org.example.ArrayUtils;
public class Main {
    public static void main(String[] args) {

        int[] a1 = {2, 3, 5,7};
        int[] a2 = {2, 3, 5, 7};

        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        int[][] a12 = {{2, 3}, {5, 7}, {11, 13}};
        int[][] a13 = {{2, 3}, {5, 7}, {11, 14}};


        if(ArrayUtils.areArraysEqual(a1, a2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        if(ArrayUtils.areMultiDimensionalArraysEqual(a11,a13)){
            System.out.println("Arrays are equal");
        } else{
            System.out.println("Arrays are not equal");
        }
    }
}