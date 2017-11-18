package zajecia7.zadanie8_Abstract;

public class Kwadrat extends Figura {
    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    //klasa musi implementowa odgorne metody

    @Override
    public double obliczPole() {
        return a*a;
    }

    @Override
    public double obliczObwod() {
        return 4 * a;
    }


}
