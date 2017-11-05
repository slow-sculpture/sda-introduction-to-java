package zajecia6.zadanie1;

public class Program {
    public static void main(String[] args) {
        //stworzyc 3 obiekty typu prostokata i wywolac metody
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        Rectangle rec3 = new Rectangle();

        //rec1.a = 1;
        rec1.setA(1);
        //rec1.b = 2;
        rec1.setB(2);
        rec1.calcArea();
        System.out.println("Bok a = " + rec1.getA() + ", a bok b = " + rec1.getB());
        System.out.println("Pole rec1 = " + rec1.calcArea() + ", a obwod = " + rec1.calcCircumference());

        rec2.setA(4.454);
        rec2.setB(5.5667);
        System.out.println("Pole rec2 = " + rec2.calcArea() + ", a obwod = " + rec2.calcCircumference());

        rec3.setA(76);
        rec3.setB(98);
        System.out.println("Pole rec3 = " + rec3.calcArea() + ", a obwod = " + rec3.calcCircumference());

    }
}
