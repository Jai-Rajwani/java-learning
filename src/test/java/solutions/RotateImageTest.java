package solutions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RotateImageTest {
    private static RotateImage rotateImage;

    @BeforeAll
    static void setUpBeforeClass() {
        rotateImage = new RotateImage();
    }

    @Test
    void testRotateImage() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expected = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        rotateImage.rotate(matrix);
        assertTrue(validate(expected, matrix));
    }

    private static boolean validate(int[][] expected, int[][] actual) {
        // Check if both matrices are null
        if (expected == null || actual == null) {
            return expected == actual;
        }

        // Check dimensions
        if (expected.length != actual.length || expected[0].length != actual[0].length) {
            return false;
        }

        // Compare each element
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[0].length; j++) {
                if (expected[i][j] != actual[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }
}
