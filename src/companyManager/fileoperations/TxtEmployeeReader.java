package companyManager.fileoperations;

import companyManager.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtEmployeeReader extends AbstractEmployeeReader {
    protected TxtEmployeeReader(String pathToFile) {                                                     //konstruktor
        super(pathToFile);
    }

    @Override
    public Employee[] readEmployees() {

        Employee[] employees = null;                                                                    //nie wiem jaka duza - zapisane w pierwszej linijce txt
        int i = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {         //try with resources -> java 7 - samo zrobi close()
            String companySize = bufferedReader.readLine();                                            //odczyt pierwszej linijki z txt - wielkosc tablicy employees
            employees = new Employee[Integer.parseInt(companySize)];                                  //zainicjalizowanie tablicy
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(" ");                                               //metoda dzielaca tekst po jakims znaku i tworzaca tablice stringow
                Employee emp = new Employee(split[1], split[2]);
                emp.setId(Integer.parseInt(split[0]));                                                  //przerobi Stringa na inta - 1 z txt czyli lp. nie ma byc stringiem
                emp.setAge(Integer.parseInt(split[3]));
                emp.setSalary(Double.parseDouble(split[4]));
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
