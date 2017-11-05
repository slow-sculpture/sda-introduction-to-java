package zajecia6.zadanie4;

public class Company {
    private static final int DEFAULT_SIZE = 50;
    private String name;
    //kompozycja - skladanie sie z (pracownikow)
    private Employee[] employees;
    //zmienna przechowujaca wielkosc firmy
    private int companySize = 0;

    //konstruktory
    public Company(String name) {
        this.name = name;
        this.employees = new Employee[DEFAULT_SIZE];  //trzeba zainicjalizowac, bo nie ma sensu dawac jako parametr kontrukrora
    }

    public Company(String name, int initialSize) {
        this(name);
        this.employees = new Employee[initialSize];
    }

    //metoda dodajaca pracownika
    public boolean addEmployee(Employee emp) {
        if (companySize < employees.length) {
            employees[companySize++] = emp;
            return true;
        }
        return false;
    }

    //gettery i settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        //tylko do odczytu
    public Employee[] getEmployees() {
        return employees;
    }
}
