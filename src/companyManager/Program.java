package companyManager;

import companyManager.fileoperations.EmployeeReaderFactory;
import companyManager.fileoperations.reader.EmployeeReader;
import companyManager.fileoperations.util.ArrayUtil;
import companyManager.fileoperations.writer.EmployeeWriter;
import companyManager.fileoperations.writer.TxtEmployeeWriter;

import java.util.Arrays;
import java.util.Scanner;


//////////////////////////////////rozszerzenie z zajec6 zad4 -> zajecia8 /////// dodana liste pracownikow ma zapisac do pliku


public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj nazwe firmy: ");
        String name = scanner.nextLine();
        Company myCompany = new Company(name);


        boolean exit = false;
        while (!exit) {
            printMenu();
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    addNewEmployee(myCompany);
                    printListOfEmployees(myCompany);
                    break;
                case 2:
                    printListOfEmployees(myCompany);
                    break;
                case 3:
                    importEmployee(myCompany);
                    break;
                case 4:
                    saveEmployees(myCompany);
                    break;
                case 5:
                    System.out.println("Konczenie pracy systemu");
                    exit = true;
                default:
                    break;
            }

        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void saveEmployees(Company myCompany) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku wraz z docelowy rozszerzeniem: ");
        String pathToFile = scan.nextLine();
        EmployeeWriter writer = new TxtEmployeeWriter(pathToFile);
        int size = ArrayUtil.countElements(myCompany.getEmployees());
        Employee[] copy = Arrays.copyOf(myCompany.getEmployees(), size);
        writer.writeEmployees(copy);
    }


    public static void importEmployee(Company myCompany) {
        System.out.println("Podaj sciezke do pliku");
        Scanner scan2 = new Scanner(System.in);
        String pathToFile = scan2.nextLine();

        EmployeeReader reader = EmployeeReaderFactory.createReader(pathToFile);
        Employee[] employees = reader.readEmployees();
        myCompany.addEmployees(employees);

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void printListOfEmployees(Company myCompany) {
        //petla for each
        for (Employee e : myCompany.getEmployees()) {
            if (e != null) {
                System.out.println(e.getDescription());
            }
        }
    }

    public static void addNewEmployee(Company myCompany) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String empName = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String empSurname = sc.nextLine();
        System.out.println("Poadj wiek: ");
        int empAge = sc.nextInt();
        System.out.println("Podaj pensje: ");
        double empSalary = sc.nextDouble();

        Employee employee = new Employee(empName, empSurname, empAge, empSalary);
        boolean isSuccess = myCompany.addEmployee(employee);
        if (isSuccess) {
            System.out.println("Adding executed successfully");
        } else {
            System.out.println("Adding !executed");
        }
    }

    public static void printMenu() {
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Dodaj pracownika");
        System.out.println("2. Wyswietl spis pracownikow");
        System.out.println("3. Import pracownikow");
        System.out.println("4. Zapisz pracownikow do pliku");
        System.out.println("5. Wyjscie z systemu");
        System.out.println("Wybor: ");
    }
}
