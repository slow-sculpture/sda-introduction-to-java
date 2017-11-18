package zajecia7.interfaces;

public interface Workable {

    //w javie jawne dziedziczenie tylko po jednej klasie - extends tylko jedna klase
    //interefejsow moze byc wiele
    //interfejs - tylko definicje metod bez pol i konstruktorow
    //reprezentuje liste zachowan bez implementacji
    //nie mozna utworzyc instancji interfejsu
    //interefejs moze extends inny
    //interfejsy sie implementuje
    //nie ma problemu z kolejnoscia konstruktorow itd bo ich nie ma
    //nie ma problemu z co i po czym dziedziczy

    // 1. interfejs
    // 2. abstract
    // 3. klasy

    void work();
    double getSalary();
}
