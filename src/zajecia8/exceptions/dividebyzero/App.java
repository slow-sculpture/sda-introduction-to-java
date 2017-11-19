package zajecia8.exceptions.dividebyzero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int liczba = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int drugaLiczna = scanner.nextInt();

        System.out.println("Wynik dzielenia");
        int result = 0;
        try {
            result = liczba / drugaLiczna;                            //kod ktory potencjalnie moze wywolac blad -> try execute
            System.out.println(result);
        } catch (ArithmeticException e) {                             //lapiemy wyrzucony przez jvm wyjatek
            System.out.println("Nie mozna dzielic przez 0!!!");        //obsluga wyjatku - exit code 0
        } catch (InputMismatchException e) {
            System.out.println("Nie podano liczby");
        } catch (Exception e) {                                      //wszystkie inne wyjatki
            System.out.println("Wystapil blad: " + e.getMessage());
        }

    }
}


//dzielac przez 0 -> ArithmeticException: / by zero
//1. rzucanie wyjatku
//2. obluga wyjatku