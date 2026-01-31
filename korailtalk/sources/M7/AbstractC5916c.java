package m7;

import Q7.C;
import S6.M;
import g7.AbstractC5560b;
import j7.l;
import j7.o;
import j7.s;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import l7.r;
import m7.C5914a;

/* renamed from: m7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5916c {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(long j8, int i8) {
        return C5914a.m424constructorimpl((j8 << 1) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j8) {
        return C5914a.m424constructorimpl((j8 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(long j8) {
        return new o(-4611686018426L, 4611686018426L).contains(j8) ? d(f(j8)) : b(s.coerceIn(j8, -4611686018427387903L, MAX_MILLIS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(long j8) {
        return C5914a.m424constructorimpl(j8 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j8) {
        return new o(-4611686018426999999L, MAX_NANOS).contains(j8) ? d(j8) : b(g(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j8) {
        return j8 * NANOS_IN_MILLIS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j8) {
        return j8 / NANOS_IN_MILLIS;
    }

    public static /* synthetic */ void getDays$annotations(double d9) {
    }

    public static /* synthetic */ void getHours$annotations(double d9) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(double d9) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(double d9) {
    }

    public static /* synthetic */ void getMinutes$annotations(double d9) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(double d9) {
    }

    public static /* synthetic */ void getSeconds$annotations(double d9) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(String str, boolean z8) {
        long jM455plusLRDsOJo;
        String str2 = str;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        C5914a.C0352a c0352a = C5914a.Companion;
        long jM501getZEROUwyO8pc = c0352a.m501getZEROUwyO8pc();
        char cCharAt = str2.charAt(0);
        boolean z9 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z10 = length2 > 0;
        boolean z11 = z10 && r.startsWith$default((CharSequence) str2, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c9 = '9';
        char c10 = '0';
        if (str2.charAt(length2) == 'P') {
            int i8 = length2 + 1;
            if (i8 == length) {
                throw new IllegalArgumentException();
            }
            EnumC5917d enumC5917d = null;
            boolean z12 = false;
            while (i8 < length) {
                if (str2.charAt(i8) != 'T') {
                    int i9 = i8;
                    while (i9 < str.length()) {
                        char cCharAt2 = str2.charAt(i9);
                        if (!new j7.c(c10, c9).contains(cCharAt2) && !r.contains$default((CharSequence) "+-.", cCharAt2, false, 2, (Object) null)) {
                            break;
                        }
                        i9++;
                        c9 = '9';
                        c10 = '0';
                    }
                    Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str2.substring(i8, i9);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i8 + strSubstring.length();
                    if (length3 < 0 || length3 > r.getLastIndex(str)) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str2.charAt(length3);
                    i8 = length3 + 1;
                    EnumC5917d enumC5917dDurationUnitByIsoChar = f.durationUnitByIsoChar(cCharAt3, z12);
                    if (enumC5917d != null && enumC5917d.compareTo(enumC5917dDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = r.indexOf$default((CharSequence) strSubstring, C.PACKAGE_SEPARATOR_CHAR, 0, false, 6, (Object) null);
                    if (enumC5917dDurationUnitByIsoChar != EnumC5917d.SECONDS || iIndexOf$default <= 0) {
                        jM501getZEROUwyO8pc = C5914a.m455plusLRDsOJo(jM501getZEROUwyO8pc, toDuration(i(strSubstring), enumC5917dDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jM455plusLRDsOJo2 = C5914a.m455plusLRDsOJo(jM501getZEROUwyO8pc, toDuration(i(strSubstring2), enumC5917dDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM501getZEROUwyO8pc = C5914a.m455plusLRDsOJo(jM455plusLRDsOJo2, toDuration(Double.parseDouble(strSubstring3), enumC5917dDurationUnitByIsoChar));
                    }
                    enumC5917d = enumC5917dDurationUnitByIsoChar;
                    c9 = '9';
                    c10 = '0';
                    z9 = true;
                    str2 = str;
                } else {
                    if (z12 || (i8 = i8 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z12 = z9;
                }
            }
        } else {
            if (z8) {
                throw new IllegalArgumentException();
            }
            String str3 = "Unexpected order of duration components";
            if (r.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM501getZEROUwyO8pc = c0352a.m499getINFINITEUwyO8pc();
            } else {
                boolean z13 = !z10;
                if (z10 && str.charAt(length2) == '(' && r.last(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    jM455plusLRDsOJo = jM501getZEROUwyO8pc;
                    z13 = true;
                } else {
                    jM455plusLRDsOJo = jM501getZEROUwyO8pc;
                }
                boolean z14 = false;
                EnumC5917d enumC5917d2 = null;
                while (length2 < length) {
                    if (z14 && z13) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i10 = length2;
                    while (i10 < str.length()) {
                        char cCharAt4 = str.charAt(i10);
                        if (!new j7.c('0', '9').contains(cCharAt4) && cCharAt4 != '.') {
                            break;
                        }
                        i10++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i10);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i11 = length4;
                    while (i11 < str.length()) {
                        if (!new j7.c('a', 'z').contains(str.charAt(i11))) {
                            break;
                        }
                        i11++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i11);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    EnumC5917d enumC5917dDurationUnitByShortName = f.durationUnitByShortName(strSubstring5);
                    if (enumC5917d2 != null && enumC5917d2.compareTo(enumC5917dDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException(str3);
                    }
                    String str4 = str3;
                    int iIndexOf$default2 = r.indexOf$default((CharSequence) strSubstring4, C.PACKAGE_SEPARATOR_CHAR, 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM455plusLRDsOJo3 = C5914a.m455plusLRDsOJo(jM455plusLRDsOJo, toDuration(Long.parseLong(strSubstring6), enumC5917dDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM455plusLRDsOJo = C5914a.m455plusLRDsOJo(jM455plusLRDsOJo3, toDuration(Double.parseDouble(strSubstring7), enumC5917dDurationUnitByShortName));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM455plusLRDsOJo = C5914a.m455plusLRDsOJo(jM455plusLRDsOJo, toDuration(Long.parseLong(strSubstring4), enumC5917dDurationUnitByShortName));
                    }
                    enumC5917d2 = enumC5917dDurationUnitByShortName;
                    str3 = str4;
                    z14 = true;
                }
                jM501getZEROUwyO8pc = jM455plusLRDsOJo;
            }
        }
        return z11 ? C5914a.m472unaryMinusUwyO8pc(jM501getZEROUwyO8pc) : jM501getZEROUwyO8pc;
    }

    private static final long i(String str) {
        int length = str.length();
        int i8 = (length <= 0 || !r.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i8 > 16) {
            Iterable lVar = new l(i8, r.getLastIndex(str));
            if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                Iterator it = lVar.iterator();
                while (it.hasNext()) {
                    if (!new j7.c('0', '9').contains(str.charAt(((M) it).nextInt()))) {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (r.startsWith$default(str, "+", false, 2, (Object) null)) {
            str = r.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long toDuration(int i8, EnumC5917d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(EnumC5917d.SECONDS) <= 0 ? d(C5918e.convertDurationUnitOverflow(i8, unit, EnumC5917d.NANOSECONDS)) : toDuration(i8, unit);
    }

    public static /* synthetic */ void getDays$annotations(int i8) {
    }

    public static /* synthetic */ void getHours$annotations(int i8) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(int i8) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(int i8) {
    }

    public static /* synthetic */ void getMinutes$annotations(int i8) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(int i8) {
    }

    public static /* synthetic */ void getSeconds$annotations(int i8) {
    }

    public static /* synthetic */ void getDays$annotations(long j8) {
    }

    public static /* synthetic */ void getHours$annotations(long j8) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(long j8) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(long j8) {
    }

    public static /* synthetic */ void getMinutes$annotations(long j8) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(long j8) {
    }

    public static /* synthetic */ void getSeconds$annotations(long j8) {
    }

    public static final long toDuration(long j8, EnumC5917d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        EnumC5917d enumC5917d = EnumC5917d.NANOSECONDS;
        long jConvertDurationUnitOverflow = C5918e.convertDurationUnitOverflow(MAX_NANOS, enumC5917d, unit);
        if (new o(-jConvertDurationUnitOverflow, jConvertDurationUnitOverflow).contains(j8)) {
            return d(C5918e.convertDurationUnitOverflow(j8, unit, enumC5917d));
        }
        return b(s.coerceIn(C5918e.convertDurationUnit(j8, unit, EnumC5917d.MILLISECONDS), -4611686018427387903L, MAX_MILLIS));
    }

    public static final long toDuration(double d9, EnumC5917d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = C5918e.convertDurationUnit(d9, unit, EnumC5917d.NANOSECONDS);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jRoundToLong = AbstractC5560b.roundToLong(dConvertDurationUnit);
            if (new o(-4611686018426999999L, MAX_NANOS).contains(jRoundToLong)) {
                return d(jRoundToLong);
            }
            return c(AbstractC5560b.roundToLong(C5918e.convertDurationUnit(d9, unit, EnumC5917d.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }
}
