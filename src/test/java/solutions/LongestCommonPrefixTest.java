package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    private static LongestCommonPrefix lcp;

    @BeforeAll
    static void setUp() {
        lcp = new LongestCommonPrefix();
    }

    @Test
    void testLongestCommonPrefix() {
        String[] input = {"c", "c", "c", "ca", "c", "c", "c", "c"};
        String prefix = lcp.longestCommonPrefix(input);
        assertEquals("c", prefix);
    }

    @AfterAll
    static void tearDown() {
        lcp = null;
    }
}
