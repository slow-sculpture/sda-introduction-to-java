package zajecia1.operatory;

public class OperatoryPorownawcze {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println("A = " + a + " B = " + b);

        // do zminnej boolean o nazwie czyRowne wpisz (operator = );
        // wynika operacji porownania a == b
        boolean czyRowne = a == b;
        System.out.println("Czy A rowne od B? -> " + czyRowne);

        boolean czyRozne = a != b;
        System.out.println("Czy A rozne od B? -> " + czyRozne);

        boolean czyWieksze = a > b;
        System.out.println("Czy A wieksze od B? -> " + czyWieksze);

    }
}
