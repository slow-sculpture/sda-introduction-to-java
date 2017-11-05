package zajecia6.zadanie2;

public class ProgramPersonConstructorAdd {
    public static void main(String[] args) {
        PersonConstructorAdd prowadzacy = new PersonConstructorAdd();
        prowadzacy.name = "Piotr";
        prowadzacy.surname = "Siwinski";
        prowadzacy.email = "test@wp.pl";
        prowadzacy.age = 99;

        PersonConstructorAdd student = new PersonConstructorAdd();
        student.name = "Jan";
        student.surname = "Kowalski";
        student.age = 34;
        student.email = "test2@wp.pl";

        prowadzacy.sayHello();
        student.sayHello();    }
}
