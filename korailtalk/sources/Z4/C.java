package z4;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class C {
    public static String getNumber(String str) {
        return str.replaceAll("\\D", "");
    }

    public static boolean isInvalidName(String str) {
        return Pattern.compile("^[가-힣a-zA-Z ]+$").matcher(str).find();
    }

    public static boolean isNumber(String str) {
        return Pattern.matches("^[0-9]+$", str);
    }

    public static boolean isValidEmail(String str) {
        return C6630d.isNotNull(str) && Pattern.matches("[\\w\\~\\-\\.]+@[\\w\\~\\-]+(\\.[\\w\\~\\-]+)+", str.trim());
    }

    public static String makePhoneNumber(String str) {
        if (Pattern.matches("(\\d{3})(\\d{3,4})(\\d{4})", str)) {
            return str.replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-$2-$3");
        }
        return null;
    }
}
