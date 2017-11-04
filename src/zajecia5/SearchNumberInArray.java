package zajecia5;

import java.util.Random;
import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {

        //utworzyc tablice 30el.
        int[] array = new int[30];

        //wypelnic losowymi wartosciami
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(40);
        }
        //uzytkownik wporawadza jakas liczbe
        System.out.println("Podaj liczbe: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //sprawdzamy czy taka liczba wystepuje w tablicy

        //////////ten fragment przeniesiony do metody w ArrayHelper
//        boolean czyObecna = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == n) {
//                czyObecna = true;
//                break;
//            }
//        }
//        System.out.println("Wynik: " + czyObecna);

        boolean result = ArrayHelper.isPresent(array, n);

        /////// wypisanie wartosci

        // 1)
        if (result){
            System.out.println("Element wystepuje w tablicy");
                    } else {
            System.out.println("Element nie wystepuje w tablicy");
        }

        // 2)
        //operator trojargumentowy
        // wyrazenie ? wykona_sie_to_jezeli_prawdziwy : jezeli_nie_prawdziwy
        System.out.println(result ? "Element wystepuje w tablicy" : "Element nie wystepuje w tablicy");

        // 3)
        String str;
        if (result) {
            str = "Element wystepuje w tablicy";
        } else {
            str = "Element nie wystepuje w tablicy";
        }

    }
}
