package zajecia7.zadanie8_Abstract;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura[] tablicaFigur = new Figura[3];
        int ilosc = 0;
        boolean czyWyjsc = false;
        while (!czyWyjsc) {
            System.out.println("Dodaj nowa figure");
            System.out.println("1. Kwadrat");
            System.out.println("2. Prostokat");
            System.out.println("3. Kolo");
            System.out.println("4. Pole");

            int wybor = scanner.nextInt();
            Figura figura;
            switch (wybor) {
                case 1:
                    System.out.println("Podaj bok kwadratu");
                    double bok = scanner.nextInt();
                    // Kwadrat kwadrat = new Kwadrat(2);
                    figura = new Kwadrat(bok);  //polimorfizm - pozne wiazanie - jesli to typ dziedziczony
                    //to wywoluje odpowiednia metode
                    tablicaFigur[ilosc++] = figura;
                    break;
                case 2:
                    System.out.println("Podaj boki prostokatu");
                    double bok1 = scanner.nextInt();
                    double bok2 = scanner.nextInt();
                    figura = new Prostokat(bok1, bok2);
                    tablicaFigur[ilosc++] = figura;
                    break;
                case 3:
                    System.out.println("Podaj promien");
                    double r = scanner.nextInt();
                    figura = new Kolo(r);
                    tablicaFigur[ilosc++] = figura;
                    break;
                case 4:
                    System.out.println("Pola wszystkich");
                    for (int i = 0; i < ilosc; i++) {
                        Figura f = tablicaFigur[i];
                        System.out.println("Pole " + f.obliczPole());
                        System.out.println("Obwod " + f.obliczObwod());
                        System.out.println();
                    }
                    break;
                case 5:
                    czyWyjsc = true;
                    break;
            }
        }


    }
}
