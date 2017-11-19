package zajecia7.zadanie5_Math;

public class App {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);

        matrix1.fillMatrixWithRandomValues();
        System.out.println("Matrix 1: ");
        matrix1.printMatrix();

        matrix2.fillMatrixWithRandomValues();
        System.out.println("Matrix2: ");
        matrix2.printMatrix();

      /*wersja pierwotna
       Matrix result = matrix1.addMatrix(matrix2);
        System.out.println("Addition result: ");
        result.printMatrix();*/

        //dodajemy blok try catch z zajec8 w razie gdy nie zgadzaja sie wymiary macierzy
        try {
            Matrix result = matrix1.addMatrix(matrix2);
            System.out.println("Addition result: ");
            result.printMatrix();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        ;


    }
}
