package zajecia4;

import java.util.Scanner;

public class FunctionZadanie9zfunkcja {
    public static double poleTrojkata(double a, double b, double c) {

        double P = 0;
        if (a + b > c && a + c > b && b + c > a){
            double p = (a + b + c) / 2;
            P = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Pole trojkata wynosi: " + String.format("%.2f", P));
        } else {
            System.out.println("Podane dlugosci nie pozwalaja utworzyc trojkata.");
        }
        return P;
    }

    public static void main(String[] args) {
        System.out.println("Podaj dlugosci bokow trojkata a, b, c: ");
        Scanner tri = new Scanner(System.in);
        double a = tri.nextDouble();
        double b = tri.nextDouble();
        double c = tri.nextDouble();

        poleTrojkata(a, b, c);

    }
}
