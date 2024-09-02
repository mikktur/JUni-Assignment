import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = {2, 3, 5};
        int[] a2 = {2, 3, 5, 7};
        assertArrayEquals(a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        int[][] a12 = {{2, 3}, {5, 7}, {11, 13}};
        //added as a way to test failure.
        int[][] a13 = {{2, 3}, {5, 7}, {11, 14}};
        assertArrayEquals(a11, a13);
    }

    @Test
    public void testStringArrayEquality() {
        //initializing two String arrays
        String[] a1 = {"Teppo", "Seppo", "Gekko"};
        String[] a2 = {"Teppo", "Seppo", "Gekko"};

        //Checks if the String arrays are identical.
        assertArrayEquals(a1, a2);
    }

}