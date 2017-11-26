package companyManager.fileoperations.reader;

import companyManager.Employee;

/**
 * Interefejs okreslajacy metode odczytu pracownikow
 */
public interface EmployeeReader {        //tylko sygnatury w interfejsie
    Employee[] readEmployees();
}
