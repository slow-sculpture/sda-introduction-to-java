package companyManager;

import companyManager.fileoperations.EmployeeFactory;
import companyManager.fileoperations.reader.EmployeeReader;
import companyManager.fileoperations.reader.TxtEmployeeReader;
import companyManager.fileoperations.writer.EmployeeWriter;
import companyManager.fileoperations.writer.TxtEmployeeWriter;

import java.util.Scanner;


//////////////////////////////////rozszerzenie z zajec6 zad4 -> zajecia8 /////// dodana liste pracownikow ma zapisac do pliku


public class Program {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

///////////////////////////////////////////////////////////////////////////////////////////////////
        /*//test TxtEmployeeReader
        //posluguje sie interfejsem i polimorfizmeme
        EmployeeReader employeeReader = new TxtEmployeeReader("listaPracownikow.txt");
        Employee[] employees = employeeReader.readEmployees();

        //test write
        EmployeeWriter writer = new TxtEmployeeWriter("test.txt");
        writer.writeEmployees(employees);*/

////////////////////////////////////////////////////////////////////////////////////////////////////




        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe firmy: ");
        String name = scanner.nextLine();
        Company myCompany = new Company(name);

  /*      printMenu();

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addNewEmployee(scanner, myCompany);
                break;
            case 2:
                printListOfEmployees(myCompany);
                break;
            case 3:


///////////////////////////////////////////////////////////////////////////////////////////////////
                importEmployee();
                break;
////////////////////////////////////////////////////////////////////////////////////////////////////



            default:
                System.out.println("Invalid command");
                break;
        }*/

        boolean exit = false;
               while (!exit) {
                   printMenu();
                   int wybor = scanner.nextInt();
                   switch (wybor) {
                       case 1:
                           addNEmployee(myCompany);
                           printListOfEmployees(myCompany);
                           break;
                       case 2:
                           printListOfEmployees(myCompany);
                           break;
                       case 3:
                           importEmployee(myCompany);

                       default:
                           break;
                   }

               }}




////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void importEmployee(Company myCompany) {
        System.out.println("Podaj sciezke do pliku");
        String pathToFile = scanner.nextLine();

        EmployeeReader reader = EmployeeFactory.createReader(pathToFile);
        Employee[] employees = reader.readEmployees();
        myCompany.ad(employees);

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////





    public static void printListOfEmployees(Company myCompany) {
        //petla for each
        for (Employee e : myCompany.getEmployees()) {
            System.out.println(e.getDescription());
        }
    }

    public static void addNewEmployee(Scanner scanner, Company myCompany) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String empName = scanner2.nextLine();
        System.out.println("Podaj nazwisko: ");
        String empSurname = scanner2.nextLine();
        System.out.println("Poadj wiek: ");
        int empAge = scanner2.nextInt();
        System.out.println("Podaj pensje: ");
        double empSalary = scanner2.nextDouble();

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
        System.out.println("Wybor: ");
    }
}
