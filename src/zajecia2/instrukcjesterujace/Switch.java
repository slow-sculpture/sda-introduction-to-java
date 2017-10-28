package zajecia2.instrukcjesterujace;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        double a;
        double b;
        double n;

        Scanner kalkulator = new Scanner(System.in);

        System.out.println("Podaj a i b: ");
        a = kalkulator.nextDouble();
        b = kalkulator.nextDouble();

        System.out.println("---------------------");
        System.out.println("Wybierz opcje: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        int wybor = kalkulator.nextInt();


        switch (wybor) {
            case 1:
                System.out.println("Wynik: " + (a + b));
                break;
            case 2:
                System.out.println("Wynik: " + (a - b));
                break;
            case 3:
                System.out.println("Wynik: " + (a * b));
                break;
            case 4:
                System.out.println("Wynik: " + (a / b));
                break;
            default:
                System.out.println("Wrong command");
                break;
        }


        //zakres widocznosci zmiennej -> scope
        // System.out.println("Wynik: " + wynik); w default nie zostanie przypisana wartosc do wynik


    }
}
