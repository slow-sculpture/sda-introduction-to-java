package zajecia6.zadanie1;
/////////////////////////////zadanie 1/////////////////

/**
 * Klasa do reprezentacji prostokata
 */
public class Rectangle {
    private double a;
    private double b;

    //getter i setter dla pola a
    public double getA() {
        return a;
    }

    public void setA(double a) {
        //wyrzucenie wyjatku przy podaniu ujemnej wartosci boku
        if (a <= 0) {
            throw new IllegalArgumentException("Dlugosc mniejsza od 0");
        }
        this.a = a;                 //this. ten obiekt, a od obiektu
        //referencja od obiektu ktory wywolal metode
    }

    //getter i setter dla pola b
    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (a <= 0) {
            throw new IllegalArgumentException("Dlugosc mniejsza od 0");
        }
        this.b = b;
    }

    //metoda obliczajaca pole
    public double calcArea() {
        return a * b;
    }

    //metoda obliczjaca obwod
    public double calcCircumference() {
        return 2 * a + 2 * b;
    }
}
////////////////////////////////////////////
//wszystkie pola powinny byc private a dostep do nich powienien byc za pomoca getter i setter
