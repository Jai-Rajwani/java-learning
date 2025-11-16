package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeAndDecodeStringTest {
    private static EncodeAndDecodeString instance;

    @BeforeAll
    static void setInstance() {
        instance = new EncodeAndDecodeString();
    }
    @AfterAll
    static void tearDown() {
        instance = null;
    }

    @Test
    void testEncodeAndDecodeString() {
        List<String> inputList = new ArrayList<>();
        inputList.add("hello");
        inputList.add("world");
        inputList.add("Bhang");
        inputList.add("Bhosada");

        String encodedString = instance.encode(inputList);
        List<String> decodedStringList = instance.decode(encodedString);

        assertEquals( inputList.get(0), decodedStringList.get(0));
        assertEquals( inputList.get(1), decodedStringList.get(1));
        assertEquals( inputList.get(2), decodedStringList.get(2));
        assertEquals( inputList.get(3), decodedStringList.get(3));
    }

    private List<String> getInputList(String ...inputs) {
        List<String> inputList = new ArrayList<>();
        for (String input : inputs) {
            inputList.add(input);
        }
        return inputList;
    }
    private void validate(List<String> expected, List<String> actual) {
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
    @Test
    void testEncodeDecodeString() {
       List<String> inputList = getInputList("8v8dga987hafhad8", "*&GDBDufa87w98et2twnv89", "@8375238fs98vsadhgasuidghajdfn53168f4w5e");
       String encodedString = instance.encode(inputList);
       List<String> decodedList = instance.decode(encodedString);
       validate(inputList, decodedList);
    }
}
