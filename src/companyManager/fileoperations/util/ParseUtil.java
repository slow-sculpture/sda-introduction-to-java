package companyManager.fileoperations.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Klasa narzedziowa pomagajaca w konwersji
 */
public class ParseUtil {
    //metoda konwertujaca double ze String - pomocna gdy liczba zapisana jest z przecinkiem - jak w Polsce i Francji
    public static double parseDouble(String s) {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        Number parse = null;
        try {
            parse = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();   //albo np return 0 zeby sie nie wywalalo
        }
        return parse.doubleValue();
    }
}

