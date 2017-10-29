package zajecia4;

import java.util.Scanner;

/*Napisz program wczytujący z klawiatury n liczb całkowitych.Liczbę n należy pobrać od użytkownika.Jeśli podana wartość jest zzakresu 1-30,
        wówczas należy pobrać podaną ilość liczb całkowitych,a następnie wydrukować każdą zl iczb podniesioną do kwadratu na ekranie.
        Jeśli liczba jests poza tego przedziału należy zakończyć pracę drukując stosowny komunikat*/

public class ArrayZadanie2 {
    public static void main(String[] args) {
        System.out.println("Podaj n - ilosc liczn calkowitych: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if (n >= 1 && n <= 30) {
            int[] tab = new int[n];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = i * i;
                System.out.println(tab[i]);
            }

        } else {
            System.out.println("Bledna wartosc n.");
        }
    }
}
