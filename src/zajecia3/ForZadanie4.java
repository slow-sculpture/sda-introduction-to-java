package zajecia3;

import java.util.Scanner;

public class ForZadanie4 {
    public static void main(String[] args) {

       /* Zadanie​​4
       Napisać program zliczający długość łańcucha znakowego.
       ●Z białymi znakami
       ●Bez białych znaków*/

        //todo: utworzyc skaner
        Scanner text = new Scanner(System.in);
        //todo: zapytac o tekst
        System.out.println("Podaj teskt: ");
        String a = text.nextLine();

        //todo: wyswietlic menu
        System.out.println("---------------------");
        System.out.println("Wybierz opcje: ");
        System.out.println("1. Z bialymi znakami");
        System.out.println("2. Bez bialych znakow");

        int wybor = text.nextInt();

        //todo: switch case
        switch (wybor) {
            case 1:
                System.out.println(a.length());
                break;
            case 2:
                int licznik = 0;
                for (int i = 0; i < a.length(); i++) {
                    //jezlei znak na i-tej pozycji nie jest bislym znakiem to zliczaj
                    if (a.charAt(i) != ' ' && a.charAt(i) != '\t') {
                        licznik++;   //jesli nie jest to podbija licznik
                    }
                }
                System.out.println(licznik);
                break;
            default:
                System.out.println("Zly wybor");
                break;
        }


    }
}
