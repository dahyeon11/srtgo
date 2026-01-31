package e3;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5358c {
    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = 127;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private static int a(char c9) {
        return (char) ((c9 | ' ') - 97);
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        int iA;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            char cCharAt2 = charSequence2.charAt(i8);
            if (cCharAt != cCharAt2 && ((iA = a(cCharAt)) >= 26 || iA != a(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLowerCase(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }

    public static boolean isUpperCase(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (isUpperCase(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c9 = charArray[i8];
                    if (isUpperCase(c9)) {
                        charArray[i8] = (char) (c9 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (isLowerCase(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c9 = charArray[i8];
                    if (isLowerCase(c9)) {
                        charArray[i8] = (char) (c9 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static String truncate(CharSequence charSequence, int i8, String str) {
        w.checkNotNull(charSequence);
        int length = i8 - str.length();
        w.checkArgument(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i8, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i8) {
            String string = charSequence.toString();
            int length3 = string.length();
            str2 = string;
            if (length3 <= i8) {
                return string;
            }
        }
        StringBuilder sb = new StringBuilder(i8);
        sb.append((CharSequence) str2, 0, length);
        sb.append(str);
        return sb.toString();
    }

    public static String toLowerCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toLowerCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = toLowerCase(charSequence.charAt(i8));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toUpperCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = toUpperCase(charSequence.charAt(i8));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c9) {
        return isUpperCase(c9) ? (char) (c9 ^ ' ') : c9;
    }

    public static char toUpperCase(char c9) {
        return isLowerCase(c9) ? (char) (c9 ^ ' ') : c9;
    }
}
