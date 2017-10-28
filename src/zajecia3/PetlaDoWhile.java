package zajecia3;


public class PetlaDoWhile {
    public static void main(String[] args) {

        int licznik = 101; //uruchomi sie co najmniej raz mimo ze warunek (sprawdzany na koncu) jest false
        do {
            if (licznik % 2 != 0) {
                System.out.println(licznik);
            }
            licznik++;
        } while (licznik < 100);

        System.out.println("Koniec petli");
    }
}
