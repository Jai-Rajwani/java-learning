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
        int[] input = {1,100};
        int expected = 1;
        int answer = instance.longestConsecutive(input);
        assertEquals(expected, answer);
    }
}
