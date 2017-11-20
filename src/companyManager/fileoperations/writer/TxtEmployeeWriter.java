package companyManager.fileoperations.writer;

import companyManager.Employee;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtEmployeeWriter extends AbstractEmployeeWriter {

    public TxtEmployeeWriter(String pathToFile){
        super(pathToFile);
    }
    @Override
    public void writeEmployees(Employee[] employees) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToFile))){
            bufferedWriter.write(employees.length + "\n");
            for (int i = 0; i<employees.length; i++){
                Employee emp = employees[i];
                bufferedWriter.write(emp.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
