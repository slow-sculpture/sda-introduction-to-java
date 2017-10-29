package zajecia4;

import java.util.Scanner;

public class FunctionZadanie9bezfunkcji {
    public static void main(String[] args) {
        //todo: wczytac 3 dlugosci typu double
        System.out.println("Podaj dlugosci bokow trojkata a, b, c: ");
        Scanner tri = new Scanner(System.in);
        double a = tri.nextDouble();
        double b = tri.nextDouble();
        double c = tri.nextDouble();

        //todo: sprawdzic czy mozna zbudowac trojkat
        //jezeli tak - policzyc pole
        //else wyswietlic komunikat
        if (a + b > c && a + c > b && b + c > a){
            double p = (a + b + c) / 2;
            double P = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Pole trojkata wynosi: " + String.format("%.2f", P));
        } else {
            System.out.println("Podane dlugosci nie pozwalaja utwaorzyc trojkata.");
        }


    }
}
