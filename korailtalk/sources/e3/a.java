package E3;

import com.google.protobuf.B;
import e3.w;
import f1.j;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Comparator;
import m7.AbstractC5916c;

/* loaded from: classes2.dex */
public abstract class a {
    public static final B MIN_VALUE = B.newBuilder().setSeconds(-315576000000L).setNanos(-999999999).build();
    public static final B MAX_VALUE = B.newBuilder().setSeconds(315576000000L).setNanos(999999999).build();
    public static final B ZERO = B.newBuilder().setSeconds(0).setNanos(0).build();

    /* renamed from: E3.a$a */
    private enum EnumC0020a implements Comparator, Serializable {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(B b9, B b10) {
            a.checkValid(b9);
            a.checkValid(b10);
            int iCompare = Long.compare(b9.getSeconds(), b10.getSeconds());
            return iCompare != 0 ? iCompare : Integer.compare(b9.getNanos(), b10.getNanos());
        }
    }

    static B a(long j8, int i8) {
        if (i8 <= -1000000000 || i8 >= 1000000000) {
            j8 = i3.c.checkedAdd(j8, i8 / j.SECOND_IN_NANOS);
            i8 %= j.SECOND_IN_NANOS;
        }
        if (j8 > 0 && i8 < 0) {
            i8 += j.SECOND_IN_NANOS;
            j8--;
        }
        if (j8 < 0 && i8 > 0) {
            i8 -= j.SECOND_IN_NANOS;
            j8++;
        }
        return checkValid(B.newBuilder().setSeconds(j8).setNanos(i8).build());
    }

    public static B add(B b9, B b10) {
        checkValid(b9);
        checkValid(b10);
        return a(i3.c.checkedAdd(b9.getSeconds(), b10.getSeconds()), i3.b.checkedAdd(b9.getNanos(), b10.getNanos()));
    }

    public static B checkNotNegative(B b9) {
        w.checkArgument(!isNegative(b9), "duration (%s) must not be negative", toString(b9));
        return b9;
    }

    public static B checkPositive(B b9) {
        w.checkArgument(isPositive(b9), "duration (%s) must be positive", toString(b9));
        return b9;
    }

    public static B checkValid(B b9) {
        long seconds = b9.getSeconds();
        int nanos = b9.getNanos();
        if (isValid(seconds, nanos)) {
            return b9;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    public static Comparator<B> comparator() {
        return EnumC0020a.INSTANCE;
    }

    public static int compare(B b9, B b10) {
        return EnumC0020a.INSTANCE.compare(b9, b10);
    }

    public static B fromDays(long j8) {
        return B.newBuilder().setSeconds(i3.c.checkedMultiply(j8, 86400L)).setNanos(0).build();
    }

    public static B fromHours(long j8) {
        return B.newBuilder().setSeconds(i3.c.checkedMultiply(j8, 3600L)).setNanos(0).build();
    }

    public static B fromMicros(long j8) {
        return a(j8 / 1000000, (int) ((j8 % 1000000) * 1000));
    }

    public static B fromMillis(long j8) {
        return a(j8 / 1000, (int) ((j8 % 1000) * 1000000));
    }

    public static B fromMinutes(long j8) {
        return B.newBuilder().setSeconds(i3.c.checkedMultiply(j8, 60L)).setNanos(0).build();
    }

    public static B fromNanos(long j8) {
        return a(j8 / 1000000000, (int) (j8 % 1000000000));
    }

    public static B fromSeconds(long j8) {
        return a(j8, 0);
    }

    public static boolean isNegative(B b9) {
        checkValid(b9);
        if (b9.getSeconds() == 0) {
            if (b9.getNanos() >= 0) {
                return false;
            }
        } else if (b9.getSeconds() >= 0) {
            return false;
        }
        return true;
    }

    public static boolean isPositive(B b9) {
        checkValid(b9);
        return (isNegative(b9) || b9.equals(ZERO)) ? false : true;
    }

    public static boolean isValid(B b9) {
        return isValid(b9.getSeconds(), b9.getNanos());
    }

    public static B parse(String str) throws NumberFormatException, ParseException {
        boolean z8;
        String strSubstring;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z8 = true;
        } else {
            z8 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j8 = Long.parseLong(strSubstring2);
        int iE = strSubstring.isEmpty() ? 0 : e.e(strSubstring);
        if (j8 < 0) {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (z8) {
            j8 = -j8;
            iE = -iE;
        }
        try {
            return a(j8, iE);
        } catch (IllegalArgumentException e8) {
            ParseException parseException = new ParseException("Duration value is out of range.", 0);
            parseException.initCause(e8);
            throw parseException;
        }
    }

    public static B parseUnchecked(String str) {
        try {
            return parse(str);
        } catch (ParseException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static B subtract(B b9, B b10) {
        checkValid(b9);
        checkValid(b10);
        return a(i3.c.checkedSubtract(b9.getSeconds(), b10.getSeconds()), i3.b.checkedSubtract(b9.getNanos(), b10.getNanos()));
    }

    public static long toDays(B b9) {
        return checkValid(b9).getSeconds() / 86400;
    }

    public static long toHours(B b9) {
        return checkValid(b9).getSeconds() / 3600;
    }

    public static long toMicros(B b9) {
        checkValid(b9);
        return i3.c.checkedAdd(i3.c.checkedMultiply(b9.getSeconds(), 1000000L), b9.getNanos() / 1000);
    }

    public static long toMillis(B b9) {
        checkValid(b9);
        return i3.c.checkedAdd(i3.c.checkedMultiply(b9.getSeconds(), 1000L), b9.getNanos() / AbstractC5916c.NANOS_IN_MILLIS);
    }

    public static long toMinutes(B b9) {
        return checkValid(b9).getSeconds() / 60;
    }

    public static long toNanos(B b9) {
        checkValid(b9);
        return i3.c.checkedAdd(i3.c.checkedMultiply(b9.getSeconds(), 1000000000L), b9.getNanos());
    }

    public static long toSeconds(B b9) {
        return checkValid(b9).getSeconds();
    }

    public static double toSecondsAsDouble(B b9) {
        checkValid(b9);
        return b9.getSeconds() + (b9.getNanos() / 1.0E9d);
    }

    public static String toString(B b9) {
        checkValid(b9);
        long seconds = b9.getSeconds();
        int nanos = b9.getNanos();
        StringBuilder sb = new StringBuilder();
        if (seconds < 0 || nanos < 0) {
            sb.append(g5.e.STATE_NAME_NONE);
            seconds = -seconds;
            nanos = -nanos;
        }
        sb.append(seconds);
        if (nanos != 0) {
            sb.append(".");
            sb.append(e.c(nanos));
        }
        sb.append("s");
        return sb.toString();
    }

    public static boolean isValid(long j8, int i8) {
        if (j8 >= -315576000000L && j8 <= 315576000000L && i8 >= -999999999 && i8 < 1000000000) {
            if (j8 >= 0 && i8 >= 0) {
                return true;
            }
            if (j8 <= 0 && i8 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static B checkValid(B.b bVar) {
        return checkValid(bVar.build());
    }
}
