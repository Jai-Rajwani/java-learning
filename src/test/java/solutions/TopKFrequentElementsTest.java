package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {
    private static TopKFrequentElements instance;

    @BeforeAll
    static void beforeAll() {
        instance = new TopKFrequentElements();
    }

    @AfterAll
    static void afterAll() {
        instance = null;
    }

    @Test
    public void testTopKFrequentElements() {
        int[] arr = new int[] {1,2,1,2,1,2,3,1,3,2};
        int[] expected = new int[] {1,2};
        int[] actual = instance.topKFrequentElements(arr, 2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}
