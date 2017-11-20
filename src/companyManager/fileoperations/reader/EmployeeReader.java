package companyManager.fileoperations.reader;

import companyManager.Employee;

public interface EmployeeReader {        //tylko sygnatury w interfejsie
    Employee[] readEmployees();
}
