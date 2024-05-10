import algs.Algorithms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmsTest {
    private Algorithms algorithms;

    @BeforeEach
    void setUp() {
        algorithms = new Algorithms();
    }

    @Test
    void test_mergeSortedArrays_filledArrays() {
        int[] num1 = {1, 4, 6, 0, 0, 0};
        int[] num2 = {2, 6, 8};


        int[] actual = algorithms.mergeSortedArrays(num1, num2);
        int[] expected = {1, 2, 4, 6, 6, 8};
        // Assert
        assertArrayEquals(expected, actual, "The method did not work as expected");
    }

    @Test
    void test_mergeSortedArrays_emptyArray() {
        int[] num1 = {1};
        int[] num2 = {0};


        int[] actual = algorithms.mergeSortedArrays(num1, num2);
        int[] expected = {1};
        // Assert
        assertArrayEquals(expected, actual, "The method did not work as expected");
    }

//    @Test
//    void test_mergeSortedArrays_emptyArray2() {
//        int[] num1 = {0};
//        int[] num2 = {1};
//
//
//        int[] actual = algorithms.mergeSortedArrays(num1, num2);
//        int[] expected = {1};
//        // Assert
//        assertArrayEquals(expected, actual, "The method did not work as expected");
//    }

}
