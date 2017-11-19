package zajecia8.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.out.println("Zawartosc pliku");

        String line = null;
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("nontatka.txt");
            bufferedReader = new BufferedReader(fileReader);
            // System.out.println(bufferedReader.readLine());                            //przeczyta tylko linie tekstu - koniec do \n; na koncu null; kazde wywolanie readLine przechodzi linijke dalej
            while ((line = bufferedReader.readLine()) != null) {   //wynik przypisac do zmiennej line
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {                                     //zamykanie obu readerow
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileReader !=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //wyjatki dziedziczace po RuntimeException nie musza byc otoczone try-catch -> wyjatki w czasie dzialania programu
    //wyjatki po IOException musza -> wyjatki kontrolowane, a fakt ich rzucenia trzeba zadeklarowac w funkcji


}
