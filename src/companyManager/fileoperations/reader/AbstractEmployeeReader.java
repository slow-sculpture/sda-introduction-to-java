package companyManager.fileoperations.reader;

import companyManager.Employee;

public abstract class AbstractEmployeeReader implements EmloyeeReader {   //musi zaimplementowac metody interfejsu
    protected String pathToFile;

    protected AbstractEmployeeReader(String pathToFile) {             //konstruktor
        this.pathToFile = pathToFile;
    }

    @Override
    public abstract Employee[] readEmployees();                       //zaimplementowana metoda z interfejsu


}
