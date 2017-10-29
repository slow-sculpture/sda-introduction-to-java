package zajecia4;

//klasa pomocnicza z obliczeniami matematycznymi
public class MathHelper {

    /**
    * Metoda obliczajaca n!
    */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Metoda obliczajaca pole trojkata wg wzoru Herona
     */
    public static double triangleArea(double a, double b, double c) {

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

/////////////wtedy w main w innej klasie mozemy wywolac funkcje ->    np. int wynik = MathHelper.factorial(liczba);
////////////bez importowania mozna w wywolac powyzsze w danym pakiecie