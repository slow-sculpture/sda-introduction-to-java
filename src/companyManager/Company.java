package companyManager;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//do xml trzeba powiedziec ze to jest xml root
@XmlRootElement(name = "company")

public class Company {
    private static final int DEFAULT_SIZE = 5;
    private String name;
    //kompozycja - skladanie sie z (pracownikow)
    private Employee[] employees;
    //zmienna przechowujaca wielkosc firmy
    private int companySize = 0;

    //konstruktory

    public Company() { // konstruktor na potrzeby xml
    }

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


    ///////////////////////////////////////////////////////////////
    public void addEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            this.addEmployee(employees[i]);
        }

    }
//////////////////////////////////////////////////////////////



    //gettery i settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        //tylko do odczytu
    @XmlElement(name = "employee")   //do xml
    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

}
