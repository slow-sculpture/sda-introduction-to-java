package companyManager;

import java.util.Scanner;


//////////////////////////////////rozszerzenie z zajec6 zad4 -> zajecia8 /////// dodana liste pracownikow ma zapisac do pliku
public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe firmy: ");
        String name = scanner.nextLine();
        Company myCompany = new Company(name);

        printMenu();

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addNewEmployee(scanner, myCompany);
                break;
            case 2:
                printListOfEmployees(myCompany);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid command");
                break;
        }

    }

    public static void printListOfEmployees(Company myCompany) {
        //petla for each
        for(Employee e: myCompany.getEmployees()){
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
        if(isSuccess){
            System.out.println("Adding executed successfully");
        } else {
            System.out.println("Adding !executed");
        }
    }

    public static void printMenu() {
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Dodaj pracownika");
        System.out.println("2. Wyswietl spis pracownikow");
        System.out.println("3. Podaj srednia wyplate");
    }
}
