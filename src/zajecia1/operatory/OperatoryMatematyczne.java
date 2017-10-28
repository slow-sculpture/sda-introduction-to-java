package zajecia1.operatory;
/*
   Przykład uzycia operatorow matematycznych dla dworch stalych liczb
   */

public class OperatoryMatematyczne {
    public static void main(String[] args) {

        int a = 16;
        int b = 5;
        System.out.println("Obliczenia dla a=" + a + " i b=" + b + ":");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);
        System.out.println("Odejmowanie: " + (a - b));
    }
}
