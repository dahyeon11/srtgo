package Q7;

import java.util.Objects;
import java.util.function.IntFunction;

/* renamed from: Q7.p */
/* loaded from: classes3.dex */
public class C0712p {
    public static final char CR = '\r';
    public static final char LF = '\n';
    public static final char NUL = 0;

    /* renamed from: a */
    private static final String[] f4116a;

    /* renamed from: b */
    private static final char[] f4117b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        String[] strArr = new String[128];
        f4116a = strArr;
        C0708l.setAll(strArr, new IntFunction() { // from class: Q7.o
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0712p.b(i8);
            }
        });
    }

    public static /* synthetic */ String b(int i8) {
        return String.valueOf((char) i8);
    }

    public static int compare(char c9, char c10) {
        return c9 - c10;
    }

    public static boolean isAscii(char c9) {
        return c9 < 128;
    }

    public static boolean isAsciiAlpha(char c9) {
        return isAsciiAlphaUpper(c9) || isAsciiAlphaLower(c9);
    }

    public static boolean isAsciiAlphaLower(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }

    public static boolean isAsciiAlphaUpper(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static boolean isAsciiAlphanumeric(char c9) {
        return isAsciiAlpha(c9) || isAsciiNumeric(c9);
    }

    public static boolean isAsciiControl(char c9) {
        return c9 < ' ' || c9 == 127;
    }

    public static boolean isAsciiNumeric(char c9) {
        return c9 >= '0' && c9 <= '9';
    }

    public static boolean isAsciiPrintable(char c9) {
        return c9 >= ' ' && c9 < 127;
    }

    public static char toChar(Character ch) {
        Objects.requireNonNull(ch, "ch");
        return ch.charValue();
    }

    @Deprecated
    public static Character toCharacterObject(char c9) {
        return Character.valueOf(c9);
    }

    public static int toIntValue(char c9) {
        if (isAsciiNumeric(c9)) {
            return c9 - '0';
        }
        throw new IllegalArgumentException("The character " + c9 + " is not in the range '0' - '9'");
    }

    public static String toString(char c9) {
        String[] strArr = f4116a;
        return c9 < strArr.length ? strArr[c9] : String.valueOf(c9);
    }

    public static String unicodeEscaped(char c9) {
        StringBuilder sb = new StringBuilder();
        sb.append("\\u");
        char[] cArr = f4117b;
        sb.append(cArr[(c9 >> '\f') & 15]);
        sb.append(cArr[(c9 >> '\b') & 15]);
        sb.append(cArr[(c9 >> 4) & 15]);
        sb.append(cArr[c9 & 15]);
        return sb.toString();
    }

    public static char toChar(Character ch, char c9) {
        return ch != null ? ch.charValue() : c9;
    }

    public static Character toCharacterObject(String str) {
        if (X.isEmpty(str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static String unicodeEscaped(Character ch) {
        if (ch != null) {
            return unicodeEscaped(ch.charValue());
        }
        return null;
    }

    public static char toChar(String str) {
        Z.notEmpty(str, "The String must not be empty", new Object[0]);
        return str.charAt(0);
    }

    public static int toIntValue(char c9, int i8) {
        return isAsciiNumeric(c9) ? c9 - '0' : i8;
    }

    public static int toIntValue(Character ch) {
        return toIntValue(toChar(ch));
    }

    public static String toString(Character ch) {
        if (ch != null) {
            return toString(ch.charValue());
        }
        return null;
    }

    public static char toChar(String str, char c9) {
        return X.isEmpty(str) ? c9 : str.charAt(0);
    }

    public static int toIntValue(Character ch, int i8) {
        return ch != null ? toIntValue(ch.charValue(), i8) : i8;
    }
}
