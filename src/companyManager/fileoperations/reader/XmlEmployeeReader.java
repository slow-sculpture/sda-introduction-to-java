package companyManager.fileoperations.reader;

import companyManager.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XmlEmployeeReader extends AbstractEmployeeReader {
    public XmlEmployeeReader(String pathToFile) {
        super(pathToFile);
    }

    @Override
    public Employee[] readEmployees() {
        //tworze zbior pracownikow odczytanych z pliku o ilosc w pierwszej linijce tekstu
        Employee[] employees = null;
        int i = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))){
            //odczyt z pliku wilkosci tablicy
            //na razie jest tekstem
            String companySize = bufferedReader.readLine();
            int theSize = Integer.parseInt(companySize);
            employees = new Employee[theSize];

            //odczyt pozostalych linii tekstu + podzial tekstu na elementy
            String line = bufferedReader.readLine();
            while(line != null){
                String[] text = line.split(" ");
                //tworze pracownika z konstruktora
                Employee newEmp = new Employee(text[1], text[2]);
                newEmp.setId(Integer.parseInt(text[0]));
                newEmp.setAge(Integer.parseInt(text[3]));
                newEmp.setSalary(Double.parseDouble(text[4]));
                //dodanie pracownika do tablicy
                employees[i++] = newEmp;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Blad");
            e.printStackTrace();
        }


        return employees;
    }
}
