package zajecia4;

import java.util.Scanner;

public class ArrayZadanie3 {
    public static void main(String[] args) {
        System.out.println("Podaj n - ilosc elementow: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj " + (i + 1) + " wartosc: ");
            tab[i] = sc.nextInt();
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 4 && tab[i] < 15) {
                System.out.println("Indeks: " + i + " wartosc: " + tab[i]);
            }

        }
    }
}
