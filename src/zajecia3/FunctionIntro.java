package zajecia3;

public class FunctionIntro {
    public static void wypiszParzyste(){
        for (int i =0; i < 100; i++){
            System.out.println(i);
        }
    }

    public static void wypiszNapis(String name){
        System.out.println("Argument to: " + name);
    }

    public static int dodajLiczby(int a, int b){
        System.out.println("Dodaje dwie liczby......");
        int wynik = a + b;
        return wynik;
    }



    public static void main(String[] args) {

        wypiszParzyste();

        wypiszNapis(  "teskt");

        int result = dodajLiczby(5, 5);
        System.out.println(result);

        int a = 0;
        int b = 3;
        int result2 = dodajLiczby(a, b);

    }
}
