package zajecia6.zadanie4;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Employee(String name, String surname, int age){
        this(name, surname);
        this.age = age;
    }
    public Employee(String name, String surname, int age, double salary){
        this(name, surname, age);
        this.salary = salary;
    }

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
    public void setAge(){
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDescription(){
        return String.format("Name: %s, Surname: %s, Salary: %f", name, surname, salary);
    }
}
