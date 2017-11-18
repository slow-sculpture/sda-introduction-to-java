package zajecia7.zadanie6_Inheritance;

public class Worker extends Person{
    private int salary;
    private String position;

    public Worker(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Worker(String name, String surname, int age, int salary, String position) {
        super(name, surname, age);
        this.salary = salary;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString(){
        return String.format("%s, jestem w pracy %s i zarabiam %s", super.describe(),getPosition(), getSalary());
    }
}
