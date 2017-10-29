package zajecia4;

import java.util.Scanner;

public class FibonacciExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ponadj n: ");
        int n = sc.nextInt();

        int wynik = MathHelper.fibonacci(n);
        System.out.println(wynik);
    }
}
