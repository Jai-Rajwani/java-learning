package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationTest {
    private static ReversePolishNotation reversePolishNotation;


    @BeforeAll
    public static void setUp() {
        reversePolishNotation = new ReversePolishNotation();
    }

    @Test
    public void testReversePolishNotation() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result = reversePolishNotation.evalRPN(tokens);
        Assertions.assertEquals(22, result);
    }
}
