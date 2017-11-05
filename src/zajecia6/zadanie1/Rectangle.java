package zajecia6.zadanie1;
/////////////////////////////zadanie 1/////////////////

/**
 * Klasa do reprezentacji prostokata
 */
public class Rectangle {
    public double a;
    public double b;

    //metoda obliczajaca pole
    public double calcArea() {
        return a * b;
    }

    //metoda obliczjaca obwod
    public double calcCircumference() {
        return 2 * a + 2 * b;
    }


}
