package companyManager.fileoperations.reader;

import companyManager.Employee;

public class JsonEmployeeReader extends AbstractEmployeeReader {
    public JsonEmployeeReader(String pathToFile) {
        super(pathToFile);
    }

    @Override
    public Employee[] readEmployees() {
        return new Employee[0];
    }
}
