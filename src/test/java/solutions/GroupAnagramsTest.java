package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {
    private static GroupAnagrams groupAnagrams;
    @BeforeAll
    static void setup() {
        groupAnagrams = new GroupAnagrams();
    }

    @AfterAll
    static void tearDown() {
        groupAnagrams = null;
    }

    @Test
    void testGroupAnagrams() {
        String[] input = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> groupedAnagrams =  groupAnagrams.groupAnagrams(input);
        System.out.println(groupedAnagrams);
        assertEquals(3,  groupedAnagrams.size());
    }
}
