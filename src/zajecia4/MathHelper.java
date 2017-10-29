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


    /**
     * Metoda obliczajaca n-ty wyraz ciagu Fibonacciego
     * @param n
     * @return
     */
    //program obliczajacy n-ty wyraz ciagu Fibonacciego
    //ciag Fibonacciego
    //q1 = 0
    //g2 = 1
    //q3 = 1 ///////suma dwoch wyrazow poprzednich
    //an = an-1 + an-2

    public static int fibonacci(int n){
        int fib1 = 0;
        int fib2 = 1;
        int wynik = 0;

        for(int i = 2; i <= n; i++){
            wynik = fib1 + fib2;
            fib1 = fib2;
            fib2 = wynik;
        }
        return wynik;
    }

}

/////////////wtedy w main w innej klasie mozemy wywolac funkcje ->    np. int wynik = MathHelper.factorial(liczba);
////////////bez importowania mozna w wywolac powyzsze w danym pakiecie