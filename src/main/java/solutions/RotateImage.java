package solutions;

class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRow(matrix);
    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] + matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] = matrix[i][j] - matrix[j][i];
            }
        }
    }

    private static void reverseRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i ++) {
            reverseArray(matrix[i]);
        }
    }

    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i ++) {
            array[i] = array[i] +  array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] -  array[array.length - 1 - i];
            array[i] = array[i] -  array[array.length - 1 - i];
        }
    }

}