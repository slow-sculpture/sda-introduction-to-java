package zajecia5;

import java.util.Scanner;

public class SearchStringInArray {
    public static void main(String[] args) {
        //utworzyc tablice 5 napisow
        // i od razu je zainicjalizowac

        // I wersja
        String[] nazwiska = new String[5];
        nazwiska[0] = "Kowalski";
        nazwiska[1] = "Nowal";
        nazwiska[2] = "Adamski";
        nazwiska[3] = "Nowacki";
        nazwiska[4] = "Kowal";

        // II wersja
        //utworzenie tablicy 5el. z inicjaliuzacja
        String[] surnames = {"Kowalski", "Nowak", "Adamski", "Nowacki", "Kowal"};

        //////////jezeli podamy za duzy indeks np. 6 to bedzie wyjatek ArrayIndexOutOfBoundsException
        //////////jezeli podam mniej elementow to reszta wypelnic sie null (patrz NullIntro)
        ////////// - referencja jest ale nie ma tam wartosci (null)

        //zapytac uzytkownika o nazwisko
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwisko: ");
        String napis = sc.nextLine();

        //odpowiedz czy takie nazwisko wystepuje
        boolean czyObecne = false;
        for (int i = 0; i < surnames.length; i++) {
            if (surnames[i] == napis) {
                czyObecne = true;
                break;
            }
        }
        System.out.println(czyObecne);    //false
        //////////powyzsze (==) sprawdza czy jest ten sam adres referencji stos-sterta
        /////////bo String to NIE JEST TYP PRYMITYWNY
        ////////dla prymitywnych == sprawdza wartosci

        ////////dla porownania wartosci nalezy uzysc metody equals

        for (int i = 0; i < surnames.length; i++) {
            if (surnames[i] .equals(napis)) {
                czyObecne = true;
                break;
            }
        }
        System.out.println(czyObecne);      //true
    }
}
