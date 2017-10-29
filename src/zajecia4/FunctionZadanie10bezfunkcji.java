package zajecia4;

import java.util.Scanner;

public class FunctionZadanie10bezfunkcji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna: ");
        int liczba = sc.nextInt();

        int wynik = 1;
        for (int i = 1; i <= liczba; i++){
            wynik = wynik * i;
        }
        System.out.println("Silnia podanej liczby to: " + wynik);

    }
}
