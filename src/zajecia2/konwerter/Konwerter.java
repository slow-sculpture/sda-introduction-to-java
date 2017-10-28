package zajecia2.konwerter;

import java.util.Scanner;

public class Konwerter {
    public static void main(String[] args) {
        double C;

        Scanner temp = new Scanner(System.in);

        System.out.println("Podaj temperature w oC: ");
        C = temp.nextDouble();

        double F = 1.8 * C + 32.0;
        System.out.println("Temperatura w oF to: " + F);


        //%.0f zaokragla do calosci .1 do czesci dziesietnych itd
        System.out.println("Temperatura w oF to: " + String.format("%.0f", F));


    }


}
