package z4;

/* loaded from: classes.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f37880a = {12593, 12594, 12596, 12599, 12600, 12601, 12609, 12610, 12611, 12613, 12614, 12615, 12616, 12617, 12618, 12619, 12620, 12621, 12622};

    private static char a(char c9) {
        return f37880a[(c9 - 44032) / 588];
    }

    private static boolean b(char c9) {
        return 44032 <= c9 && c9 <= 55203;
    }

    private static boolean c(char c9) {
        for (char c10 : f37880a) {
            if (c10 == c9) {
                return true;
            }
        }
        return false;
    }

    public static boolean matchString(String str, String str2) {
        int length = str.length() - str2.length();
        int length2 = str2.length();
        if (length < 0) {
            return false;
        }
        for (int i8 = 0; i8 <= length; i8++) {
            int i9 = 0;
            while (i9 < length2) {
                if (c(str2.charAt(i9))) {
                    int i10 = i8 + i9;
                    if (b(str.charAt(i10))) {
                        if (a(str.charAt(i10)) != str2.charAt(i9)) {
                            break;
                        }
                        i9++;
                    }
                }
                if (str.charAt(i8 + i9) != Character.toUpperCase(str2.charAt(i9))) {
                    break;
                }
                i9++;
            }
            if (i9 == length2) {
                return true;
            }
        }
        return false;
    }
}
