package zajecia2.instrukcjesterujace;

/*dla podanych dwoch liczb wypisuje wieksza*/

import java.util.Scanner;

public class FindGreaterNumber {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner porownanie = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = porownanie.nextInt();

        System.out.println("Podaj b: ");
        b = porownanie.nextInt();

        if (a > b){
            System.out.println("Wieksze jest a: " + a);
        } else if (a < b){
            System.out.println("Wieksze jest b: " + b);
        } else {
            System.out.println("Liczby są rowne");
        }
    }
}
