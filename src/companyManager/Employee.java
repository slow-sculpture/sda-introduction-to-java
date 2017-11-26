package companyManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

//xml wszystkie dane i ma pobrac przez gettera
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Employee {
    ///////////////////////////////////////////////////////////////////////////
    private int id;           //dorabiamy identyfikator + get i set
    ////////////////////////////////////////////////////////////////////////


    private String name;
    private String surname;
    private int age;
    private double salary;

    private Employee(){

    }
    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Employee(String name, String surname, int age){
        this(name, surname); //odwolanie do wczesniejszego konstruktora musi byc pierwsza linijka kodu
        this.age = age;
    }
    public Employee(String name, String surname, int age, double salary){
        this(name, surname, age);
        this.salary = salary;
    }


    ////////////////////////////////////////////////////////////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    ///////////////////////////////////////////////////////////////////////////////////////


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(){
        this.surname = surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public String getDescription(){
        return String.format("Name: %s, Surname: %s, Age: %d, Salary: %.2f", name, surname, age, salary);
    }




    /////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString(){
        return String.format("%d %s %s %d %.2f",
                id,
                name,
                surname,
                age,
                salary
        );
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////


}
