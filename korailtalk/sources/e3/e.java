package E3;

import com.google.protobuf.B;
import com.google.protobuf.w1;
import f1.j;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import m7.AbstractC5916c;

/* loaded from: classes2.dex */
public abstract class e {
    public static final w1 MIN_VALUE = w1.newBuilder().setSeconds(-62135596800L).setNanos(0).build();
    public static final w1 MAX_VALUE = w1.newBuilder().setSeconds(253402300799L).setNanos(999999999).build();
    public static final w1 EPOCH = w1.newBuilder().setSeconds(0).setNanos(0).build();

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1020a = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return e.b();
        }
    }

    private enum b implements Comparator, Serializable {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(w1 w1Var, w1 w1Var2) {
            e.checkValid(w1Var);
            e.checkValid(w1Var2);
            int iCompare = Long.compare(w1Var.getSeconds(), w1Var2.getSeconds());
            return iCompare != 0 ? iCompare : Integer.compare(w1Var.getNanos(), w1Var2.getNanos());
        }
    }

    public static w1 add(w1 w1Var, B b9) {
        checkValid(w1Var);
        E3.a.checkValid(b9);
        return d(i3.c.checkedAdd(w1Var.getSeconds(), b9.getSeconds()), i3.b.checkedAdd(w1Var.getNanos(), b9.getNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SimpleDateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    public static B between(w1 w1Var, w1 w1Var2) {
        checkValid(w1Var);
        checkValid(w1Var2);
        return E3.a.a(i3.c.checkedSubtract(w1Var2.getSeconds(), w1Var.getSeconds()), i3.b.checkedSubtract(w1Var2.getNanos(), w1Var.getNanos()));
    }

    static String c(int i8) {
        return i8 % AbstractC5916c.NANOS_IN_MILLIS == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i8 / AbstractC5916c.NANOS_IN_MILLIS)) : i8 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i8 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i8));
    }

    public static w1 checkValid(w1 w1Var) {
        long seconds = w1Var.getSeconds();
        int nanos = w1Var.getNanos();
        if (isValid(seconds, nanos)) {
            return w1Var;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    public static Comparator<w1> comparator() {
        return b.INSTANCE;
    }

    public static int compare(w1 w1Var, w1 w1Var2) {
        return b.INSTANCE.compare(w1Var, w1Var2);
    }

    static w1 d(long j8, int i8) {
        if (i8 <= -1000000000 || i8 >= 1000000000) {
            j8 = i3.c.checkedAdd(j8, i8 / j.SECOND_IN_NANOS);
            i8 %= j.SECOND_IN_NANOS;
        }
        if (i8 < 0) {
            i8 += j.SECOND_IN_NANOS;
            j8 = i3.c.checkedSubtract(j8, 1L);
        }
        return checkValid(w1.newBuilder().setSeconds(j8).setNanos(i8).build());
    }

    static int e(String str) throws ParseException {
        int iCharAt = 0;
        for (int i8 = 0; i8 < 9; i8++) {
            iCharAt *= 10;
            if (i8 < str.length()) {
                if (str.charAt(i8) < '0' || str.charAt(i8) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                iCharAt += str.charAt(i8) - '0';
            }
        }
        return iCharAt;
    }

    private static long f(String str) throws ParseException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf != -1) {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        }
        throw new ParseException("Invalid offset value: " + str, 0);
    }

    public static w1 fromDate(Date date) {
        if (!(date instanceof Timestamp)) {
            return fromMillis(date.getTime());
        }
        Timestamp timestamp = (Timestamp) date;
        long time = timestamp.getTime();
        return w1.newBuilder().setSeconds((time >= 0 || time % 1000 == 0) ? time / 1000 : (time / 1000) - 1).setNanos(timestamp.getNanos()).build();
    }

    public static w1 fromMicros(long j8) {
        return d(j8 / 1000000, (int) ((j8 % 1000000) * 1000));
    }

    public static w1 fromMillis(long j8) {
        return d(j8 / 1000, (int) ((j8 % 1000) * 1000000));
    }

    public static w1 fromNanos(long j8) {
        return d(j8 / 1000000000, (int) (j8 % 1000000000));
    }

    public static w1 fromSeconds(long j8) {
        return d(j8, 0);
    }

    public static boolean isValid(w1 w1Var) {
        return isValid(w1Var.getSeconds(), w1Var.getNanos());
    }

    public static w1 parse(String str) throws ParseException {
        String strSubstring;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = "";
        }
        long time = ((SimpleDateFormat) f1020a.get()).parse(strSubstring2).getTime() / 1000;
        int iE = strSubstring.isEmpty() ? 0 : e(strSubstring);
        if (str.charAt(iIndexOf2) != 'Z') {
            long jF = f(str.substring(iIndexOf2 + 1));
            time = str.charAt(iIndexOf2) == '+' ? time - jF : time + jF;
        } else if (str.length() != iIndexOf2 + 1) {
            throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(iIndexOf2) + "\"", 0);
        }
        try {
            return d(time, iE);
        } catch (IllegalArgumentException e8) {
            ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
            parseException.initCause(e8);
            throw parseException;
        }
    }

    public static w1 parseUnchecked(String str) {
        try {
            return parse(str);
        } catch (ParseException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static w1 subtract(w1 w1Var, B b9) {
        checkValid(w1Var);
        E3.a.checkValid(b9);
        return d(i3.c.checkedSubtract(w1Var.getSeconds(), b9.getSeconds()), i3.b.checkedSubtract(w1Var.getNanos(), b9.getNanos()));
    }

    public static long toMicros(w1 w1Var) {
        checkValid(w1Var);
        return i3.c.checkedAdd(i3.c.checkedMultiply(w1Var.getSeconds(), 1000000L), w1Var.getNanos() / 1000);
    }

    public static long toMillis(w1 w1Var) {
        checkValid(w1Var);
        return i3.c.checkedAdd(i3.c.checkedMultiply(w1Var.getSeconds(), 1000L), w1Var.getNanos() / AbstractC5916c.NANOS_IN_MILLIS);
    }

    public static long toNanos(w1 w1Var) {
        checkValid(w1Var);
        return i3.c.checkedAdd(i3.c.checkedMultiply(w1Var.getSeconds(), 1000000000L), w1Var.getNanos());
    }

    public static long toSeconds(w1 w1Var) {
        return checkValid(w1Var).getSeconds();
    }

    public static String toString(w1 w1Var) {
        checkValid(w1Var);
        long seconds = w1Var.getSeconds();
        int nanos = w1Var.getNanos();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) f1020a.get()).format(new Date(seconds * 1000)));
        if (nanos != 0) {
            sb.append(".");
            sb.append(c(nanos));
        }
        sb.append("Z");
        return sb.toString();
    }

    public static boolean isValid(long j8, int i8) {
        return j8 >= -62135596800L && j8 <= 253402300799L && i8 >= 0 && i8 < 1000000000;
    }

    public static w1 checkValid(w1.b bVar) {
        return checkValid(bVar.build());
    }
}
