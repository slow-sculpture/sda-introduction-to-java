package zajecia3;

public class PostIncrementation {
    public static void main(String[] args) {
        int licznik = 0;
        System.out.println(++licznik);
        System.out.println(licznik++);

        int licznik2 = 1;
        System.out.println(licznik2++);
        System.out.println(licznik2);
    }
}


// licznik = licznik +5 => licznik +=5;
// licznik++ => postinkrementacja - najpierw uzycie wartosci zmiennej potem ++
// ++licznik => preinkremetacja - najpierw ++ potem uzycie wartosci (podwyzszonej)

/*
System.out.println(wynik);       -\    System.out.println(wynik++);
wynik++;                         -/
 */