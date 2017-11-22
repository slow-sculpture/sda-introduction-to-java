package companyManager.fileoperations.reader;

import companyManager.Employee;

public class CsvEmployeeReader extends AbstractEmployeeReader {
    public CsvEmployeeReader(String pathToFile){
        super(pathToFile);
    }

    @Override
    public Employee[] readEmployees() {
        return new Employee[0];
    }
}
