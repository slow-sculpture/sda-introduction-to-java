package companyManager.fileoperations.writer;

import companyManager.Employee;

public abstract class AbstractEmployeeWriter implements EmloyeeWriter {
    protected String pathToFile;

    protected AbstractEmployeeWriter(String pathToFile) {             //konstruktor
        this.pathToFile = pathToFile;
    }

    @Override
    public abstract Employee[] writeEmployees();


}
