package zajecia3;

/*Zadanie​​6
Napisz program,który wyświetla duże litery alfabetu od A do Z i od Z do A zwykorzystaniemp ętli:
●for
●while
●dowhile*/

public class ForZadanie6 {
    public static void main(String[] args) {
        for(char c = 'A'; c <= 'Z'; c++){    //zapis szesnastkowy np. 0x00F3
            System.out.println("Pozycja: " + (short) c + " znak: " + c);
        }

        System.out.println("/////////////////////////////////////////");

        System.out.println(0x00F3);
        System.out.println((char) 0x00F3);
    }
}
