import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        Random random = new Random();
        
        // Create random matrices for demonstration
        int rows = 3;
        int cols = 3;
        
        // Generate two random 3x3 matrices
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);
        
        // Display original matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        
        // Matrix operations
        System.out.println("\nMatrix Addition:");
        displayMatrix(addMatrices(matrix1, matrix2));
        
        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));
        
        System.out.println("\nMatrix Multiplication:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));
        
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));
        
        System.out.println("\nTranspose of Matrix 2:");
        displayMatrix(transposeMatrix(matrix2));
        
        // Determinants and Inverses for 2x2 and 3x3 matrices
        if (rows == 2 && cols == 2) {
            System.out.println("\nDeterminant of Matrix 1: " + determinant2x2(matrix1));
            System.out.println("\nInverse of Matrix 1:");
            displayMatrix(inverse2x2(matrix1));
        }
        if (rows == 3 && cols == 3) {
            System.out.println("\nDeterminant of Matrix 1: " + determinant3x3(matrix1));
            System.out.println("\nInverse of Matrix 1:");
            displayMatrix(inverse3x3(matrix1));
        }
    }

    // Method to create a random matrix of given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + random.nextInt(10);  // Random values between 1 and 10
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a matrix (double version for inverse)
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%.2f", matrix[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        return 0;
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
            return det;
        }
        return 0;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse doesn't exist as determinant is 0");
            return null;
        }

        // Use double for inverse calculation to avoid integer division issues
        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / det; // Use casting to double for precise division
        inverse[0][1] = -(double) matrix[0][1] / det;
        inverse[1][0] = -(double) matrix[1][0] / det;
        inverse[1][1] = (double) matrix[0][0] / det;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Inverse doesn't exist as determinant is 0");
            return null;
        }

        // Find the adjoint of the matrix
        double[][] adjoint = new double[3][3];
        adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjoint[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjoint[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjoint[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjoint[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adjoint[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adjoint[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        // Divide the adjoint by the determinant to get the inverse
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        return inverse;
    }
}
