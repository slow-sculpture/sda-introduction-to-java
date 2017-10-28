package zajecia2.instrukcjesterujace;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double waga;
        double wzrost;
        Scanner wartosc = new Scanner(System.in);

        System.out.println("Podaj wage [kg] i wzrost [m]: ");
        waga = wartosc.nextDouble();
        wzrost = wartosc.nextDouble();

        double bmi = waga / (wzrost * wzrost);
        System.out.println(bmi);

        //zaokraglenie do ktoregos miejsca po przecinku
        System.out.println(String.format("%.1f", bmi));
        //calosc w gore
        System.out.println(Math.ceil(bmi));
        //calosc w dol
        System.out.println(Math.floor(bmi));
        //zaokragla
        System.out.println(Math.round(bmi));

        //potega z wykorzystanie funkcji matematycznej (podstawa, wykladnik)
        double bmi2 = waga / Math.pow(wzrost, 2);
        System.out.println(bmi2);

        if (bmi < 18.5){
            System.out.println("niedowaga");
        } else if (bmi >=18.5 && bmi < 25){
            System.out.println("ok");
        } else if (bmi >= 25 && bmi <29){
            System.out.println("nadwaga");
        } else {
            System.out.println("otylosc I st.");
        }
    }
}
