package zajecia6.zadanie2;

public class Point {
    private double x;
    private double y;

    //konstruktor bezparametrowy
    public Point() {
    }

    //konstruktor parametrowy
    public Point(int x, int y) {
        this.x = x; //this.x ten - pole klasy; x - parametr; = - przypisanie do pola x parametru x; w aplikacji ktos moze nazwac zmienna jak chce - this mowi ocb
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}
