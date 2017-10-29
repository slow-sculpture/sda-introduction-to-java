package zajecia4;

import java.util.Random;
import java.util.Scanner;

public class MultiplyChecker {
    public static void main(String[] args) {
        boolean isAnswerCorrect = false;
        System.out.println("Losuje dwie liczby .... ");
        Scanner sc = new Scanner(System.in);

        Random rd = new Random();
        int number1 = rd.nextInt(10);
        int number2 = rd.nextInt(10);


        while (isAnswerCorrect == false) {


            System.out.println("Podaj wynik mnozenia: " + number1 + " * " + number2);

            int wynik = sc.nextInt();
            if (wynik == number1 * number2) {
                System.out.println("Poprawna odpowiedz");
                isAnswerCorrect = true;
            } else {
                System.out.println("Bledna odpowiedz");
            }
        }
        System.out.println("Koniec pracy");
    }
}
