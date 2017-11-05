package zajecia6.zadanie2;

/**
 * Klasa Person do reprezentacji danych o osobie
 */
public class PersonConstructorAdd {
    //stan - mowi o tym jaka ta osoba jest - przechowuje jej dane
    //pola klasy -field, property
    public String name;
    public String surname;
    public int age;
    public String email;


    //konstruktor bez parametrow
    public PersonConstructorAdd(){

    }
    //1
    public PersonConstructorAdd(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    //2 korzysta z 1
    public PersonConstructorAdd(String name, String surname, int age){
        this(name, surname);  //wyowlanie 1
        this.age = age;
    }

    //3 korzysta z 2
    public PersonConstructorAdd(String name, String surname, int age, String email){
        this(name, surname, age); //wywolanie 2
        this.email = email;
    }

    //zachowanie - jakas czynnosc
    // metoda - funkcja w klasie
    public void sayHello(){
        System.out.println("Jestem " + name + " " + surname);
    }
}
