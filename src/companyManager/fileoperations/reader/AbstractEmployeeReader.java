package companyManager.fileoperations.reader;

import companyManager.Employee;

/**
 * Abstrakcyjny czytnik - tutaj przechowujemy sciezke pliku, bo nic wiecej nie mozna powiedziec o tej klasie
 */
public abstract class AbstractEmployeeReader implements EmployeeReader {   //musi zaimplementowac metody interfejsu
    protected String pathToFile;

    protected AbstractEmployeeReader(String pathToFile) {             //konstruktor
        this.pathToFile = pathToFile;
    }                                                               //konstruktor protected bo i tak z klasy abstrakcyjnej nie da sie utworzyc obiektu

    @Override
    public abstract Employee[] readEmployees();                       //zaimplementowana metoda z interfejsu


}
