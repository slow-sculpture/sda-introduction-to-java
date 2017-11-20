package companyManager.fileoperations.reader;

import companyManager.Employee;
import companyManager.fileoperations.util.ParseUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtEmployeeReader extends AbstractEmployeeReader {
    public TxtEmployeeReader(String pathToFile) {                                                     //konstruktor
        super(pathToFile);
    }

    @Override
    public Employee[] readEmployees() {

        Employee[] employees = null;                                                                    //nie wiem jaka duza - zapisane w pierwszej linijce txt
        int i = 0;

        //try with resources -> java 7 - samo zrobi close()
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {

            //odczyt pierwszej linijki z txt - wielkosc tablicy employees - ilosc pracownikow
            //odczytana ilosc bedzie typu String wiec trzeba ja "sparsowac", czyli przekonwertowac
            //typ String na int
            String companySize = bufferedReader.readLine();

            //zainicjalizowanie tablicy
            employees = new Employee[Integer.parseInt(companySize)];

            //odczyt wszystkich linii z pliku
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                //pobierz i-ta linie i podziel po separarowrze (np. spacja)
                //metoda dzielaca tekst po jakims znaku i tworzaca tablice stringow
                String[] split = line.split(" ");
                //ustawiamy odpowiednie pola wg zalaczonego schematu
                //przerobi Stringa na inta - 1 z txt czyli lp. nie ma byc stringiem
                Employee emp = new Employee(split[1], split[2]);
                emp.setId(Integer.parseInt(split[0]));
                emp.setAge(Integer.parseInt(split[3]));
                emp.setSalary(ParseUtil.parseDouble(split[4]));
                employees[i] = emp;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

}
