package zajecia5;

import java.util.Random;
import java.util.Scanner;

public class CountMaxNumber {
    public static void main(String[] args) {

        //wypelnic losowymi wartosciami
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(30);
        }
        //znalezc max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


        //zliczyc ile razy max sie pojawia
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
            counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}
