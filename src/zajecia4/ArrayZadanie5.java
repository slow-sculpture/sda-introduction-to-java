package zajecia4;

import java.util.Random;

//wylosuj 10 wartosci i znajdz najwieksza
public class ArrayZadanie5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        //wpisywanie losowych wartosci
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        //wypisz wartosci
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //szukanie max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nNajwiekszy element tablicy to: " + max);

    }
}
