package zajecia3;

import java.util.Scanner;

/*petla while drukujaca liczby parzyste 0 do 100*/
public class PetlaWhile {
    public static void main(String[] args) {

        //wypisac zakres liczb
        Scanner zakres = new Scanner(System.in);
        System.out.println("Podaj zakres liczb: ");
        int a = zakres.nextInt();
        int b = zakres.nextInt();

        //wypisac parzyste liczby

        /*   ///moja wersja
        int licznik = 0;
        while (licznik >= a && licznik <= b) {
            System.out.println(licznik);
            licznik++;
        }*/

        while (a < b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
        System.out.println("Koniec petli");

    }
}

