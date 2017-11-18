package zajecia7.zadanie6_Inheritance;
//Klasa rozszerzajaca - subclass
public class Student extends Person{
    private int noIndex;
    private String univName;

    public Student(String name, String surname, int age){
        super(name, surname, age);    //wywolanie konstruktora nadklasy
    }

    public Student(String name, String surname, int age, int noIndex, String univName) {
        super(name, surname, age);
        this.noIndex = noIndex;
        this.univName = univName;
    }

    public int getNoIndex() {
        return noIndex;
    }

    public void setNoIndex(int noIndex) {
        this.noIndex = noIndex;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String describe(){
        return this.name+ " " + this.getSurname() + " " + this.getAge(); //name dostepne bo protected // wszystko dziedziczone z Person
    }
}
