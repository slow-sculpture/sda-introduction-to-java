package zajecia3;

public class ForZadanie3 {
    public static void main(String[] args) {

       /* Zadanie​​3
       Napisz program,który przy użyciu instrukcji for sumuje liczby całkowite od 1 do 100*/

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Suma liczb calkowitych 1 do 100 to: " + sum);
    }
}
