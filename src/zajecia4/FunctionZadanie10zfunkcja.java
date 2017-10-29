package zajecia4;

import java.util.Scanner;

public class FunctionZadanie10zfunkcja {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna: ");
        int liczba = sc.nextInt();

        int wynik = factorial(liczba);
        System.out.println("Wynik dzialania to: " + wynik);


    }
}
