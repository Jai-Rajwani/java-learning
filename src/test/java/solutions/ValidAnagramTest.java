package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static constants.TestConstants.VALID_ANAGRAM_ONE_A;
import static constants.TestConstants.VALID_ANAGRAM_ONE_B;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    private static ValidAnagram validAnagram;

    @BeforeAll
    static void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    void testValidAnagram() {
        boolean isAnagram = validAnagram.isAnagram(VALID_ANAGRAM_ONE_A, VALID_ANAGRAM_ONE_B);

        assertTrue(isAnagram);
    }


    @AfterAll
    static void tearDown() {
        validAnagram = null;
    }
}
