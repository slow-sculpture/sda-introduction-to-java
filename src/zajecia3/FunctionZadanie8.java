package zajecia3;

/*Zadanie​​8
Napisz program,który sprawdza czy podana liczba jest liczbą pierwszą.*/

import java.util.Scanner;

public class FunctionZadanie8 {
    public static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break; //przerywa petle bo znamy juz odpowiedz dla danej liczby - bez tego petla bedzie krazyc do spelnienia warunku
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean wynik = isPrime(a);
        System.out.println(wynik);

    }
}
