package zajecia1.typyDanych;

public class typy {
    public static void main(String[] args) {


//Typy danych:
        // I typy prymitywne
        int number11; //deklaracja
        int number1 = 2; //deklaracja i inicjalizacja
        byte number2 = 3;
        short number3 = 4;
        long number4 = 44444;

        double nr1 = 0.5;
        float nr2 = 1.23f;

        char litera1 = 'G';

        boolean bln1 = true;

        System.out.println(number1);
        System.out.println(litera1 + ", " + nr1);

        // II typy obiektowe (referencyjne) -> zawsze z dużej litery
        // 1. łańcuch znakowy -> String (klasa)
        String imie;
        imie = "Christian";
        System.out.println(imie);


    }
}
