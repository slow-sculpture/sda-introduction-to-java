package zajecia5;


import java.util.Scanner;

/////////////////zadanie 11////////////////////////////

public class MatrixIntro {

    //metoda tworzaca macierze
    public static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar  macierzy mx X my: ");
        int mx = scanner.nextInt();
        int my = scanner.nextInt();

        return new int[mx][my];
    }

    //metoda wypelniajaca macierz
    public static void fillMatrix(int[][] m) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosci macierzy:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
    }

    //metoda drukujaca macierz
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //metoda dodajaca macierze
    public static int[][] addMatrix(int[][] a, int[][] b) {

        //sprawdzamy z wykorzystanie metody prownujacej rozmiary macierzy w kontekscie mozliwosci
        //ich dodania (rowne wymiary)
        //czyli jesli
        if (!validate(a, b)) {
            return null;
        }

        int[][] result = new int[a.length][a[0].length]; //a[0] zakladamy ze bedzie miec co najmniej 1 kolumne
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] + " | ");
            }
            System.out.println();
        }
        return result;
    }

    //metoda porownujaca rozmiary macierzy - czy sa identyczne (dla dodawania)
    public static boolean validate(int[][] a, int[][] b) {


        //jesli zawnetrzne wymiary sa rozne to od razu wiemy, ze macierze sie nie zgadzaja
        if (a.length != b.length) {
            return false;
        }
        //jesli dotarlisym tutaj to zewnetrzne wymiary sa ok
        //sprawdzamy wiersze
        for (int i = 0; i < a.length; i++) {
            //jesli znajdziemy wiersz, gdzie ich liczba kolumn jest rozna
            //to zwroc falsz
            if (a[i].length != b[i].length) {
                return false;
            }
        }
        //jesli dotarlismy az tutaj, to wymiary sa zgodne
        return true;
    }

    public static void main(String[] args) {


        //utowrzenie macierzy
        int[][] matrix = createMatrix();
        int[][] secondMatrix = createMatrix();

        //wypelnienie wartosciami od uzytkownika
        fillMatrix(matrix);
        fillMatrix(secondMatrix);

        //wyswietlenie zawartosci
        printMatrix(matrix);

        printMatrix(secondMatrix);

        //suma macierzy
        ///// addMatrix(matrix, secondMatrix).var
        int[][] result = addMatrix(matrix, secondMatrix);
        if (result != null) {
            printMatrix(result);
        } else {
            System.out.println("Nie mozna dodac takich macierzy");
        }

    }
}
