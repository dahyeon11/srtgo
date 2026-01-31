package e3;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e3.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5354D {
    private static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e8) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e8);
            return SimpleComparison.LESS_THAN_OPERATION + str + " threw " + e8.getClass().getName() + SimpleComparison.GREATER_THAN_OPERATION;
        }
    }

    static boolean b(CharSequence charSequence, int i8) {
        return i8 >= 0 && i8 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i8)) && Character.isLowSurrogate(charSequence.charAt(i8 + 1));
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        w.checkNotNull(charSequence);
        w.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i8 = 0;
        while (i8 < iMin && charSequence.charAt(i8) == charSequence2.charAt(i8)) {
            i8++;
        }
        int i9 = i8 - 1;
        if (b(charSequence, i9) || b(charSequence2, i9)) {
            i8--;
        }
        return charSequence.subSequence(0, i8).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        w.checkNotNull(charSequence);
        w.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i8 = 0;
        while (i8 < iMin && charSequence.charAt((charSequence.length() - i8) - 1) == charSequence2.charAt((charSequence2.length() - i8) - 1)) {
            i8++;
        }
        if (b(charSequence, (charSequence.length() - i8) - 1) || b(charSequence2, (charSequence2.length() - i8) - 1)) {
            i8--;
        }
        return charSequence.subSequence(charSequence.length() - i8, charSequence.length()).toString();
    }

    public static String emptyToNull(String str) {
        return v.b(str);
    }

    public static boolean isNullOrEmpty(String str) {
        return v.h(str);
    }

    public static String lenientFormat(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i8 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i9 = 0; i9 < objArr.length; i9++) {
                objArr[i9] = a(objArr[i9]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i10 = 0;
        while (i8 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i10)) != -1) {
            sb.append((CharSequence) strValueOf, i10, iIndexOf);
            sb.append(objArr[i8]);
            i10 = iIndexOf + 2;
            i8++;
        }
        sb.append((CharSequence) strValueOf, i10, strValueOf.length());
        if (i8 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i8]);
            for (int i11 = i8 + 1; i11 < objArr.length; i11++) {
                sb.append(", ");
                sb.append(objArr[i11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String nullToEmpty(String str) {
        return v.e(str);
    }

    public static String padEnd(String str, int i8, char c9) {
        w.checkNotNull(str);
        if (str.length() >= i8) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i8);
        sb.append(str);
        for (int length = str.length(); length < i8; length++) {
            sb.append(c9);
        }
        return sb.toString();
    }

    public static String padStart(String str, int i8, char c9) {
        w.checkNotNull(str);
        if (str.length() >= i8) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i8);
        for (int length = str.length(); length < i8; length++) {
            sb.append(c9);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String repeat(String str, int i8) {
        w.checkNotNull(str);
        if (i8 <= 1) {
            w.checkArgument(i8 >= 0, "invalid count: %s", i8);
            return i8 == 0 ? "" : str;
        }
        int length = str.length();
        long j8 = length * i8;
        int i9 = (int) j8;
        if (i9 != j8) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j8);
        }
        char[] cArr = new char[i9];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i10 = i9 - length;
            if (length >= i10) {
                System.arraycopy(cArr, 0, cArr, length, i10);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }
}
