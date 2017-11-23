package companyManager.fileoperations;

import companyManager.fileoperations.writer.EmployeeWriter;
import companyManager.fileoperations.writer.JsonEmployeeWriter;
import companyManager.fileoperations.writer.TxtEmployeeWriter;
import companyManager.fileoperations.writer.XmlEmployeeWriter;

public class EmployeeWriterFactory {
    public static EmployeeWriter createWriter(String path) {
        if (path.endsWith(".txt")) {
            return new TxtEmployeeWriter(path);
        } else if (path.endsWith(".xml")) {
            return new XmlEmployeeWriter(path);
        } else if (path.endsWith((".json"))) {
            return new JsonEmployeeWriter(path);
        }
        return null;
    }
}
