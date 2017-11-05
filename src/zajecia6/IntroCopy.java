package zajecia6;

public class IntroCopy {
    public static void changeNumver(int n) {
        System.out.println("W funkcji przed zmiana: " + n);
        n = n * 10;

        System.out.println("W funkcji po zmianie: " + n);

        //w ramach funkcji pracowalismy na kopii liczby - po wyjsciu z funkcji wychodzimy ze stosu

        //przy typach pryimitywnych -> kopiowanie wartosci
        //przy obiektowych -> kopiowanie referencji

    }

    public static void main(String[] args) {
        int liczba = 10;
        System.out.println("Przed funkcja: " + liczba);
        changeNumver(liczba);
        System.out.println("Po wywolaniu funkcji " + liczba);
    }
}

