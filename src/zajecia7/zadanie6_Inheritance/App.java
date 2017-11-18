package zajecia7.zadanie6_Inheritance;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Foo", 30);
        System.out.println(person.describe());

        Student student = new Student("Mike", "Wazowsky", 20);
        Student student2 = new Student("Mike", "Wazowsky", 20, 23, "PP");
        System.out.println(student.describe());
        System.out.println(student2.describe());
        System.out.println(student.getUnivName()); //dostepne tylko w Student

    }
}
