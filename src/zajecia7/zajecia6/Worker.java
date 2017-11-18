package zajecia7.zajecia6;

public class Worker extends Person{
    private int salary;
    private String position;

  /*  public Worker(int salary, String stand){
        this.salary = salary;
        this.position = stand;
    }*/

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
}
