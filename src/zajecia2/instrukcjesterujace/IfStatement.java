package zajecia2.instrukcjesterujace;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int wiek;
        Scanner podajWiek = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        wiek = podajWiek.nextInt();
        if (wiek >= 18){
            System.out.println("Masz 18 lat. Witaj w systemie!");
        } else{
            System.out.println("Spadaj gowniarzu!!!");
        }
    }
}
