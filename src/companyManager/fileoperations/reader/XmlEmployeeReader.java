package companyManager.fileoperations.reader;

import companyManager.Employee;

public class XmlEmployeeReader extends AbstractEmployeeReader {
    public XmlEmployeeReader(String pathToFile) {
        super(pathToFile);
    }

    @Override
    public Employee[] readEmployees() {
        return new Employee[0];
    }
}
