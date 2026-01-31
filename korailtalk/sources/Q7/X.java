package Q7;

import T7.s0;
import T7.t0;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class X {
    public static final String CR = "\r";
    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    public static final String LF = "\n";
    public static final String SPACE = " ";

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f4103a = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    public static String abbreviate(String str, int i8) {
        return abbreviate(str, "...", 0, i8);
    }

    public static String abbreviateMiddle(String str, String str2, int i8) {
        if (isAnyEmpty(str, str2) || i8 >= str.length() || i8 < str2.length() + 2) {
            return str;
        }
        int length = i8 - str2.length();
        int i9 = length / 2;
        return str.substring(0, (length % 2) + i9) + str2 + str.substring(str.length() - i9);
    }

    public static String appendIfMissing(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return c(str, charSequence, false, charSequenceArr);
    }

    public static String appendIfMissingIgnoreCase(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return c(str, charSequence, true, charSequenceArr);
    }

    private static String c(String str, CharSequence charSequence, boolean z8, CharSequence... charSequenceArr) {
        if (str == null || isEmpty(charSequence) || f(str, charSequence, z8)) {
            return str;
        }
        if (C0708l.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (f(str, charSequence2, z8)) {
                    return str;
                }
            }
        }
        return str + charSequence.toString();
    }

    public static String capitalize(String str) {
        int iCodePointAt;
        int titleCase;
        int length = length(str);
        if (length == 0 || iCodePointAt == (titleCase = Character.toTitleCase((iCodePointAt = str.codePointAt(0))))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = titleCase;
        int iCharCount = Character.charCount(iCodePointAt);
        int i8 = 1;
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            iArr[i8] = iCodePointAt2;
            iCharCount += Character.charCount(iCodePointAt2);
            i8++;
        }
        return new String(iArr, 0, i8);
    }

    public static String center(String str, int i8) {
        return center(str, i8, ' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String chomp(java.lang.String r6) {
        /*
            boolean r0 = isEmpty(r6)
            if (r0 == 0) goto L7
            return r6
        L7:
            int r0 = r6.length()
            r1 = 10
            r2 = 0
            r3 = 1
            r4 = 13
            if (r0 != r3) goto L20
            char r0 = r6.charAt(r2)
            if (r0 == r4) goto L1d
            if (r0 != r1) goto L1c
            goto L1d
        L1c:
            return r6
        L1d:
            java.lang.String r6 = ""
            return r6
        L20:
            int r0 = r6.length()
            int r3 = r0 + (-1)
            char r5 = r6.charAt(r3)
            if (r5 != r1) goto L37
            int r1 = r0 + (-2)
            char r1 = r6.charAt(r1)
            if (r1 != r4) goto L3a
            int r0 = r0 + (-2)
            goto L3b
        L37:
            if (r5 == r4) goto L3a
            goto L3b
        L3a:
            r0 = r3
        L3b:
            java.lang.String r6 = r6.substring(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.X.chomp(java.lang.String):java.lang.String");
    }

    public static String chop(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i8 = length - 1;
        String strSubstring = str.substring(0, i8);
        if (str.charAt(i8) == '\n') {
            int i9 = length - 2;
            if (strSubstring.charAt(i9) == '\r') {
                return strSubstring.substring(0, i9);
            }
        }
        return strSubstring;
    }

    public static int compare(String str, String str2) {
        return compare(str, str2, true);
    }

    public static int compareIgnoreCase(String str, String str2) {
        return compareIgnoreCase(str, str2, true);
    }

    public static boolean contains(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || C0710n.c(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static boolean containsAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !C0708l.isEmpty(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i8 = length - 1;
            int i9 = length2 - 1;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = charSequence.charAt(i10);
                for (int i11 = 0; i11 < length2; i11++) {
                    if (cArr[i11] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i11 == i9) {
                            return true;
                        }
                        if (i10 < i8 && cArr[i11 + 1] == charSequence.charAt(i10 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean containsAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        return d(new t0() { // from class: Q7.W
            @Override // T7.t0
            public final boolean applyAsBoolean(Object obj, Object obj2) {
                return X.containsIgnoreCase((CharSequence) obj, (CharSequence) obj2);
            }
        }, charSequence, charSequenceArr);
    }

    public static boolean containsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            for (int i8 = 0; i8 <= length2; i8++) {
                if (C0710n.f(charSequence, true, i8, charSequence2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNone(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i8 = length - 1;
            int length2 = cArr.length;
            int i9 = length2 - 1;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = charSequence.charAt(i10);
                for (int i11 = 0; i11 < length2; i11++) {
                    if (cArr[i11] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i11 == i9) {
                            return false;
                        }
                        if (i10 < i8 && cArr[i11 + 1] == charSequence.charAt(i10 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsOnly(CharSequence charSequence, char... cArr) {
        if (cArr == null || charSequence == null) {
            return false;
        }
        if (charSequence.length() == 0) {
            return true;
        }
        return cArr.length != 0 && indexOfAnyBut(charSequence, cArr) == -1;
    }

    public static boolean containsWhitespace(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (Character.isWhitespace(charSequence.charAt(i8))) {
                return true;
            }
        }
        return false;
    }

    public static int countMatches(CharSequence charSequence, char c9) {
        if (isEmpty(charSequence)) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (c9 == charSequence.charAt(i9)) {
                i8++;
            }
        }
        return i8;
    }

    private static boolean d(t0 t0Var, CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !C0708l.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (t0Var.applyAsBoolean(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T extends CharSequence> T defaultIfBlank(T t8, T t9) {
        return isBlank(t8) ? t9 : t8;
    }

    public static <T extends CharSequence> T defaultIfEmpty(T t8, T t9) {
        return isEmpty(t8) ? t9 : t8;
    }

    public static String defaultString(String str) {
        return Objects.toString(str, "");
    }

    public static String deleteWhitespace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (!Character.isWhitespace(str.charAt(i9))) {
                cArr[i8] = str.charAt(i9);
                i8++;
            }
        }
        return i8 == length ? str : i8 == 0 ? "" : new String(cArr, 0, i8);
    }

    public static String difference(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int iIndexOfDifference = indexOfDifference(str, str2);
        return iIndexOfDifference == -1 ? "" : str2.substring(iIndexOfDifference);
    }

    private static void e(StringBuilder sb) {
        for (int i8 = 0; i8 < sb.length(); i8++) {
            if (sb.charAt(i8) == 321) {
                sb.setCharAt(i8, 'L');
            } else if (sb.charAt(i8) == 322) {
                sb.setCharAt(i8, 'l');
            }
        }
    }

    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        return f(charSequence, charSequence2, false);
    }

    public static boolean endsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !C0708l.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (endsWith(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean endsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return f(charSequence, charSequence2, true);
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (charSequence.charAt(i8) != charSequence2.charAt(i8)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (C0708l.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (equals(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equalsAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (C0708l.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (equalsIgnoreCase(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return C0710n.f(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    private static boolean f(CharSequence charSequence, CharSequence charSequence2, boolean z8) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return C0710n.f(charSequence, z8, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    @SafeVarargs
    public static <T extends CharSequence> T firstNonBlank(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t8 : tArr) {
            if (isNotBlank(t8)) {
                return t8;
            }
        }
        return null;
    }

    @SafeVarargs
    public static <T extends CharSequence> T firstNonEmpty(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t8 : tArr) {
            if (isNotEmpty(t8)) {
                return t8;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(String[] strArr, String str, int i8) {
        return strip(strArr[i8], str);
    }

    public static byte[] getBytes(String str, Charset charset) {
        return str == null ? C0708l.EMPTY_BYTE_ARRAY : str.getBytes(AbstractC0713q.b(charset));
    }

    public static String getCommonPrefix(String... strArr) {
        if (C0708l.isEmpty(strArr)) {
            return "";
        }
        int iIndexOfDifference = indexOfDifference(strArr);
        if (iIndexOfDifference != -1) {
            return iIndexOfDifference == 0 ? "" : strArr[0].substring(0, iIndexOfDifference);
        }
        String str = strArr[0];
        return str == null ? "" : str;
    }

    public static String getDigits(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static int getFuzzyDistance(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (locale == null) {
            throw new IllegalArgumentException("Locale must not be null");
        }
        String lowerCase = charSequence.toString().toLowerCase(locale);
        String lowerCase2 = charSequence2.toString().toLowerCase(locale);
        int i8 = Integer.MIN_VALUE;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < lowerCase2.length(); i11++) {
            char cCharAt = lowerCase2.charAt(i11);
            boolean z8 = false;
            while (i10 < lowerCase.length() && !z8) {
                if (cCharAt == lowerCase.charAt(i10)) {
                    int i12 = i9 + 1;
                    if (i8 + 1 == i10) {
                        i12 = i9 + 3;
                    }
                    i9 = i12;
                    z8 = true;
                    i8 = i10;
                }
                i10++;
            }
        }
        return i9;
    }

    public static <T extends CharSequence> T getIfBlank(T t8, Supplier<T> supplier) {
        return isBlank(t8) ? (T) s0.get(supplier) : t8;
    }

    public static <T extends CharSequence> T getIfEmpty(T t8, Supplier<T> supplier) {
        return isEmpty(t8) ? (T) s0.get(supplier) : t8;
    }

    @Deprecated
    public static double getJaroWinklerDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        double d9 = h(charSequence, charSequence2)[0];
        if (d9 == 0.0d) {
            return 0.0d;
        }
        double length = (((d9 / charSequence.length()) + (d9 / charSequence2.length())) + ((d9 - r0[1]) / d9)) / 3.0d;
        if (length >= 0.7d) {
            length += Math.min(0.1d, 1.0d / r0[3]) * r0[2] * (1.0d - length);
        }
        return Math.round(length * 100.0d) / 100.0d;
    }

    @Deprecated
    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            length2 = charSequence.length();
            length = length2;
        } else {
            charSequence2 = charSequence;
            charSequence = charSequence2;
        }
        int[] iArr = new int[length + 1];
        for (int i8 = 0; i8 <= length; i8++) {
            iArr[i8] = i8;
        }
        for (int i9 = 1; i9 <= length2; i9++) {
            int i10 = iArr[0];
            char cCharAt = charSequence.charAt(i9 - 1);
            iArr[0] = i9;
            int i11 = 1;
            while (i11 <= length) {
                int i12 = iArr[i11];
                int i13 = i11 - 1;
                iArr[i11] = Math.min(Math.min(iArr[i13] + 1, iArr[i11] + 1), i10 + (charSequence2.charAt(i13) == cCharAt ? 0 : 1));
                i11++;
                i10 = i12;
            }
        }
        return iArr[length];
    }

    private static int[] h(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int iMax = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence3.length(); i9++) {
            char cCharAt = charSequence3.charAt(i9);
            int iMax2 = Math.max(i9 - iMax, 0);
            int iMin = Math.min(i9 + iMax + 1, charSequence4.length());
            while (true) {
                if (iMax2 >= iMin) {
                    break;
                }
                if (!zArr[iMax2] && cCharAt == charSequence4.charAt(iMax2)) {
                    iArr[i9] = iMax2;
                    zArr[iMax2] = true;
                    i8++;
                    break;
                }
                iMax2++;
            }
        }
        char[] cArr = new char[i8];
        char[] cArr2 = new char[i8];
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence3.length(); i11++) {
            if (iArr[i11] != -1) {
                cArr[i10] = charSequence3.charAt(i11);
                i10++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < charSequence4.length(); i13++) {
            if (zArr[i13]) {
                cArr2[i12] = charSequence4.charAt(i13);
                i12++;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i8; i15++) {
            if (cArr[i15] != cArr2[i15]) {
                i14++;
            }
        }
        int i16 = 0;
        for (int i17 = 0; i17 < charSequence3.length() && charSequence.charAt(i17) == charSequence2.charAt(i17); i17++) {
            i16++;
        }
        return new int[]{i8, i14 / 2, i16, charSequence4.length()};
    }

    private static int i(CharSequence charSequence, CharSequence charSequence2, int i8, boolean z8) {
        if (charSequence != null && charSequence2 != null && i8 > 0) {
            int i9 = 0;
            if (charSequence2.length() == 0) {
                if (z8) {
                    return charSequence.length();
                }
                return 0;
            }
            length = z8 ? charSequence.length() : -1;
            do {
                length = z8 ? C0710n.e(charSequence, charSequence2, length - 1) : C0710n.c(charSequence, charSequence2, length + 1);
                if (length < 0) {
                    return length;
                }
                i9++;
            } while (i9 < i8);
        }
        return length;
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return C0710n.c(charSequence, charSequence2, 0);
    }

    public static int indexOfAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !C0708l.isEmpty(cArr)) {
            int length = charSequence.length();
            int i8 = length - 1;
            int length2 = cArr.length;
            int i9 = length2 - 1;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = charSequence.charAt(i10);
                for (int i11 = 0; i11 < length2; i11++) {
                    if (cArr[i11] == cCharAt && (i10 >= i8 || i11 >= i9 || !Character.isHighSurrogate(cCharAt) || cArr[i11 + 1] == charSequence.charAt(i10 + 1))) {
                        return i10;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOfAnyBut(java.lang.CharSequence r11, char... r12) {
        /*
            boolean r0 = isEmpty(r11)
            r1 = -1
            if (r0 != 0) goto L44
            boolean r0 = Q7.C0708l.isEmpty(r12)
            if (r0 == 0) goto Le
            goto L44
        Le:
            int r0 = r11.length()
            int r2 = r0 + (-1)
            int r3 = r12.length
            int r4 = r3 + (-1)
            r5 = 0
            r6 = r5
        L19:
            if (r6 >= r0) goto L44
            char r7 = r11.charAt(r6)
            r8 = r5
        L20:
            if (r8 >= r3) goto L43
            char r9 = r12[r8]
            if (r9 != r7) goto L40
            if (r6 >= r2) goto L3d
            if (r8 >= r4) goto L3d
            boolean r9 = java.lang.Character.isHighSurrogate(r7)
            if (r9 != 0) goto L31
            goto L3d
        L31:
            int r9 = r8 + 1
            char r9 = r12[r9]
            int r10 = r6 + 1
            char r10 = r11.charAt(r10)
            if (r9 != r10) goto L40
        L3d:
            int r6 = r6 + 1
            goto L19
        L40:
            int r8 = r8 + 1
            goto L20
        L43:
            return r6
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.X.indexOfAnyBut(java.lang.CharSequence, char[]):int");
    }

    public static int indexOfDifference(CharSequence... charSequenceArr) {
        if (C0708l.getLength(charSequenceArr) <= 1) {
            return -1;
        }
        int length = charSequenceArr.length;
        int iMin = Integer.MAX_VALUE;
        boolean z8 = true;
        int iMax = 0;
        boolean z9 = false;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence == null) {
                z9 = true;
                iMin = 0;
            } else {
                iMin = Math.min(charSequence.length(), iMin);
                iMax = Math.max(charSequence.length(), iMax);
                z8 = false;
            }
        }
        if (z8 || (iMax == 0 && !z9)) {
            return -1;
        }
        if (iMin == 0) {
            return 0;
        }
        int i8 = -1;
        for (int i9 = 0; i9 < iMin; i9++) {
            char cCharAt = charSequenceArr[0].charAt(i9);
            int i10 = 1;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (charSequenceArr[i10].charAt(i9) != cCharAt) {
                    i8 = i9;
                    break;
                }
                i10++;
            }
            if (i8 != -1) {
                break;
            }
        }
        return (i8 != -1 || iMin == iMax) ? i8 : iMin;
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return indexOfIgnoreCase(charSequence, charSequence2, 0);
    }

    public static boolean isAllBlank(CharSequence... charSequenceArr) {
        if (C0708l.isEmpty(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isNotBlank(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllEmpty(CharSequence... charSequenceArr) {
        if (C0708l.isEmpty(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isNotEmpty(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllLowerCase(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isLowerCase(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUpperCase(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isUpperCase(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlpha(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isLetter(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphaSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt != ' ' && !Character.isLetter(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumeric(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt != ' ' && !Character.isLetterOrDigit(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnyBlank(CharSequence... charSequenceArr) {
        if (C0708l.isEmpty(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isBlank(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnyEmpty(CharSequence... charSequenceArr) {
        if (C0708l.isEmpty(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isEmpty(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAsciiPrintable(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!C0712p.isAsciiPrintable(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(CharSequence charSequence) {
        int length = length(charSequence);
        if (length == 0) {
            return true;
        }
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isWhitespace(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isMixedCase(CharSequence charSequence) {
        if (!isEmpty(charSequence) && charSequence.length() != 1) {
            int length = charSequence.length();
            boolean z8 = false;
            boolean z9 = false;
            for (int i8 = 0; i8 < length; i8++) {
                char cCharAt = charSequence.charAt(i8);
                if (Character.isUpperCase(cCharAt)) {
                    z8 = true;
                } else if (Character.isLowerCase(cCharAt)) {
                    z9 = true;
                }
                if (z8 && z9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNoneBlank(CharSequence... charSequenceArr) {
        return !isAnyBlank(charSequenceArr);
    }

    public static boolean isNoneEmpty(CharSequence... charSequenceArr) {
        return !isAnyEmpty(charSequenceArr);
    }

    public static boolean isNotBlank(CharSequence charSequence) {
        return !isBlank(charSequence);
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static boolean isNumeric(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isDigit(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt != ' ' && !Character.isDigit(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWhitespace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isWhitespace(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    private static String j(String str, CharSequence charSequence, boolean z8, CharSequence... charSequenceArr) {
        if (str == null || isEmpty(charSequence) || q(str, charSequence, z8)) {
            return str;
        }
        if (C0708l.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (q(str, charSequence2, z8)) {
                    return str;
                }
            }
        }
        return charSequence.toString() + str;
    }

    public static String join(boolean[] zArr, char c9) {
        if (zArr == null) {
            return null;
        }
        return join(zArr, c9, 0, zArr.length);
    }

    public static String joinWith(String str, Object... objArr) {
        if (objArr != null) {
            return join(objArr, str);
        }
        throw new IllegalArgumentException("Object varargs must not be null");
    }

    private static String k(String str, String str2, String str3, int i8, boolean z8) {
        if (isEmpty(str) || isEmpty(str2) || str3 == null || i8 == 0) {
            return str;
        }
        if (z8) {
            str2 = str2.toLowerCase();
        }
        int i9 = 0;
        int iIndexOfIgnoreCase = z8 ? indexOfIgnoreCase(str, str2, 0) : indexOf(str, str2, 0);
        if (iIndexOfIgnoreCase == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * (i8 < 0 ? 16 : Math.min(i8, 64))));
        while (iIndexOfIgnoreCase != -1) {
            sb.append((CharSequence) str, i9, iIndexOfIgnoreCase);
            sb.append(str3);
            i9 = iIndexOfIgnoreCase + length;
            i8--;
            if (i8 == 0) {
                break;
            }
            iIndexOfIgnoreCase = z8 ? indexOfIgnoreCase(str, str2, i9) : indexOf(str, str2, i9);
        }
        sb.append((CharSequence) str, i9, str.length());
        return sb.toString();
    }

    private static String l(String str, String[] strArr, String[] strArr2, boolean z8, int i8) {
        String str2;
        int length;
        if (i8 < 0) {
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            hashSet.retainAll(new HashSet(Arrays.asList(strArr2)));
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
            }
        }
        if (isEmpty(str) || C0708l.isEmpty(strArr) || C0708l.isEmpty(strArr2) || (C0708l.isNotEmpty(strArr) && i8 == -1)) {
            return str;
        }
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (length2 != length3) {
            throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
        }
        boolean[] zArr = new boolean[length2];
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < length2; i11++) {
            if (!zArr[i11] && !isEmpty(strArr[i11]) && strArr2[i11] != null) {
                int iIndexOf = str.indexOf(strArr[i11]);
                if (iIndexOf == -1) {
                    zArr[i11] = true;
                } else if (i9 == -1 || iIndexOf < i9) {
                    i10 = i11;
                    i9 = iIndexOf;
                }
            }
        }
        if (i9 == -1) {
            return str;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < strArr.length; i13++) {
            if (strArr[i13] != null && (str2 = strArr2[i13]) != null && (length = str2.length() - strArr[i13].length()) > 0) {
                i12 += length * 3;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + Math.min(i12, str.length() / 5));
        int length4 = 0;
        while (i9 != -1) {
            while (length4 < i9) {
                sb.append(str.charAt(length4));
                length4++;
            }
            sb.append(strArr2[i10]);
            length4 = strArr[i10].length() + i9;
            i9 = -1;
            i10 = -1;
            for (int i14 = 0; i14 < length2; i14++) {
                if (!zArr[i14] && !isEmpty(strArr[i14]) && strArr2[i14] != null) {
                    int iIndexOf2 = str.indexOf(strArr[i14], length4);
                    if (iIndexOf2 == -1) {
                        zArr[i14] = true;
                    } else if (i9 == -1 || iIndexOf2 < i9) {
                        i10 = i14;
                        i9 = iIndexOf2;
                    }
                }
            }
        }
        int length5 = str.length();
        while (length4 < length5) {
            sb.append(str.charAt(length4));
            length4++;
        }
        String string = sb.toString();
        return !z8 ? string : l(string, strArr, strArr2, z8, i8 - 1);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null) {
            return -1;
        }
        return C0710n.e(charSequence, charSequence2, charSequence.length());
    }

    public static int lastIndexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iE;
        int i8 = -1;
        if (charSequence != null && charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (iE = C0710n.e(charSequence, charSequence2, charSequence.length())) > i8) {
                    i8 = iE;
                }
            }
        }
        return i8;
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return lastIndexOfIgnoreCase(charSequence, charSequence2, charSequence.length());
    }

    public static int lastOrdinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i8) {
        return i(charSequence, charSequence2, i8, true);
    }

    public static String left(String str, int i8) {
        if (str == null) {
            return null;
        }
        return i8 < 0 ? "" : str.length() <= i8 ? str : str.substring(0, i8);
    }

    public static String leftPad(String str, int i8) {
        return leftPad(str, i8, ' ');
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    private static String[] m(String str, boolean z8) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return C0708l.EMPTY_STRING_ARRAY;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int type = Character.getType(charArray[0]);
        for (int i9 = 1; i9 < charArray.length; i9++) {
            int type2 = Character.getType(charArray[i9]);
            if (type2 != type) {
                if (z8 && type2 == 2 && type == 1) {
                    int i10 = i9 - 1;
                    if (i10 != i8) {
                        arrayList.add(new String(charArray, i8, i10 - i8));
                        i8 = i10;
                    }
                } else {
                    arrayList.add(new String(charArray, i8, i9 - i8));
                    i8 = i9;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i8, charArray.length - i8));
        return (String[]) arrayList.toArray(C0708l.EMPTY_STRING_ARRAY);
    }

    public static String mid(String str, int i8, int i9) {
        if (str == null) {
            return null;
        }
        if (i9 < 0 || i8 > str.length()) {
            return "";
        }
        if (i8 < 0) {
            i8 = 0;
        }
        int i10 = i9 + i8;
        return str.length() <= i10 ? str.substring(i8) : str.substring(i8, i10);
    }

    private static String[] n(String str, String str2, int i8, boolean z8) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0708l.EMPTY_STRING_ARRAY;
        }
        if (str2 == null || "".equals(str2)) {
            return p(str, null, i8, z8);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int iIndexOf = 0;
        int i9 = 0;
        int i10 = 0;
        while (iIndexOf < length) {
            iIndexOf = str.indexOf(str2, i9);
            if (iIndexOf > -1) {
                if (iIndexOf > i9) {
                    i10++;
                    if (i10 == i8) {
                        arrayList.add(str.substring(i9));
                    } else {
                        arrayList.add(str.substring(i9, iIndexOf));
                    }
                } else if (z8) {
                    i10++;
                    if (i10 == i8) {
                        arrayList.add(str.substring(i9));
                        iIndexOf = length;
                    } else {
                        arrayList.add("");
                    }
                }
                i9 = iIndexOf + length2;
            } else {
                arrayList.add(str.substring(i9));
            }
            iIndexOf = length;
        }
        return (String[]) arrayList.toArray(C0708l.EMPTY_STRING_ARRAY);
    }

    public static String normalizeSpace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        boolean z8 = true;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isWhitespace(cCharAt)) {
                if (i9 == 0 && !z8) {
                    cArr[i8] = SPACE.charAt(0);
                    i8++;
                }
                i9++;
            } else {
                int i11 = i8 + 1;
                if (cCharAt == 160) {
                    cCharAt = ' ';
                }
                cArr[i8] = cCharAt;
                i9 = 0;
                i8 = i11;
                z8 = false;
            }
        }
        if (z8) {
            return "";
        }
        return new String(cArr, 0, i8 - (i9 <= 0 ? 0 : 1)).trim();
    }

    private static String[] o(String str, char c9, boolean z8) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0708l.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i9 = 0;
        while (i8 < length) {
            if (str.charAt(i8) == c9) {
                if (z9 || z8) {
                    arrayList.add(str.substring(i9, i8));
                    z9 = false;
                    z10 = true;
                }
                i9 = i8 + 1;
                i8 = i9;
            } else {
                i8++;
                z10 = false;
                z9 = true;
            }
        }
        if (z9 || (z8 && z10)) {
            arrayList.add(str.substring(i9, i8));
        }
        return (String[]) arrayList.toArray(C0708l.EMPTY_STRING_ARRAY);
    }

    public static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i8) {
        return i(charSequence, charSequence2, i8, false);
    }

    public static String overlay(String str, String str2, int i8, int i9) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i8 < 0) {
            i8 = 0;
        }
        if (i8 > length) {
            i8 = length;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 <= length) {
            length = i9;
        }
        if (i8 > length) {
            int i10 = length;
            length = i8;
            i8 = i10;
        }
        return str.substring(0, i8) + str2 + str.substring(length);
    }

    private static String[] p(String str, String str2, int i8, boolean z8) {
        int i9;
        boolean z9;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0708l.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i11 = 0;
            z11 = false;
            z12 = false;
            i12 = 0;
            int i13 = 1;
            while (i11 < length) {
                if (Character.isWhitespace(str.charAt(i11))) {
                    if (z11 || z8) {
                        int i14 = i13 + 1;
                        if (i13 == i8) {
                            i11 = length;
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        arrayList.add(str.substring(i12, i11));
                        i13 = i14;
                        z11 = false;
                    }
                    i12 = i11 + 1;
                    i11 = i12;
                } else {
                    i11++;
                    z12 = false;
                    z11 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char cCharAt = str2.charAt(0);
                i9 = 0;
                z9 = false;
                z10 = false;
                i10 = 0;
                int i15 = 1;
                while (i9 < length) {
                    if (str.charAt(i9) == cCharAt) {
                        if (z9 || z8) {
                            int i16 = i15 + 1;
                            if (i15 == i8) {
                                i9 = length;
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            arrayList.add(str.substring(i10, i9));
                            i15 = i16;
                            z9 = false;
                        }
                        i10 = i9 + 1;
                        i9 = i10;
                    } else {
                        i9++;
                        z10 = false;
                        z9 = true;
                    }
                }
            } else {
                i9 = 0;
                z9 = false;
                z10 = false;
                i10 = 0;
                int i17 = 1;
                while (i9 < length) {
                    if (str2.indexOf(str.charAt(i9)) >= 0) {
                        if (z9 || z8) {
                            int i18 = i17 + 1;
                            if (i17 == i8) {
                                i9 = length;
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            arrayList.add(str.substring(i10, i9));
                            i17 = i18;
                            z9 = false;
                        }
                        i10 = i9 + 1;
                        i9 = i10;
                    } else {
                        i9++;
                        z10 = false;
                        z9 = true;
                    }
                }
            }
            i11 = i9;
            z11 = z9;
            z12 = z10;
            i12 = i10;
        }
        if (z11 || (z8 && z12)) {
            arrayList.add(str.substring(i12, i11));
        }
        return (String[]) arrayList.toArray(C0708l.EMPTY_STRING_ARRAY);
    }

    public static String prependIfMissing(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return j(str, charSequence, false, charSequenceArr);
    }

    public static String prependIfMissingIgnoreCase(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return j(str, charSequence, true, charSequenceArr);
    }

    private static boolean q(CharSequence charSequence, CharSequence charSequence2, boolean z8) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        int length = charSequence2.length();
        if (length > charSequence.length()) {
            return false;
        }
        return C0710n.f(charSequence, z8, 0, charSequence2, 0, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String r(Object obj) {
        return Objects.toString(obj, "");
    }

    public static String remove(String str, char c9) {
        if (isEmpty(str) || str.indexOf(c9) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i8 = 0;
        for (char c10 : charArray) {
            if (c10 != c9) {
                charArray[i8] = c10;
                i8++;
            }
        }
        return new String(charArray, 0, i8);
    }

    @Deprecated
    public static String removeAll(String str, String str2) {
        return Q.removeAll(str, str2);
    }

    public static String removeEnd(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String removeEndIgnoreCase(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !endsWithIgnoreCase(str, str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    @Deprecated
    public static String removeFirst(String str, String str2) {
        return replaceFirst(str, str2, "");
    }

    public static String removeIgnoreCase(String str, String str2) {
        return replaceIgnoreCase(str, str2, "", -1);
    }

    @Deprecated
    public static String removePattern(String str, String str2) {
        return Q.removePattern(str, str2);
    }

    public static String removeStart(String str, char c9) {
        return (!isEmpty(str) && str.charAt(0) == c9) ? str.substring(1) : str;
    }

    public static String removeStartIgnoreCase(String str, String str2) {
        return (str == null || !startsWithIgnoreCase(str, str2)) ? str : str.substring(length(str2));
    }

    public static String repeat(char c9, int i8) {
        if (i8 <= 0) {
            return "";
        }
        char[] cArr = new char[i8];
        Arrays.fill(cArr, c9);
        return new String(cArr);
    }

    public static String replace(String str, String str2, String str3) {
        return replace(str, str2, str3, -1);
    }

    @Deprecated
    public static String replaceAll(String str, String str2, String str3) {
        return Q.replaceAll(str, str2, str3);
    }

    public static String replaceChars(String str, char c9, char c10) {
        if (str == null) {
            return null;
        }
        return str.replace(c9, c10);
    }

    public static String replaceEach(String str, String[] strArr, String[] strArr2) {
        return l(str, strArr, strArr2, false, 0);
    }

    public static String replaceEachRepeatedly(String str, String[] strArr, String[] strArr2) {
        return l(str, strArr, strArr2, true, C0708l.getLength(strArr));
    }

    @Deprecated
    public static String replaceFirst(String str, String str2, String str3) {
        return Q.replaceFirst(str, str2, str3);
    }

    public static String replaceIgnoreCase(String str, String str2, String str3) {
        return replaceIgnoreCase(str, str2, str3, -1);
    }

    public static String replaceOnce(String str, String str2, String str3) {
        return replace(str, str2, str3, 1);
    }

    public static String replaceOnceIgnoreCase(String str, String str2, String str3) {
        return replaceIgnoreCase(str, str2, str3, 1);
    }

    @Deprecated
    public static String replacePattern(String str, String str2, String str3) {
        return Q.replacePattern(str, str2, str3);
    }

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseDelimited(String str, char c9) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = split(str, c9);
        C0708l.reverse(strArrSplit);
        return join(strArrSplit, c9);
    }

    public static String right(String str, int i8) {
        if (str == null) {
            return null;
        }
        return i8 < 0 ? "" : str.length() <= i8 ? str : str.substring(str.length() - i8);
    }

    public static String rightPad(String str, int i8) {
        return rightPad(str, i8, ' ');
    }

    public static String rotate(String str, int i8) {
        int i9;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (i8 == 0 || length == 0 || (i9 = i8 % length) == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        int i10 = -i9;
        sb.append(substring(str, i10));
        sb.append(substring(str, 0, i10));
        return sb.toString();
    }

    public static String[] split(String str) {
        return split(str, null, -1);
    }

    public static String[] splitByCharacterType(String str) {
        return m(str, false);
    }

    public static String[] splitByCharacterTypeCamelCase(String str) {
        return m(str, true);
    }

    public static String[] splitByWholeSeparator(String str, String str2) {
        return n(str, str2, -1, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2) {
        return n(str, str2, -1, true);
    }

    public static String[] splitPreserveAllTokens(String str) {
        return p(str, null, -1, true);
    }

    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        return q(charSequence, charSequence2, false);
    }

    public static boolean startsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !C0708l.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (startsWith(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean startsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return q(charSequence, charSequence2, true);
    }

    public static String strip(String str) {
        return strip(str, null);
    }

    public static String stripAccents(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(Normalizer.normalize(str, Normalizer.Form.NFD));
        e(sb);
        return f4103a.matcher(sb).replaceAll("");
    }

    public static String[] stripAll(String... strArr) {
        return stripAll(strArr, null);
    }

    public static String stripEnd(String str, String str2) {
        int length = length(str);
        if (length == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else {
            if (str2.isEmpty()) {
                return str;
            }
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }

    public static String stripStart(String str, String str2) {
        int length = length(str);
        if (length == 0) {
            return str;
        }
        int i8 = 0;
        if (str2 == null) {
            while (i8 != length && Character.isWhitespace(str.charAt(i8))) {
                i8++;
            }
        } else {
            if (str2.isEmpty()) {
                return str;
            }
            while (i8 != length && str2.indexOf(str.charAt(i8)) != -1) {
                i8++;
            }
        }
        return str.substring(i8);
    }

    public static String stripToEmpty(String str) {
        return str == null ? "" : strip(str, null);
    }

    public static String stripToNull(String str) {
        if (str == null) {
            return null;
        }
        String strStrip = strip(str, null);
        if (strStrip.isEmpty()) {
            return null;
        }
        return strStrip;
    }

    public static String substring(String str, int i8) {
        if (str == null) {
            return null;
        }
        if (i8 < 0) {
            i8 += str.length();
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return i8 > str.length() ? "" : str.substring(i8);
    }

    public static String substringAfter(String str, int i8) {
        if (isEmpty(str)) {
            return str;
        }
        int iIndexOf = str.indexOf(i8);
        return iIndexOf == -1 ? "" : str.substring(iIndexOf + 1);
    }

    public static String substringAfterLast(String str, int i8) {
        if (isEmpty(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(i8);
        return (iLastIndexOf == -1 || iLastIndexOf == str.length() + (-1)) ? "" : str.substring(iLastIndexOf + 1);
    }

    public static String substringBefore(String str, int i8) {
        int iIndexOf;
        return (isEmpty(str) || (iIndexOf = str.indexOf(i8)) == -1) ? str : str.substring(0, iIndexOf);
    }

    public static String substringBeforeLast(String str, String str2) {
        int iLastIndexOf;
        return (isEmpty(str) || isEmpty(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1) ? str : str.substring(0, iLastIndexOf);
    }

    public static String substringBetween(String str, String str2) {
        return substringBetween(str, str2, str2);
    }

    public static String[] substringsBetween(String str, String str2, String str3) {
        int iIndexOf;
        int i8;
        int iIndexOf2;
        if (str == null || isEmpty(str2) || isEmpty(str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0708l.EMPTY_STRING_ARRAY;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < length - length2 && (iIndexOf = str.indexOf(str2, i9)) >= 0 && (iIndexOf2 = str.indexOf(str3, (i8 = iIndexOf + length3))) >= 0) {
            arrayList.add(str.substring(i8, iIndexOf2));
            i9 = iIndexOf2 + length2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(C0708l.EMPTY_STRING_ARRAY);
    }

    public static String swapCase(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        int iCharCount = 0;
        int i8 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (Character.isUpperCase(iCodePointAt) || Character.isTitleCase(iCodePointAt)) {
                iCodePointAt = Character.toLowerCase(iCodePointAt);
            } else if (Character.isLowerCase(iCodePointAt)) {
                iCodePointAt = Character.toUpperCase(iCodePointAt);
            }
            iArr[i8] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i8++;
        }
        return new String(iArr, 0, i8);
    }

    public static int[] toCodePoints(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return C0708l.EMPTY_INT_ARRAY;
        }
        String string = charSequence.toString();
        int iCodePointCount = string.codePointCount(0, string.length());
        int[] iArr = new int[iCodePointCount];
        int iCharCount = 0;
        for (int i8 = 0; i8 < iCodePointCount; i8++) {
            int iCodePointAt = string.codePointAt(iCharCount);
            iArr[i8] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return iArr;
    }

    public static String toEncodedString(byte[] bArr, Charset charset) {
        return new String(bArr, AbstractC0713q.b(charset));
    }

    public static String toRootLowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static String toRootUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.ROOT);
    }

    @Deprecated
    public static String toString(byte[] bArr, String str) {
        return new String(bArr, AbstractC0713q.a(str));
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String trimToEmpty(String str) {
        return str == null ? "" : str.trim();
    }

    public static String trimToNull(String str) {
        String strTrim = trim(str);
        if (isEmpty(strTrim)) {
            return null;
        }
        return strTrim;
    }

    public static String truncate(String str, int i8) {
        return truncate(str, 0, i8);
    }

    public static String uncapitalize(String str) {
        int iCodePointAt;
        int lowerCase;
        int length = length(str);
        if (length == 0 || iCodePointAt == (lowerCase = Character.toLowerCase((iCodePointAt = str.codePointAt(0))))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = lowerCase;
        int iCharCount = Character.charCount(iCodePointAt);
        int i8 = 1;
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            iArr[i8] = iCodePointAt2;
            iCharCount += Character.charCount(iCodePointAt2);
            i8++;
        }
        return new String(iArr, 0, i8);
    }

    public static String unwrap(String str, char c9) {
        return (isEmpty(str) || c9 == 0 || str.length() == 1 || str.charAt(0) != c9 || str.charAt(str.length() - 1) != c9) ? str : str.substring(1, str.length() - 1);
    }

    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static String valueOf(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return String.valueOf(cArr);
    }

    public static String wrap(String str, char c9) {
        if (isEmpty(str) || c9 == 0) {
            return str;
        }
        return c9 + str + c9;
    }

    public static String wrapIfMissing(String str, char c9) {
        if (isEmpty(str) || c9 == 0) {
            return str;
        }
        boolean z8 = str.charAt(0) != c9;
        boolean z9 = str.charAt(str.length() - 1) != c9;
        if (!z8 && !z9) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        if (z8) {
            sb.append(c9);
        }
        sb.append(str);
        if (z9) {
            sb.append(c9);
        }
        return sb.toString();
    }

    public static String abbreviate(String str, int i8, int i9) {
        return abbreviate(str, "...", i8, i9);
    }

    public static String center(String str, int i8, char c9) {
        int length;
        int length2;
        return (str == null || i8 <= 0 || (length2 = i8 - (length = str.length())) <= 0) ? str : rightPad(leftPad(str, length + (length2 / 2), c9), i8, c9);
    }

    public static int compare(String str, String str2, boolean z8) {
        if (str == str2) {
            return 0;
        }
        return str == null ? z8 ? -1 : 1 : str2 == null ? z8 ? 1 : -1 : str.compareTo(str2);
    }

    public static int compareIgnoreCase(String str, String str2, boolean z8) {
        if (str == str2) {
            return 0;
        }
        return str == null ? z8 ? -1 : 1 : str2 == null ? z8 ? 1 : -1 : str.compareToIgnoreCase(str2);
    }

    public static boolean contains(CharSequence charSequence, int i8) {
        return !isEmpty(charSequence) && C0710n.b(charSequence, i8, 0) >= 0;
    }

    @Deprecated
    public static String defaultString(String str, String str2) {
        return Objects.toString(str, str2);
    }

    public static byte[] getBytes(String str, String str2) {
        return str == null ? C0708l.EMPTY_BYTE_ARRAY : str.getBytes(AbstractC0713q.c(str2));
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i8) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return C0710n.c(charSequence, charSequence2, i8);
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i8) {
        if (charSequence != null && charSequence2 != null) {
            if (i8 < 0) {
                i8 = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i8 > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i8;
            }
            while (i8 < length) {
                if (C0710n.f(charSequence, true, i8, charSequence2, 0, charSequence2.length())) {
                    return i8;
                }
                i8++;
            }
        }
        return -1;
    }

    public static String join(boolean[] zArr, char c9, int i8, int i9) {
        if (zArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(((zArr.length * 5) + zArr.length) - 1);
        while (i8 < i9) {
            sb.append(zArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i8) {
        return C0710n.e(charSequence, charSequence2, i8);
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i8) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            if (i8 > length2) {
                i8 = length2;
            }
            if (i8 < 0) {
                return -1;
            }
            if (length == 0) {
                return i8;
            }
            while (i8 >= 0) {
                if (C0710n.f(charSequence, true, i8, charSequence2, 0, length)) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static String leftPad(String str, int i8, char c9) {
        if (str == null) {
            return null;
        }
        int length = i8 - str.length();
        return length <= 0 ? str : length > 8192 ? leftPad(str, i8, String.valueOf(c9)) : repeat(c9, length).concat(str);
    }

    public static String lowerCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(H.toLocale(locale));
    }

    public static String replace(String str, String str2, String str3, int i8) {
        return k(str, str2, str3, i8, false);
    }

    public static String replaceChars(String str, String str2, String str3) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length2);
        boolean z8 = false;
        for (int i8 = 0; i8 < length2; i8++) {
            char cCharAt = str.charAt(i8);
            int iIndexOf = str2.indexOf(cCharAt);
            if (iIndexOf >= 0) {
                if (iIndexOf < length) {
                    sb.append(str3.charAt(iIndexOf));
                }
                z8 = true;
            } else {
                sb.append(cCharAt);
            }
        }
        return z8 ? sb.toString() : str;
    }

    public static String replaceIgnoreCase(String str, String str2, String str3, int i8) {
        return k(str, str2, str3, i8, true);
    }

    public static String rightPad(String str, int i8, char c9) {
        if (str == null) {
            return null;
        }
        int length = i8 - str.length();
        return length <= 0 ? str : length > 8192 ? rightPad(str, i8, String.valueOf(c9)) : str.concat(repeat(c9, length));
    }

    public static String[] split(String str, char c9) {
        return o(str, c9, false);
    }

    public static String[] splitByWholeSeparator(String str, String str2, int i8) {
        return n(str, str2, i8, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2, int i8) {
        return n(str, str2, i8, true);
    }

    public static String[] splitPreserveAllTokens(String str, char c9) {
        return o(str, c9, true);
    }

    public static String strip(String str, String str2) {
        return stripEnd(stripStart(str, str2), str2);
    }

    public static String[] stripAll(final String[] strArr, final String str) {
        int length = C0708l.getLength(strArr);
        if (length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        Arrays.setAll(strArr2, new IntFunction() { // from class: Q7.T
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return X.g(strArr, str, i8);
            }
        });
        return strArr2;
    }

    public static String substringBetween(String str, String str2, String str3) {
        int iIndexOf;
        int iIndexOf2;
        if (!O.allNotNull(str, str2, str3) || (iIndexOf = str.indexOf(str2)) == -1 || (iIndexOf2 = str.indexOf(str3, str2.length() + iIndexOf)) == -1) {
            return null;
        }
        return str.substring(iIndexOf + str2.length(), iIndexOf2);
    }

    public static String truncate(String str, int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("maxWith cannot be negative");
        }
        if (str == null) {
            return null;
        }
        return i8 > str.length() ? "" : str.length() > i9 ? str.substring(i8, Math.min(i9 + i8, str.length())) : str.substring(i8);
    }

    public static String upperCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(H.toLocale(locale));
    }

    public static String abbreviate(String str, String str2, int i8) {
        return abbreviate(str, str2, 0, i8);
    }

    public static int indexOf(CharSequence charSequence, int i8) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return C0710n.b(charSequence, i8, 0);
    }

    public static int lastIndexOf(CharSequence charSequence, int i8) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return C0710n.d(charSequence, i8, charSequence.length());
    }

    public static String removeStart(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String[] split(String str, String str2) {
        return p(str, str2, -1, false);
    }

    public static String[] splitPreserveAllTokens(String str, String str2) {
        return p(str, str2, -1, true);
    }

    public static String wrap(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : str2.concat(str).concat(str2);
    }

    public static String abbreviate(String str, String str2, int i8, int i9) {
        if (isNotEmpty(str) && "".equals(str2) && i9 > 0) {
            return substring(str, 0, i9);
        }
        if (isAnyEmpty(str, str2)) {
            return str;
        }
        int length = str2.length();
        int i10 = length + 1;
        int i11 = length + length + 1;
        if (i9 >= i10) {
            int length2 = str.length();
            if (length2 <= i9) {
                return str;
            }
            if (i8 > length2) {
                i8 = length2;
            }
            int i12 = i9 - length;
            if (length2 - i8 < i12) {
                i8 = length2 - i12;
            }
            if (i8 <= i10) {
                return str.substring(0, i12) + str2;
            }
            if (i9 < i11) {
                throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", Integer.valueOf(i11)));
            }
            if ((i9 + i8) - length < length2) {
                return str2 + abbreviate(str.substring(i8), str2, i12);
            }
            return str2 + str.substring(length2 - i12);
        }
        throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", Integer.valueOf(i10)));
    }

    public static boolean containsOnly(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return containsOnly(charSequence, str.toCharArray());
    }

    public static int countMatches(CharSequence charSequence, CharSequence charSequence2) {
        int length = 0;
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return 0;
        }
        int i8 = 0;
        while (true) {
            int iC = C0710n.c(charSequence, charSequence2, length);
            if (iC == -1) {
                return i8;
            }
            i8++;
            length = iC + charSequence2.length();
        }
    }

    public static String[] split(String str, String str2, int i8) {
        return p(str, str2, i8, false);
    }

    public static String[] splitPreserveAllTokens(String str, String str2, int i8) {
        return p(str, str2, i8, true);
    }

    public static String substringBefore(String str, String str2) {
        if (isEmpty(str) || str2 == null) {
            return str;
        }
        if (str2.isEmpty()) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    public static String center(String str, int i8, String str2) {
        if (str == null || i8 <= 0) {
            return str;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str.length();
        int i9 = i8 - length;
        return i9 <= 0 ? str : rightPad(leftPad(str, length + (i9 / 2), str2), i8, str2);
    }

    public static int indexOf(CharSequence charSequence, int i8, int i9) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return C0710n.b(charSequence, i8, i9);
    }

    public static int lastIndexOf(CharSequence charSequence, int i8, int i9) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return C0710n.d(charSequence, i8, i9);
    }

    public static String leftPad(String str, int i8, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str2.length();
        int length2 = i8 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return leftPad(str, i8, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i9 = 0; i9 < length2; i9++) {
            cArr[i9] = charArray[i9 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String repeat(String str, int i8) {
        if (str == null) {
            return null;
        }
        if (i8 <= 0) {
            return "";
        }
        int length = str.length();
        if (i8 == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i8 <= 8192) {
            return repeat(str.charAt(0), i8);
        }
        int i9 = length * i8;
        if (length == 1) {
            return repeat(str.charAt(0), i8);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i9);
            for (int i10 = 0; i10 < i8; i10++) {
                sb.append(str);
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        char[] cArr = new char[i9];
        for (int i11 = (i8 * 2) - 2; i11 >= 0; i11 -= 2) {
            cArr[i11] = cCharAt;
            cArr[i11 + 1] = cCharAt2;
        }
        return new String(cArr);
    }

    public static String rightPad(String str, int i8, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str2.length();
        int length2 = i8 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return rightPad(str, i8, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i9 = 0; i9 < length2; i9++) {
            cArr[i9] = charArray[i9 % length];
        }
        return str.concat(new String(cArr));
    }

    public static String substring(String str, int i8, int i9) {
        if (str == null) {
            return null;
        }
        if (i9 < 0) {
            i9 += str.length();
        }
        if (i8 < 0) {
            i8 += str.length();
        }
        if (i9 > str.length()) {
            i9 = str.length();
        }
        if (i8 > i9) {
            return "";
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        return str.substring(i8, i9);
    }

    public static String substringAfter(String str, String str2) {
        int iIndexOf;
        if (isEmpty(str)) {
            return str;
        }
        if (str2 == null || (iIndexOf = str.indexOf(str2)) == -1) {
            return "";
        }
        return str.substring(iIndexOf + str2.length());
    }

    public static String unwrap(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || str.length() < str2.length() * 2 || !startsWith(str, str2) || !endsWith(str, str2)) ? str : str.substring(str2.length(), str.lastIndexOf(str2));
    }

    public static String substringAfterLast(String str, String str2) {
        int iLastIndexOf;
        return isEmpty(str) ? str : (isEmpty(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1 || iLastIndexOf == str.length() - str2.length()) ? "" : str.substring(iLastIndexOf + str2.length());
    }

    public static boolean containsNone(CharSequence charSequence, String str) {
        if (str == null) {
            return true;
        }
        return containsNone(charSequence, str.toCharArray());
    }

    public static String remove(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : replace(str, str2, "", -1);
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return containsAny(charSequence, C0710n.toCharArray(charSequence2));
    }

    public static int indexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iC;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i8 = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (iC = C0710n.c(charSequence, charSequence2, 0)) != -1 && iC < i8) {
                i8 = iC;
            }
        }
        if (i8 == Integer.MAX_VALUE) {
            return -1;
        }
        return i8;
    }

    public static int indexOfAnyBut(CharSequence charSequence, CharSequence charSequence2) {
        if (!isEmpty(charSequence) && !isEmpty(charSequence2)) {
            int length = charSequence.length();
            int i8 = 0;
            while (i8 < length) {
                char cCharAt = charSequence.charAt(i8);
                boolean z8 = C0710n.b(charSequence2, cCharAt, 0) >= 0;
                int i9 = i8 + 1;
                if (i9 < length && Character.isHighSurrogate(cCharAt)) {
                    char cCharAt2 = charSequence.charAt(i9);
                    if (z8 && C0710n.b(charSequence2, cCharAt2, 0) < 0) {
                        return i8;
                    }
                } else if (!z8) {
                    return i8;
                }
                i8 = i9;
            }
        }
        return -1;
    }

    public static int indexOfDifference(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i8 = 0;
        if (charSequence != null && charSequence2 != null) {
            while (i8 < charSequence.length() && i8 < charSequence2.length() && charSequence.charAt(i8) == charSequence2.charAt(i8)) {
                i8++;
            }
            if (i8 >= charSequence2.length() && i8 >= charSequence.length()) {
                return -1;
            }
        }
        return i8;
    }

    public static String join(byte[] bArr, char c9) {
        if (bArr == null) {
            return null;
        }
        return join(bArr, c9, 0, bArr.length);
    }

    @Deprecated
    public static String chomp(String str, String str2) {
        return removeEnd(str, str2);
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        return d(new t0() { // from class: Q7.V
            @Override // T7.t0
            public final boolean applyAsBoolean(Object obj, Object obj2) {
                return X.contains((CharSequence) obj, (CharSequence) obj2);
            }
        }, charSequence, charSequenceArr);
    }

    public static String join(byte[] bArr, char c9, int i8, int i9) {
        if (bArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i8 < i9) {
            sb.append((int) bArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String wrapIfMissing(String str, String str2) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        boolean zStartsWith = str.startsWith(str2);
        boolean zEndsWith = str.endsWith(str2);
        if (zStartsWith && zEndsWith) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + str2.length());
        if (!zStartsWith) {
            sb.append(str2);
        }
        sb.append(str);
        if (!zEndsWith) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public static int indexOfAny(CharSequence charSequence, String str) {
        if (isEmpty(charSequence) || isEmpty(str)) {
            return -1;
        }
        return indexOfAny(charSequence, str.toCharArray());
    }

    @Deprecated
    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2, int i8) {
        int i9;
        int length;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (i8 >= 0) {
            int length2 = charSequence.length();
            int length3 = charSequence2.length();
            if (length2 == 0) {
                if (length3 <= i8) {
                    return length3;
                }
                return -1;
            }
            if (length3 == 0) {
                if (length2 <= i8) {
                    return length2;
                }
                return -1;
            }
            if (Math.abs(length2 - length3) > i8) {
                return -1;
            }
            if (length2 > length3) {
                length = charSequence.length();
                i9 = length3;
                charSequence4 = charSequence;
                charSequence3 = charSequence2;
            } else {
                i9 = length2;
                length = length3;
                charSequence3 = charSequence;
                charSequence4 = charSequence2;
            }
            int i10 = i9 + 1;
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int iMin = Math.min(i9, i8) + 1;
            char c9 = 0;
            for (int i11 = 0; i11 < iMin; i11++) {
                iArr[i11] = i11;
            }
            int i12 = Integer.MAX_VALUE;
            Arrays.fill(iArr, iMin, i10, Integer.MAX_VALUE);
            Arrays.fill(iArr2, Integer.MAX_VALUE);
            int i13 = 1;
            while (i13 <= length) {
                char cCharAt = charSequence4.charAt(i13 - 1);
                iArr2[c9] = i13;
                int iMax = Math.max(1, i13 - i8);
                int iMin2 = i13 > i12 - i8 ? i9 : Math.min(i9, i13 + i8);
                if (iMax > iMin2) {
                    return -1;
                }
                if (iMax > 1) {
                    iArr2[iMax - 1] = i12;
                }
                while (iMax <= iMin2) {
                    int i14 = iMax - 1;
                    if (charSequence3.charAt(i14) == cCharAt) {
                        iArr2[iMax] = iArr[i14];
                    } else {
                        iArr2[iMax] = Math.min(Math.min(iArr2[i14], iArr[iMax]), iArr[i14]) + 1;
                    }
                    iMax++;
                }
                i13++;
                c9 = 0;
                i12 = Integer.MAX_VALUE;
                int[] iArr3 = iArr2;
                iArr2 = iArr;
                iArr = iArr3;
            }
            int i15 = iArr[i9];
            if (i15 <= i8) {
                return i15;
            }
            return -1;
        }
        throw new IllegalArgumentException("Threshold must not be negative");
    }

    public static String join(char[] cArr, char c9) {
        if (cArr == null) {
            return null;
        }
        return join(cArr, c9, 0, cArr.length);
    }

    public static String join(char[] cArr, char c9, int i8, int i9) {
        if (cArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((cArr.length * 2) - 1);
        while (i8 < i9) {
            sb.append(cArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String repeat(String str, String str2, int i8) {
        if (str != null && str2 != null) {
            return removeEnd(repeat(str + str2, i8), str2);
        }
        return repeat(str, i8);
    }

    public static String join(double[] dArr, char c9) {
        if (dArr == null) {
            return null;
        }
        return join(dArr, c9, 0, dArr.length);
    }

    public static String join(double[] dArr, char c9, int i8, int i9) {
        if (dArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i8 < i9) {
            sb.append(dArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String join(float[] fArr, char c9) {
        if (fArr == null) {
            return null;
        }
        return join(fArr, c9, 0, fArr.length);
    }

    public static String join(float[] fArr, char c9, int i8, int i9) {
        if (fArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i8 < i9) {
            sb.append(fArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String join(int[] iArr, char c9) {
        if (iArr == null) {
            return null;
        }
        return join(iArr, c9, 0, iArr.length);
    }

    public static String join(int[] iArr, char c9, int i8, int i9) {
        if (iArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i8 < i9) {
            sb.append(iArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String join(Iterable<?> iterable, char c9) {
        if (iterable != null) {
            return join(iterable.iterator(), c9);
        }
        return null;
    }

    public static String join(Iterable<?> iterable, String str) {
        if (iterable != null) {
            return join(iterable.iterator(), str);
        }
        return null;
    }

    public static String join(Iterator<?> it, char c9) {
        if (it == null) {
            return null;
        }
        return !it.hasNext() ? "" : (String) W7.o.of(it).collect(W7.i.joining(r(String.valueOf(c9)), "", "", new U()));
    }

    public static String join(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        return !it.hasNext() ? "" : (String) W7.o.of(it).collect(W7.i.joining(r(str), "", "", new U()));
    }

    public static String join(List<?> list, char c9, int i8, int i9) {
        if (list == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        return join(list.subList(i8, i9).iterator(), c9);
    }

    public static String join(List<?> list, String str, int i8, int i9) {
        if (list == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        return join(list.subList(i8, i9).iterator(), str);
    }

    public static String join(long[] jArr, char c9) {
        if (jArr == null) {
            return null;
        }
        return join(jArr, c9, 0, jArr.length);
    }

    public static String join(long[] jArr, char c9, int i8, int i9) {
        if (jArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i8 < i9) {
            sb.append(jArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String join(Object[] objArr, char c9) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, c9, 0, objArr.length);
    }

    public static String join(Object[] objArr, char c9, int i8, int i9) {
        return join(objArr, String.valueOf(c9), i8, i9);
    }

    public static String join(Object[] objArr, String str) {
        if (objArr != null) {
            return join(objArr, r(str), 0, objArr.length);
        }
        return null;
    }

    public static String join(Object[] objArr, String str, int i8, int i9) {
        if (objArr != null) {
            return (String) W7.o.of(objArr).skip(i8).limit(Math.max(0, i9 - i8)).collect(W7.i.joining(str, "", "", new U()));
        }
        return null;
    }

    public static String join(short[] sArr, char c9) {
        if (sArr == null) {
            return null;
        }
        return join(sArr, c9, 0, sArr.length);
    }

    public static String join(short[] sArr, char c9, int i8, int i9) {
        if (sArr == null) {
            return null;
        }
        if (i9 - i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i8 < i9) {
            sb.append((int) sArr[i8]);
            sb.append(c9);
            i8++;
        }
        return sb.substring(0, sb.length() - 1);
    }

    @SafeVarargs
    public static <T> String join(T... tArr) {
        return join(tArr, (String) null);
    }
}
