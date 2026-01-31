package Q7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: Q7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0709m {
    public static final String FALSE = "false";
    public static final String NO = "no";
    public static final String OFF = "off";
    public static final String ON = "on";
    public static final String TRUE = "true";
    public static final String YES = "yes";

    /* renamed from: a, reason: collision with root package name */
    private static final List f4115a = Collections.unmodifiableList(Arrays.asList(Boolean.FALSE, Boolean.TRUE));

    public static boolean and(boolean... zArr) {
        O.requireNonEmpty(zArr, "array");
        for (boolean z8 : zArr) {
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    public static Boolean[] booleanValues() {
        return new Boolean[]{Boolean.FALSE, Boolean.TRUE};
    }

    public static int compare(boolean z8, boolean z9) {
        if (z8 == z9) {
            return 0;
        }
        return z8 ? 1 : -1;
    }

    public static void forEach(Consumer<Boolean> consumer) {
        values().forEach(consumer);
    }

    public static boolean isFalse(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

    public static boolean isNotFalse(Boolean bool) {
        return !isFalse(bool);
    }

    public static boolean isNotTrue(Boolean bool) {
        return !isTrue(bool);
    }

    public static boolean isTrue(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static Boolean negate(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    public static boolean oneHot(boolean... zArr) {
        O.requireNonEmpty(zArr, "array");
        boolean z8 = false;
        for (boolean z9 : zArr) {
            if (z9) {
                if (z8) {
                    return false;
                }
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean or(boolean... zArr) {
        O.requireNonEmpty(zArr, "array");
        for (boolean z8 : zArr) {
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public static boolean[] primitiveValues() {
        return new boolean[]{false, true};
    }

    public static boolean toBoolean(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean toBooleanDefaultIfNull(Boolean bool, boolean z8) {
        return bool == null ? z8 : bool.booleanValue();
    }

    public static Boolean toBooleanObject(int i8) {
        return i8 == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static int toInteger(boolean z8) {
        return z8 ? 1 : 0;
    }

    public static Integer toIntegerObject(boolean z8) {
        return z8 ? U7.a.INTEGER_ONE : U7.a.INTEGER_ZERO;
    }

    public static String toString(boolean z8, String str, String str2) {
        return z8 ? str : str2;
    }

    public static String toStringOnOff(boolean z8) {
        return toString(z8, ON, OFF);
    }

    public static String toStringTrueFalse(boolean z8) {
        return toString(z8, TRUE, FALSE);
    }

    public static String toStringYesNo(boolean z8) {
        return toString(z8, YES, NO);
    }

    public static List<Boolean> values() {
        return f4115a;
    }

    public static boolean xor(boolean... zArr) {
        O.requireNonEmpty(zArr, "array");
        boolean z8 = false;
        for (boolean z9 : zArr) {
            z8 ^= z9;
        }
        return z8;
    }

    public static boolean toBoolean(int i8) {
        return i8 != 0;
    }

    public static Boolean toBooleanObject(int i8, int i9, int i10, int i11) {
        if (i8 == i9) {
            return Boolean.TRUE;
        }
        if (i8 == i10) {
            return Boolean.FALSE;
        }
        if (i8 == i11) {
            return null;
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static int toInteger(boolean z8, int i8, int i9) {
        return z8 ? i8 : i9;
    }

    public static Integer toIntegerObject(boolean z8, Integer num, Integer num2) {
        return z8 ? num : num2;
    }

    public static String toString(Boolean bool, String str, String str2, String str3) {
        return bool == null ? str3 : bool.booleanValue() ? str : str2;
    }

    public static String toStringOnOff(Boolean bool) {
        return toString(bool, ON, OFF, null);
    }

    public static String toStringTrueFalse(Boolean bool) {
        return toString(bool, TRUE, FALSE, null);
    }

    public static String toStringYesNo(Boolean bool) {
        return toString(bool, YES, NO, null);
    }

    public static Boolean and(Boolean... boolArr) {
        O.requireNonEmpty(boolArr, "array");
        return and(C0708l.toPrimitive(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Boolean oneHot(Boolean... boolArr) {
        return Boolean.valueOf(oneHot(C0708l.toPrimitive(boolArr)));
    }

    public static Boolean or(Boolean... boolArr) {
        O.requireNonEmpty(boolArr, "array");
        return or(C0708l.toPrimitive(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean toBoolean(int i8, int i9, int i10) {
        if (i8 == i9) {
            return true;
        }
        if (i8 == i10) {
            return false;
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static int toInteger(Boolean bool, int i8, int i9, int i10) {
        return bool == null ? i10 : bool.booleanValue() ? i8 : i9;
    }

    public static Integer toIntegerObject(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? U7.a.INTEGER_ONE : U7.a.INTEGER_ZERO;
    }

    public static Boolean xor(Boolean... boolArr) {
        O.requireNonEmpty(boolArr, "array");
        return xor(C0708l.toPrimitive(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean toBoolean(Integer num, Integer num2, Integer num3) {
        if (num == null) {
            if (num2 == null) {
                return true;
            }
            if (num3 == null) {
                return false;
            }
        } else {
            if (num.equals(num2)) {
                return true;
            }
            if (num.equals(num3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static Integer toIntegerObject(Boolean bool, Integer num, Integer num2, Integer num3) {
        return bool == null ? num3 : bool.booleanValue() ? num : num2;
    }

    public static Boolean toBooleanObject(Integer num) {
        if (num == null) {
            return null;
        }
        return num.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean toBooleanObject(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            if (num2 == null) {
                return Boolean.TRUE;
            }
            if (num3 == null) {
                return Boolean.FALSE;
            }
            if (num4 == null) {
                return null;
            }
        } else {
            if (num.equals(num2)) {
                return Boolean.TRUE;
            }
            if (num.equals(num3)) {
                return Boolean.FALSE;
            }
            if (num.equals(num4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static boolean toBoolean(String str) {
        return toBooleanObject(str) == Boolean.TRUE;
    }

    public static boolean toBoolean(String str, String str2, String str3) {
        if (str == str2) {
            return true;
        }
        if (str == str3) {
            return false;
        }
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.equals(str3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The String did not match either specified value");
    }

    public static Boolean toBooleanObject(String str) {
        if (str == TRUE) {
            return Boolean.TRUE;
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 1) {
            char cCharAt = str.charAt(0);
            if (cCharAt == 'y' || cCharAt == 'Y' || cCharAt == 't' || cCharAt == 'T' || cCharAt == '1') {
                return Boolean.TRUE;
            }
            if (cCharAt == 'n' || cCharAt == 'N' || cCharAt == 'f' || cCharAt == 'F' || cCharAt == '0') {
                return Boolean.FALSE;
            }
            return null;
        }
        if (length == 2) {
            char cCharAt2 = str.charAt(0);
            char cCharAt3 = str.charAt(1);
            if ((cCharAt2 == 'o' || cCharAt2 == 'O') && (cCharAt3 == 'n' || cCharAt3 == 'N')) {
                return Boolean.TRUE;
            }
            if (cCharAt2 != 'n' && cCharAt2 != 'N') {
                return null;
            }
            if (cCharAt3 == 'o' || cCharAt3 == 'O') {
                return Boolean.FALSE;
            }
            return null;
        }
        if (length == 3) {
            char cCharAt4 = str.charAt(0);
            char cCharAt5 = str.charAt(1);
            char cCharAt6 = str.charAt(2);
            if ((cCharAt4 == 'y' || cCharAt4 == 'Y') && ((cCharAt5 == 'e' || cCharAt5 == 'E') && (cCharAt6 == 's' || cCharAt6 == 'S'))) {
                return Boolean.TRUE;
            }
            if (cCharAt4 != 'o' && cCharAt4 != 'O') {
                return null;
            }
            if (cCharAt5 != 'f' && cCharAt5 != 'F') {
                return null;
            }
            if (cCharAt6 == 'f' || cCharAt6 == 'F') {
                return Boolean.FALSE;
            }
            return null;
        }
        if (length == 4) {
            char cCharAt7 = str.charAt(0);
            char cCharAt8 = str.charAt(1);
            char cCharAt9 = str.charAt(2);
            char cCharAt10 = str.charAt(3);
            if (cCharAt7 != 't' && cCharAt7 != 'T') {
                return null;
            }
            if (cCharAt8 != 'r' && cCharAt8 != 'R') {
                return null;
            }
            if (cCharAt9 != 'u' && cCharAt9 != 'U') {
                return null;
            }
            if (cCharAt10 == 'e' || cCharAt10 == 'E') {
                return Boolean.TRUE;
            }
            return null;
        }
        if (length != 5) {
            return null;
        }
        char cCharAt11 = str.charAt(0);
        char cCharAt12 = str.charAt(1);
        char cCharAt13 = str.charAt(2);
        char cCharAt14 = str.charAt(3);
        char cCharAt15 = str.charAt(4);
        if (cCharAt11 != 'f' && cCharAt11 != 'F') {
            return null;
        }
        if (cCharAt12 != 'a' && cCharAt12 != 'A') {
            return null;
        }
        if (cCharAt13 != 'l' && cCharAt13 != 'L') {
            return null;
        }
        if (cCharAt14 != 's' && cCharAt14 != 'S') {
            return null;
        }
        if (cCharAt15 == 'e' || cCharAt15 == 'E') {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Boolean toBooleanObject(String str, String str2, String str3, String str4) {
        if (str == null) {
            if (str2 == null) {
                return Boolean.TRUE;
            }
            if (str3 == null) {
                return Boolean.FALSE;
            }
            if (str4 == null) {
                return null;
            }
        } else {
            if (str.equals(str2)) {
                return Boolean.TRUE;
            }
            if (str.equals(str3)) {
                return Boolean.FALSE;
            }
            if (str.equals(str4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The String did not match any specified value");
    }
}
