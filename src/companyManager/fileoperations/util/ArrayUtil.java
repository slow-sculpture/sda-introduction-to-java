package companyManager.fileoperations.util;

import companyManager.Employee;

public class ArrayUtil {
    public static int countElements(Employee[] employees) {
        int size = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                size++;
            }
        }
        return size;
    }
}
