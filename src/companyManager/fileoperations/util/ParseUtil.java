package companyManager.fileoperations.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParseUtil {
    public static double parseDouble(String s) {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        Number parse = null;
        try {
            parse = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse.doubleValue();
    }
}

