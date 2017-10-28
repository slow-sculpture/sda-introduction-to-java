package zajecia3;

public class ForIntro {
    public static void main(String[] args) {

        ///////////////liczby 0 - 500 podzielne przez 5 bez reszty
        System.out.println("Rosnaco");
        for (int i = 0; i < 500; i += 5) {
            System.out.println(i);
        }

        System.out.println("//////////LUB///////////////////");

        for (int j = 0; j < 500; j++) {
            if (j % 5 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("Malejaco");
        for (int i = 500; i > 0; i -= 5) {
            System.out.println(i);
        }

    }
}
