package zajecia2.instrukcjesterujace;

public class ScopeIntro {
    public static void main(String[] args) {
        int f =10;
        int wynik1 = f / 2;
        System.out.println(wynik1);

        if (f > 10){
            int wynik = f * 10;
            System.out.println(wynik);
        }

        if (f < 10){
            int wynik = f + 20;
            System.out.println(wynik);
        }

        ////zasieg (scope) zmiennej jest widoczny pomiedzy {} w ktorych zostala
        //zadeklarowana oraz w {} wewnatrz wczesniejszych - na zewnetrz jest niewidoczna////
    }
}
