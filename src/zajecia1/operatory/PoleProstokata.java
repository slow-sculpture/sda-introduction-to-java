package zajecia1.operatory;

import java.util.Scanner;

/*
    Przyklad obliczania pola prostokata dla danych wartosci
 */
public class PoleProstokata {
    public static void main(String[] args) {
        //zmiana kodu - wczytywanie ze scannera
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj boki prostokata: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        //policz pole i wypisz
        // double pole =
        double pole = a * b;
        System.out.println("Pole prostokata wynosi: " + pole);

        //policz obwod i wypisz
        //wynik
        double obwod = 2 * a + 2 * b;
        System.out.println("Obwod prostokata wynosi: " + obwod);

        //czy pole wieksze od 100?
        boolean porownanie = pole > 100;
        System.out.println("Czy pole prostokata jest wieksze niz 100? : " + porownanie);
    }
}
