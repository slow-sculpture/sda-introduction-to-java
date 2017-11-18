package zajecia6.zadanie2;

public class Program {
    public static void main(String[] args) {
        Point P = new Point();                    //konstr bezparam
        Point myP = new Point(2, 3);        //konstr param

        P.setX(41.23);
        P.setY(123.45);

        System.out.println("Wskazano pkt P(" + P.getX() + "," + P.getY() + ")");
        System.out.println("Odleglosc pktu P od (0,0) to: " + P.distanceFromOrigin());
        System.out.println();
        System.out.println("Wskazano pkt myP(" + myP.getX() + "," + myP.getY() + ")");
        System.out.println("Odleglosc pktu myP od (0,0) to: " + myP.distanceFromOrigin());
    }
}

//konstruktor metoda ktora:                   Point(argumenty)
//1. ma nazwe jak klasa
//2. public (moze byc private np. Math)
//3. nie ma typu zwracanego
//4. do tworzenia obiektu za pomoca operatora new; new mowi javie zeby zaalokowala pewnien obszar pamieci

//jezeli nie ma w klasie konstruktora
//to samo zostanie utworzony w pamieci      np. public Point(){}

//przeciazanie overloading -> nadanie konstruktorowi wymuszajacych parametrow
//moga byc dwa jedene pusty drugi z argumentami - te same nazwy

//jezeli stworzymym konstr parametrowy to bez utworzenia recznego bezparametrowego
//sam program go nie utworzy

//konstruktory moga miec ta sama nazwe ale rozna sygnatore-> nazwa(parametry)