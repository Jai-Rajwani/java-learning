package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingTest {
    private static LongestSubstringWithoutRepeating longestSubstringWithoutRepeating;

    @BeforeAll
    public static void init() {
        longestSubstringWithoutRepeating = new LongestSubstringWithoutRepeating();
    }

    @AfterAll
    public static void destroy() {
        longestSubstringWithoutRepeating = null;
    }

    @Test
    public void testLongestSubstring_longString() {
        String input = "akusgiuadfhgiasdjgdjfsduejfandfjdfabcdefghijklmnopqrstuvwxyziaosydglfkbnaldgnodg";
        int actualOutput = longestSubstringWithoutRepeating.lengthOfLongestSubstring(input);
        int expectedOutput = 26;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testLongestSubstring_shortString() {
        String input = "au";
        int actualOutput = longestSubstringWithoutRepeating.lengthOfLongestSubstring(input);
        int expectedOutput = 2;
        assertEquals(expectedOutput, actualOutput);
    }
}
