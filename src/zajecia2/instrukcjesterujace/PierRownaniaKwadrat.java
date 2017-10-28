package zajecia2.instrukcjesterujace;

import java.util.Scanner;

public class PierRownaniaKwadrat {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj wspolczynniki a,b i c: ");
        a = odczyt.nextInt();
        b = odczyt.nextInt();
        c = odczyt.nextInt();

        int delta = (b * b) - 4 * a * c;
        System.out.println(delta);
        double sqrt = Math.sqrt(delta);
        System.out.println(sqrt);

        if (delta < 0){
            System.out.println("Brak rozwiazan");
        } else if (delta == 0){
            System.out.println("Jest jedno rozwiazanie: ");
            double x  = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("Sa dwa rozwiazania: ");
            double x1 = (-b - sqrt) / (2 * a);
            double x2 = (-b + sqrt) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }


    }
}
