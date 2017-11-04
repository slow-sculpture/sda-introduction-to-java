package zajecia5;

import java.util.Random;

//program liczacy iloczyn skalarny wektorow
public class DotProductCalculator {

    //deklaracja - okresla rozmiar tablicy
    //nadajemy stala wielkosc array bo iloczyn sklarny wektorow jest mozliwy przy tej samej dlugosci
    public static final int ARRAY_SIZE = 30;
    //okresla gorne ograniczenie generatora liczb pseudolosowych
    public static final int RANDOM_UPPER_BOUND = 50;

    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[ARRAY_SIZE];
        int[] arr2 = new int[ARRAY_SIZE];

        //losowanie wartosci
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(RANDOM_UPPER_BOUND) + 1;
            arr2[i] = random.nextInt(RANDOM_UPPER_BOUND) + 1;
        }

        //obliczanie wartosci
        int sum = 0;
        for(int i = 0; i < ARRAY_SIZE; i++){
            sum += arr[i] * arr2[i];
            System.out.println(sum);
        }

        System.out.println("Iloczyn skalarny wektorow wynosi: " + sum);

    }
}
