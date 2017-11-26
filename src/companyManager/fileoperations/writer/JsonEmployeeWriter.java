package companyManager.fileoperations.writer;

import companyManager.Employee;
import companyManager.fileoperations.reader.JsonEmployeeReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonEmployeeWriter extends AbstractEmployeeWriter{
    public JsonEmployeeWriter(String pathToFile){
        super(pathToFile);
    }
    @Override
    public void writeEmployees(Employee[] employees) {
       /* try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToFile))){
            bufferedWriter.write(employees.length + "\n");
            for(int i = 0; i<employees.length;i++){
                bufferedWriter.write(employees[i].toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
