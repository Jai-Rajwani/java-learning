package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {
    private static LongestConsecutiveSequence instance;

    @BeforeAll
    public static void init() {
        instance = new LongestConsecutiveSequence();
    }
    @AfterAll
    public static void destroy() {
        instance = null;
    }

    @Test
    public void testLongestConsecutiveSequence() {
        int[] input = {10, 1, 6, 2, 6, 7, 69, 9, 8, 6, 5, 13, 12, -5, -2, -1, 0, 11, 3, 4, 6, 7, 5};
        int expected = 16;
        int answer = instance.longestConsecutive(input);
        assertEquals(expected, answer);
    }
}
