package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {
    private static TrappingRainwater instance;

    @BeforeAll
    public static void setInstance() {
        instance = new TrappingRainwater();
    }

    @Test
    public void testTrappingRainWater() {
        int[] input = {7,3,2,2,9,1,8,3,5,9,9,1,5,4};
        int expected = 37;
        int actual = instance.trap(input);
        Assertions.assertEquals(expected, actual);
    }
}
