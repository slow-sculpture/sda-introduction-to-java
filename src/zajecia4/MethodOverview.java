package zajecia4;

public class MethodOverview {
    public static void wypisz(String a, String b){  //sygnatura -> wypisz(String a, String b) = nazwa(typ argumentow)
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        wypisz("tekst1", "tekst2");
    }
}
