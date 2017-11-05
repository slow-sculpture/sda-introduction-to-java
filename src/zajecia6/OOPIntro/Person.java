package zajecia6.OOPIntro;

/**
 * Klasa Person do reprezentacji danych o osobie
 */
public class Person {
    //stan - mowi o tym jaka ta osoba jest - przechowuje jej dane
    //pola klasy -field, property
    public String name;
    public String surname;
    public int age;
    public String email;

    //zachowanie - jakas czynnosc
    // metoda - funkcja w klasie
    public void sayHello(){
        System.out.println("Jestem " + name + " " + surname);
    }
}
