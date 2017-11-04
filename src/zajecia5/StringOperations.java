package zajecia5;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj teskt o dlugosci do 20 znakow: ");
        String text = sc.nextLine();

        //string to inaczej tablica znakow

        if (text.length() <= 20) {
            printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                //kazdy case to bedzie osobna metoda
                case 1:
                    System.out.println("Opcja 1 ....");
                    toUpper(text);
                    break;
                case 2:
                    System.out.println("Opcja 2.....");
                    toLower(text);
                    break;
                case 3:
                    System.out.println("Opcja 3.....");
                    toggleCase(text);
                    break;
            }

        } else {
            System.out.println("Napis zbyt dlugi");
        }

    }

    public static void printMenu() {
        System.out.println("1. Wszystkie litery duze");
        System.out.println("2. Wszystkie litery male");
        System.out.println("1. Wszystkie litery male na duze, a duze na male");
        System.out.println("Twoj wybor");
    }

    public static void toUpper(String input) {
        String result = "";
        for (int i = 0; i <= input.length(); i++) {
            //pobierz znak na i-tej pozycji
            char element = input.charAt(i);
            //jezeli to jest mala litera to zwieksz (tablica znakow unicode)
            if (element >= 97 && element <= 122) {
                element -= 32;
            }
            result += element;
        }
    }

    public static void toLower(String input) {
        //druga wersja - mniej pamiecie zje
        //przerobienie string na tablice znakow
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] += 32;
            }
        }
        String result = new String(chars);

    }

    public static void toggleCase(String input) {
        //trzecia wersja StringBulider
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char element = input.charAt(i);
            if (element >= 65 && element <= 90) {
                element += 32;
            } else if (element >= 97 && element <= 122) {
                element -= 32;
            }
            sb.append(element);
        }
        String result = sb.toString();
    }
}
