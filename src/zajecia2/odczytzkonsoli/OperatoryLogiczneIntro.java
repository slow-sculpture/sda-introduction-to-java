package zajecia2.odczytzkonsoli;

import java.util.Scanner;

public class OperatoryLogiczneIntro {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner liczba = new Scanner(System.in);

        System.out.println("Podaj a: ");
        a = liczba.nextInt();
        System.out.println("Podaj b: ");
        b = liczba.nextInt();

        int wynik = a + b;
        System.out.println("Wynik dzialania to: " + wynik);

        boolean wynik2 = (a >= b) && (a != b);
        System.out.println("Wyrazenie jest: " + wynik2);
    }
}
