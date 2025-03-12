import java.util.Scanner;

class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

        public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

        public void readMatrix(Scanner sc) {
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

        public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " "); // added space for readability
            }
            System.out.println(); // move to next line after each row
        }
    }

       public static Matrix addMatrices(Matrix a, Matrix b) {
        // If rows and cols don't match, return null (should have been checked earlier)
        if (a.rows != b.rows || a.cols != b.cols) {
            return null;
        }

        Matrix result = new Matrix(a.rows, a.cols);
        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < a.cols; j++) {
                result.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        return result;
    }
}

public class Add2Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of rows in first matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Enter number of columns in first matrix: ");
        int col1 = sc.nextInt();

                System.out.print("Enter number of rows in second matrix: ");
        int row2 = sc.nextInt();
        System.out.print("Enter number of columns in second matrix: ");
        int col2 = sc.nextInt();

               if (row1 != row2 || col1 != col2) {
            System.out.println("Addition not possible. Matrices dimensions do not match.");
            return;
        }

                Matrix matrix1 = new Matrix(row1, col1);
        matrix1.readMatrix(sc);
        Matrix matrix2 = new Matrix(row2, col2);
        matrix2.readMatrix(sc);

        
        System.out.println("First Matrix:");
        matrix1.displayMatrix();
        System.out.println("Second Matrix:");
        matrix2.displayMatrix();

        
        Matrix resultMatrix = Matrix.addMatrices(matrix1, matrix2);
        
        if (resultMatrix != null) {
            System.out.println("Matrix after addition:");
            resultMatrix.displayMatrix();
        } else {
            System.out.println("Matrix addition failed due to dimension mismatch.");
        }
    }
}