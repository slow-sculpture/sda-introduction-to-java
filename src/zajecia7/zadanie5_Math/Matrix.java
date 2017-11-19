package zajecia7.zadanie5_Math;

import java.util.Random;

public class Matrix {
    //wymiary macierzy
    private int x;
    private int y;
    private int[][] matrix;

    /**
     * @param x - 1st dimension
     * @param y - 2nd dimension
     */
    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        matrix = new int[x][y];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //dodawanie macierzy
    public Matrix addMatrix(Matrix secondMatrix) {      //(tylko druga ktora dodamy) bo jedna bedzie z this
        //sprawdzic czy wymiary drugiej sie zgadzaja

        //zajecia8 wyjatki - nie pozwala przejsc do dalszego kodu jesli nie jest spelniony warunek
        if (this.x != secondMatrix.x || this.y != secondMatrix.y) {
            throw new ArithmeticException("Wymiary macierzy sie nie zgadzaja"); //tworzymy nowy obiekt
        }

        //przejsc do obliczen
        Matrix result = new Matrix(this.x, this.y);    //macierz wynikowa (trzecia)

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                result.matrix[i][j] = this.matrix[i][j] + secondMatrix.matrix[i][j];
            }
        }
        return result;
    }

    //wypisanie macierzy wynikowej
    public void printMatrix() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    //wypelnienie macierzy wartosciami
    public void fillMatrixWithRandomValues() {
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = random.nextInt(50);
            }

        }
    }

/*    //walidacja macierzy
    public boolean matrixValidator(Matrix secondMatrix){
        if(this.matrix.length != secondMatrix.matrix.length){
            return false;
        }
        return true;
    }*/

}
