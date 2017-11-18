package zajecia7.zadanie8_Abstract;

public class Kolo extends Figura {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double obliczPole() {
        return 3.14 * r * r;
    }

    @Override
    public double obliczObwod() {
        return 2 * 3.14 * r;
    }
}
