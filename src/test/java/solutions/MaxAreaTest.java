package solutions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAreaTest {
    private static MaxArea maxArea;

    @BeforeAll
    static void setInstance() {
        maxArea = new MaxArea();
    }

    @AfterAll
    static void tearDown() {
        maxArea = null;
    }

    @Test
    public void testMaxArea() {
        int[] input = {6,7,1,3,2,3,9,1,6,7,2,1,5,3};
        int actualMaxArea = maxArea.maxArea(input);
        int expectedMaxArea = 60;
        assertEquals(expectedMaxArea, actualMaxArea);
    }
}
