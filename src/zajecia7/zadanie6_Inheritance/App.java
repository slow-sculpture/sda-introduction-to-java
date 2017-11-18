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


        System.out.println(person);//wyrzuci reprezentacje obiektu pakiet@hashcode a chcemy opis
                                    // -> @Override meteody toString z klasy Object
        System.out.println(student2);  //@Override toString w klasie Student
        //System.out.println(); mozna wszystko drukowac bo jednym z przeciazen tej metody
        //                      jest @Nullable Object x - kazdy obiekt


        Worker worker1 = new Worker("Dom", "Bow", 23);
        Worker worker2 = new Worker("Tim", "Low", 33, 200, "Janitor");
        System.out.println(worker1.describe());  //wezmie z Person
        System.out.println(worker2);             //wezmie z Worker @Override toString

    }
}
