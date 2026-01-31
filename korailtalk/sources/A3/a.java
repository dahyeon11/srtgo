package A3;

import Q7.C;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f74a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i8, char c9) {
        return i8 < str.length() && str.charAt(i8) == c9;
    }

    private static int b(String str, int i8) {
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < '0' || cCharAt > '9') {
                return i8;
            }
            i8++;
        }
        return str.length();
    }

    private static void c(StringBuilder sb, int i8, int i9) {
        String string = Integer.toString(i8);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    private static int d(String str, int i8, int i9) {
        int i10;
        int i11;
        if (i8 < 0 || i9 > str.length() || i8 > i9) {
            throw new NumberFormatException(str);
        }
        if (i8 < i9) {
            i11 = i8 + 1;
            int iDigit = Character.digit(str.charAt(i8), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i10 = -iDigit;
        } else {
            i10 = 0;
            i11 = i8;
        }
        while (i11 < i9) {
            int i12 = i11 + 1;
            int iDigit2 = Character.digit(str.charAt(i11), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i10 = (i10 * 10) - iDigit2;
            i11 = i12;
        }
        return -i10;
    }

    public static String format(Date date) {
        return format(date, false, f74a);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.a.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static String format(Date date, boolean z8) {
        return format(date, z8, f74a);
    }

    public static String format(Date date, boolean z8, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z8 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        c(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        c(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        c(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        c(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(13), 2);
        if (z8) {
            sb.append(C.PACKAGE_SEPARATOR_CHAR);
            c(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i8 = offset / 60000;
            int iAbs = Math.abs(i8 / 60);
            int iAbs2 = Math.abs(i8 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            c(sb, iAbs, 2);
            sb.append(':');
            c(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
