package zajecia5;

public class ArrayHelper {
    /**
     * Metoda sprawdzajaca w tablicy int[] czy podany element wystepuje
     */
    public static boolean isPresent(int[] array, int element) {
        boolean present = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                present = true;
                break;
            }
        }
        return present;
    }

    /**
     * Metoda wyswietlajaca wszystkie elementy tablicy int[] w jednej linii
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
