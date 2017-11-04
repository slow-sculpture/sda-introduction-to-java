package zajecia5;

public class NullIntro {
    public static void main(String[] args) {
        String imie = "Piotr";
        System.out.println(imie.toUpperCase());

        imie = null;
        System.out.println(imie.toUpperCase());
    }
}


/* stos - stack -> struktura danych ukladana jedno na drugim - usuwanie tylko z wierzchu
na dole jest metoda main potem np. int, scanner, funkcja itd. Jak skonczymy funkcje to jest sciagana
ze stosu itd. wychodze az do ostaniej klamry metody main -> koniec programu

na stosie utworzenie referencji (strzalka laczaca) jak wpisze imie a faktycznie
wartosc jest na stercie   -> przy wpisaniu null - brak strzalki -> NullPointerException

////////////patrz obrazek na dysku
|          |
|          |
|          |
|          |
|          |
|    imie
|    wiek = 5
___________

sterta - heap
|
|
|
|____________
|
_Piotr  | Kowalski
________________
|
|
|____________


 */
