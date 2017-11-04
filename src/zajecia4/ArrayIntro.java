package zajecia4;


////////////////tablica - ciag wartosci wystepujacych obok siebie w pewnym obszarze pamieci
////////////zadanie 1////////////////////////////////////////
public class ArrayIntro {
    public static void main(String[] args) {
        int[] tab = new int[10];

        //petla wypelniajaca wartosci
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 20;
        }

        //petla drukujaca wartosci
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Indeks: " + i + " wartosc: " + tab[i]);
        }

        //policzy sume elementow tablicy
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            int elem = tab[i];
            sum += elem;
            //lub suma += tab[i];
        }
        System.out.println("Suma elementow tablicy to: " + sum);

        //policzyc srednia
        System.out.println("Srednia wartosci to: " + ((double)sum / tab.length)); //rzutowanie na double - dokladna srednia - int obetnie koncowke
    }


}
