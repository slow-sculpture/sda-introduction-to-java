package zajecia1.operatory;
/*
    Przyklad obliczania pola prostokata dla danych wartosci
 */
public class PoleProstokata {
    public static void main(String[] args) {
        double a = 15;
        double b = 5;

        //policz pole i wypisz
        // double pole =
        double pole = a * b;
        System.out.println("Pole prostokata wynosi: " + pole);

        //policz obwod i wypisz
        //wynik
        double obwod = 2 * a + 2 * b;
        System.out.println("Obwod prostokata wynosi: " + obwod);

        //czy pole wieksze od 100?
        boolean porownanie = pole > 100;
        System.out.println("Czy pole prostokata jest wieksze niz 100? : " + porownanie);
    }
}
