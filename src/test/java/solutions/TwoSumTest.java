package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    private static TwoSum twoSum;

    @BeforeAll
    static void setUp() {
        twoSum = new TwoSum();
    }
    @AfterAll
    static void tearDown() {
        twoSum = null;
    }

    @Test
    void testTwoSum() {
        int[] arr = {5, 5};
        int[] arr1 = {3,4,5,6,93,2,3,2,35,9,0,1,39,20};
        int [] sol1 = twoSum.twoSum(arr, 10);
        int [] sol2 = twoSum.twoSum(arr1, 93 + 39);

        assertEquals(0, sol1[0]);
        assertEquals(1, sol1[1]);
        assertEquals(4, sol2[0]);
        assertEquals(12, sol2[1]);
    }
}
