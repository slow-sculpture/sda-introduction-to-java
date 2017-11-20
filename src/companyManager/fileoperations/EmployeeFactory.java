package companyManager.fileoperations;

import companyManager.fileoperations.reader.EmployeeReader;
import companyManager.fileoperations.reader.JsonEmployeeReader;
import companyManager.fileoperations.reader.TxtEmployeeReader;
import companyManager.fileoperations.reader.XmlEmployeeReader;

public class EmployeeFactory {
    public static EmployeeReader createReader(String path) {
        if (path.endsWith(".txt")) {
            return new TxtEmployeeReader(path);
        } else if (path.endsWith(".xml")) {
            return new XmlEmployeeReader(path);
        } else if (path.endsWith(".json")) {
            return new JsonEmployeeReader(path);
        }
        return null;
    }
}
