package zajecia5;


import java.util.Scanner;

public class MatrixIntro {
    public static void main(String[] args) {

        //utowrzenie macierzy 3x3
        int[][] matrix = new int[3][3];
        //wypelnienie wartosciami od uzytkownika
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //wyswietlenie zawartosci
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
