package work74;

import java.util.Arrays;

public class Task74 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(6);
        System.out.println("Matrix");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Transposition Matrix");
//        System.out.println(Arrays.toString(newMatrix));
    }

    public static void transpositionMatrix(int[][] matrix) {
        int newMatrix;
        for (int j = 0; j < matrix.length; j++) {
            for (int i = j + 1; i < matrix.length; i++) {
                newMatrix = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = newMatrix;
            }
        }
//        return newMatrix;
    }

    public static int[][] createMatrix(int size) {
        if (size <= 1) {
            return null;
        }
        int[][] matrix = new int[size][size];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = (int) (Math.random () * 50);;
            }
        }
        return matrix;

    }

    public static void printMatrix(int[][] matrix) {
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
}
