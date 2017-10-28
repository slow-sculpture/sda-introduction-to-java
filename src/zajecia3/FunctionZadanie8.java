package zajecia3;

/*Zadanie​​8
Napisz program,który sprawdza czy podana liczba jest liczbą pierwszą.*/

public class FunctionZadanie8 {
    public static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean wynik = isPrime(3);
        System.out.println(wynik);

    }
}
