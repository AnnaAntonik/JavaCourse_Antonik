package work73;

public class Task73 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(6);
        PrintMatrix(matrix);

    }

    public static void PrintMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("No matrix!");
            return;
        }
        for (int[] line : matrix) {
            if (line == null || line.length ==0) {
                System.out.println("NULL");
            } else {
            for (int number : line) {
                System.out.printf("%3d", number);
            }
            System.out.println();
        }
        }
    }

    public static int[][] createMatrix(int size) {
            if (size <= 1) {
                return null;
            }
            int[][] matrix = new int[size][size];
            int value = 1;
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i][0] = value;
//            for (int j = 1; j < matrix[i].length; j++) {
//                matrix[i][j] = matrix[i][j-1] + size;
//            }
//            value++;
//        }

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

}
