package zajecia6.OOPIntro;

public class OOPIntro {
    public static void main(String[] args) {
        Person prowadzacy = new Person();
        prowadzacy.name = "Piotr";
        prowadzacy.surname = "Siwinski";
        prowadzacy.email = "test@wp.pl";
        prowadzacy.age = 99;

        Person student = new Person();
        student.name = "Jan";
        student.surname = "Kowalski";
        student.age = 34;
        student.email = "test2@wp.pl";

        prowadzacy.sayHello();
        student.sayHello();

    }
}
