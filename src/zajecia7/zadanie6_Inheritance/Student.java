package zajecia7.zadanie6_Inheritance;

//Klasa rozszerzajaca - subclass
public class Student extends Person {
    private int noIndex;
    private String univName;

    public Student(String name, String surname, int age) {
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

/*
    public String describe(){
        return this.name+ " " + this.getSurname() + " " + this.getAge(); //name dostepne bo protected w person
                                                                        // wszystko dziedziczone z Person
    }
*/   //przeniesione do Person bo i tak bedzie dziedziczyc metode przy wywolaniu np. student.describe()

    @Override //przeladowanie - adnotacja - nic nie robi ale jak np. wpisze zla sygnature metody to podkresli ze blad
    public String describe() {
        //1) wykorzystanie z Person
        //String s = super.describe();
       // return String.format("%s i jestem studentem %s", s, getUnivName());

        //2) wykorzystanie z Person
        return String.format("%s i jestem studentem %s", super.describe(), getUnivName());

        //3) zmiana opisu
        // return String.format("%s %s i jestem studentem %s", getName(), getSurname(), getUnivName());

    }


    @Override
    public String toString() {
        return String.format("%s i jestem studentem %s", super.describe(), getUnivName());
    }
}
