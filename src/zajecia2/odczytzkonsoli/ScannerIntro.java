package zajecia2.odczytzkonsoli;

/*program pobierajacy imie, nazwisko i wiek
i drukujacy te informacje do konsoli*/

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //zapytaj uzytkownika o imie
        String imie;
        String nazwisko;
        int wiek;
        System.out.println("Jak masz na imie?");
        // utworzenie obiektu tpy scanner o nazwie odczyt  - in zmienna publiczna w klasie system
        Scanner odczyt = new Scanner(System.in);

        //do zminnej imie wstaw natepna linie z konsoli
        imie = odczyt.nextLine();

        //odczytaj z konsoli linie tekstu i wstaw do zminnej
        System.out.println("Podaj nazwisko: ");
        nazwisko = odczyt.nextLine();

        //odczytaj z konsoli liczbe i wstaw do zminnej
        System.out.println("Podaj wiek: ");
        wiek = odczyt.nextInt();


        System.out.println("Witaj, " + imie + " " + nazwisko + " masz: " + wiek + " lat.");

    }
}
