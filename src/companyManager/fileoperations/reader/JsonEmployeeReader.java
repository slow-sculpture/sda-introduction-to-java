package companyManager.fileoperations.reader;

import companyManager.Employee;
import companyManager.fileoperations.util.ParseUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonEmployeeReader extends AbstractEmployeeReader {
    public JsonEmployeeReader(String pathToFile){
        super(pathToFile);
    }
    @Override
    public Employee[] readEmployees() {

        int i = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))){
            String companySize = bufferedReader.readLine();
            int theSize = Integer.parseInt(companySize);
            Employee [] employees = new Employee[theSize];
            String line = bufferedReader.readLine();
            while(line!=null){
                String[] text = line.split("");
                Employee newEmp = new Employee(text[1], text[2]);
                newEmp.setId(Integer.parseInt(text[0]));
                newEmp.setAge(Integer.parseInt(text[3]));
                newEmp.setSalary(ParseUtil.parseDouble(text[4]));
                employees[i++] = newEmp;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Employee[0];
    }
}
