package companyManager.fileoperations.writer;

import companyManager.Employee;

public class TxtEmployeeWriter extends AbstractEmployeeWriter {

    public TxtEmployeeWriter(String pathToFile){
        super(pathToFile);
    }
    @Override
    public Employee[] writeEmployees() {
        return new Employee[0];
    }
}
