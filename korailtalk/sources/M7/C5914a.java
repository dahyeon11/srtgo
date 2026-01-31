package m7;

import Q7.C;
import f1.j;
import f7.p;
import f7.q;
import g7.AbstractC5560b;
import j7.o;
import j7.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.r;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5914a implements Comparable {
    public static final C0352a Companion = new C0352a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f34121b = m424constructorimpl(0);

    /* renamed from: c, reason: collision with root package name */
    private static final long f34122c = AbstractC5916c.b(AbstractC5916c.MAX_MILLIS);

    /* renamed from: d, reason: collision with root package name */
    private static final long f34123d = AbstractC5916c.b(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name */
    private final long f34124a;

    /* renamed from: m7.a$a, reason: collision with other inner class name */
    public static final class C0352a {
        public /* synthetic */ C0352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m475getDaysUwyO8pc$annotations(double d9) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m478getHoursUwyO8pc$annotations(double d9) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m481getMicrosecondsUwyO8pc$annotations(double d9) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m484getMillisecondsUwyO8pc$annotations(double d9) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m487getMinutesUwyO8pc$annotations(double d9) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m490getNanosecondsUwyO8pc$annotations(double d9) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m493getSecondsUwyO8pc$annotations(double d9) {
        }

        public final double convert(double d9, EnumC5917d sourceUnit, EnumC5917d targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return C5918e.convertDurationUnit(d9, sourceUnit, targetUnit);
        }

        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m497daysUwyO8pc(int i8) {
            return AbstractC5916c.toDuration(i8, EnumC5917d.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m499getINFINITEUwyO8pc() {
            return C5914a.f34122c;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m500getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return C5914a.f34123d;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m501getZEROUwyO8pc() {
            return C5914a.f34121b;
        }

        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m503hoursUwyO8pc(int i8) {
            return AbstractC5916c.toDuration(i8, EnumC5917d.HOURS);
        }

        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m506microsecondsUwyO8pc(int i8) {
            return AbstractC5916c.toDuration(i8, EnumC5917d.MICROSECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m509millisecondsUwyO8pc(int i8) {
            return AbstractC5916c.toDuration(i8, EnumC5917d.MILLISECONDS);
        }

        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m512minutesUwyO8pc(int i8) {
            return AbstractC5916c.toDuration(i8, EnumC5917d.MINUTES);
        }

        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m515nanosecondsUwyO8pc(int i8) {
            return AbstractC5916c.toDuration(i8, EnumC5917d.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m517parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return AbstractC5916c.h(value, false);
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e8);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m518parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return AbstractC5916c.h(value, true);
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e8);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final C5914a m519parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return C5914a.m422boximpl(AbstractC5916c.h(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final C5914a m520parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return C5914a.m422boximpl(AbstractC5916c.h(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m522secondsUwyO8pc(int i8) {
            return AbstractC5916c.toDuration(i8, EnumC5917d.SECONDS);
        }

        private C0352a() {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m476getDaysUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m479getHoursUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m482getMicrosecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m485getMillisecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m488getMinutesUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m491getNanosecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m494getSecondsUwyO8pc$annotations(int i8) {
        }

        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m498daysUwyO8pc(long j8) {
            return AbstractC5916c.toDuration(j8, EnumC5917d.DAYS);
        }

        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m504hoursUwyO8pc(long j8) {
            return AbstractC5916c.toDuration(j8, EnumC5917d.HOURS);
        }

        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m507microsecondsUwyO8pc(long j8) {
            return AbstractC5916c.toDuration(j8, EnumC5917d.MICROSECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m510millisecondsUwyO8pc(long j8) {
            return AbstractC5916c.toDuration(j8, EnumC5917d.MILLISECONDS);
        }

        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m513minutesUwyO8pc(long j8) {
            return AbstractC5916c.toDuration(j8, EnumC5917d.MINUTES);
        }

        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m516nanosecondsUwyO8pc(long j8) {
            return AbstractC5916c.toDuration(j8, EnumC5917d.NANOSECONDS);
        }

        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m523secondsUwyO8pc(long j8) {
            return AbstractC5916c.toDuration(j8, EnumC5917d.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m477getDaysUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m480getHoursUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m483getMicrosecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m486getMillisecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m489getMinutesUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m492getNanosecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m495getSecondsUwyO8pc$annotations(long j8) {
        }

        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m496daysUwyO8pc(double d9) {
            return AbstractC5916c.toDuration(d9, EnumC5917d.DAYS);
        }

        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m502hoursUwyO8pc(double d9) {
            return AbstractC5916c.toDuration(d9, EnumC5917d.HOURS);
        }

        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m505microsecondsUwyO8pc(double d9) {
            return AbstractC5916c.toDuration(d9, EnumC5917d.MICROSECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m508millisecondsUwyO8pc(double d9) {
            return AbstractC5916c.toDuration(d9, EnumC5917d.MILLISECONDS);
        }

        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m511minutesUwyO8pc(double d9) {
            return AbstractC5916c.toDuration(d9, EnumC5917d.MINUTES);
        }

        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m514nanosecondsUwyO8pc(double d9) {
            return AbstractC5916c.toDuration(d9, EnumC5917d.NANOSECONDS);
        }

        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m521secondsUwyO8pc(double d9) {
            return AbstractC5916c.toDuration(d9, EnumC5917d.SECONDS);
        }
    }

    private /* synthetic */ C5914a(long j8) {
        this.f34124a = j8;
    }

    private static final long a(long j8, long j9, long j10) {
        long jG = AbstractC5916c.g(j10);
        long j11 = j9 + jG;
        if (!new o(-4611686018426L, 4611686018426L).contains(j11)) {
            return AbstractC5916c.b(s.coerceIn(j11, -4611686018427387903L, AbstractC5916c.MAX_MILLIS));
        }
        return AbstractC5916c.d(AbstractC5916c.f(j11) + (j10 - AbstractC5916c.f(jG)));
    }

    private static final void b(long j8, StringBuilder sb, int i8, int i9, int i10, String str, boolean z8) {
        sb.append(i8);
        if (i9 != 0) {
            sb.append(C.PACKAGE_SEPARATOR_CHAR);
            String strPadStart = r.padStart(String.valueOf(i9), i10, '0');
            int i11 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z8 || i13 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i11 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i13);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C5914a m422boximpl(long j8) {
        return new C5914a(j8);
    }

    private static final EnumC5917d c(long j8) {
        return f(j8) ? EnumC5917d.NANOSECONDS : EnumC5917d.MILLISECONDS;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m424constructorimpl(long j8) {
        if (AbstractC5915b.getDurationAssertionsEnabled()) {
            if (f(j8)) {
                if (!new o(-4611686018426999999L, AbstractC5916c.MAX_NANOS).contains(d(j8))) {
                    throw new AssertionError(d(j8) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new o(-4611686018427387903L, AbstractC5916c.MAX_MILLIS).contains(d(j8))) {
                    throw new AssertionError(d(j8) + " ms is out of milliseconds range");
                }
                if (new o(-4611686018426L, 4611686018426L).contains(d(j8))) {
                    throw new AssertionError(d(j8) + " ms is denormalized");
                }
            }
        }
        return j8;
    }

    private static final long d(long j8) {
        return j8 >> 1;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m425divLRDsOJo(long j8, long j9) {
        EnumC5917d enumC5917d = (EnumC5917d) V6.a.maxOf(c(j8), c(j9));
        return m462toDoubleimpl(j8, enumC5917d) / m462toDoubleimpl(j9, enumC5917d);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m427divUwyO8pc(long j8, int i8) {
        if (i8 == 0) {
            if (m453isPositiveimpl(j8)) {
                return f34122c;
            }
            if (m452isNegativeimpl(j8)) {
                return f34123d;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (f(j8)) {
            return AbstractC5916c.d(d(j8) / i8);
        }
        if (m451isInfiniteimpl(j8)) {
            return m457timesUwyO8pc(j8, AbstractC5560b.getSign(i8));
        }
        long j9 = i8;
        long jD = d(j8) / j9;
        if (!new o(-4611686018426L, 4611686018426L).contains(jD)) {
            return AbstractC5916c.b(jD);
        }
        return AbstractC5916c.d(AbstractC5916c.f(jD) + (AbstractC5916c.f(d(j8) - (jD * j9)) / j9));
    }

    private static final boolean e(long j8) {
        return (((int) j8) & 1) == 1;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m428equalsimpl(long j8, Object obj) {
        return (obj instanceof C5914a) && j8 == ((C5914a) obj).m474unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m429equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    private static final boolean f(long j8) {
        return (((int) j8) & 1) == 0;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m430getAbsoluteValueUwyO8pc(long j8) {
        return m452isNegativeimpl(j8) ? m472unaryMinusUwyO8pc(j8) : j8;
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m431getHoursComponentimpl(long j8) {
        if (m451isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (m440getInWholeHoursimpl(j8) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m439getInWholeDaysimpl(long j8) {
        return m465toLongimpl(j8, EnumC5917d.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m440getInWholeHoursimpl(long j8) {
        return m465toLongimpl(j8, EnumC5917d.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m441getInWholeMicrosecondsimpl(long j8) {
        return m465toLongimpl(j8, EnumC5917d.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m442getInWholeMillisecondsimpl(long j8) {
        return (e(j8) && m450isFiniteimpl(j8)) ? d(j8) : m465toLongimpl(j8, EnumC5917d.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m443getInWholeMinutesimpl(long j8) {
        return m465toLongimpl(j8, EnumC5917d.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m444getInWholeNanosecondsimpl(long j8) {
        long jD = d(j8);
        if (f(j8)) {
            return jD;
        }
        if (jD > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jD < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return AbstractC5916c.f(jD);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m445getInWholeSecondsimpl(long j8) {
        return m465toLongimpl(j8, EnumC5917d.SECONDS);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m446getMinutesComponentimpl(long j8) {
        if (m451isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (m443getInWholeMinutesimpl(j8) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m447getNanosecondsComponentimpl(long j8) {
        if (m451isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (e(j8) ? AbstractC5916c.f(d(j8) % 1000) : d(j8) % j.SECOND_IN_NANOS);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m448getSecondsComponentimpl(long j8) {
        if (m451isInfiniteimpl(j8)) {
            return 0;
        }
        return (int) (m445getInWholeSecondsimpl(j8) % 60);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m449hashCodeimpl(long j8) {
        return Long.hashCode(j8);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m450isFiniteimpl(long j8) {
        return !m451isInfiniteimpl(j8);
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m451isInfiniteimpl(long j8) {
        return j8 == f34122c || j8 == f34123d;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m452isNegativeimpl(long j8) {
        return j8 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m453isPositiveimpl(long j8) {
        return j8 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m454minusLRDsOJo(long j8, long j9) {
        return m455plusLRDsOJo(j8, m472unaryMinusUwyO8pc(j9));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m455plusLRDsOJo(long j8, long j9) {
        if (m451isInfiniteimpl(j8)) {
            if (m450isFiniteimpl(j9) || (j9 ^ j8) >= 0) {
                return j8;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m451isInfiniteimpl(j9)) {
            return j9;
        }
        if ((((int) j8) & 1) != (((int) j9) & 1)) {
            return e(j8) ? a(j8, d(j8), d(j9)) : a(j8, d(j9), d(j8));
        }
        long jD = d(j8) + d(j9);
        return f(j8) ? AbstractC5916c.e(jD) : AbstractC5916c.c(jD);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m457timesUwyO8pc(long j8, int i8) {
        if (m451isInfiniteimpl(j8)) {
            if (i8 != 0) {
                return i8 > 0 ? j8 : m472unaryMinusUwyO8pc(j8);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i8 == 0) {
            return f34121b;
        }
        long jD = d(j8);
        long j9 = i8;
        long j10 = jD * j9;
        if (!f(j8)) {
            return j10 / j9 == jD ? AbstractC5916c.b(s.coerceIn(j10, new o(-4611686018427387903L, AbstractC5916c.MAX_MILLIS))) : AbstractC5560b.getSign(jD) * AbstractC5560b.getSign(i8) > 0 ? f34122c : f34123d;
        }
        if (new o(-2147483647L, 2147483647L).contains(jD)) {
            return AbstractC5916c.d(j10);
        }
        if (j10 / j9 == jD) {
            return AbstractC5916c.e(j10);
        }
        long jG = AbstractC5916c.g(jD);
        long j11 = jG * j9;
        long jG2 = AbstractC5916c.g((jD - AbstractC5916c.f(jG)) * j9) + j11;
        return (j11 / j9 != jG || (jG2 ^ j11) < 0) ? AbstractC5560b.getSign(jD) * AbstractC5560b.getSign(i8) > 0 ? f34122c : f34123d : AbstractC5916c.b(s.coerceIn(jG2, new o(-4611686018427387903L, AbstractC5916c.MAX_MILLIS)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m461toComponentsimpl(long j8, f7.s action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m439getInWholeDaysimpl(j8)), Integer.valueOf(m431getHoursComponentimpl(j8)), Integer.valueOf(m446getMinutesComponentimpl(j8)), Integer.valueOf(m448getSecondsComponentimpl(j8)), Integer.valueOf(m447getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m462toDoubleimpl(long j8, EnumC5917d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j8 == f34122c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j8 == f34123d) {
            return Double.NEGATIVE_INFINITY;
        }
        return C5918e.convertDurationUnit(d(j8), c(j8), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m463toIntimpl(long j8, EnumC5917d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) s.coerceIn(m465toLongimpl(j8, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m464toIsoStringimpl(long j8) {
        StringBuilder sb = new StringBuilder();
        if (m452isNegativeimpl(j8)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM430getAbsoluteValueUwyO8pc = m430getAbsoluteValueUwyO8pc(j8);
        long jM440getInWholeHoursimpl = m440getInWholeHoursimpl(jM430getAbsoluteValueUwyO8pc);
        int iM446getMinutesComponentimpl = m446getMinutesComponentimpl(jM430getAbsoluteValueUwyO8pc);
        int iM448getSecondsComponentimpl = m448getSecondsComponentimpl(jM430getAbsoluteValueUwyO8pc);
        int iM447getNanosecondsComponentimpl = m447getNanosecondsComponentimpl(jM430getAbsoluteValueUwyO8pc);
        if (m451isInfiniteimpl(j8)) {
            jM440getInWholeHoursimpl = 9999999999999L;
        }
        boolean z8 = false;
        boolean z9 = jM440getInWholeHoursimpl != 0;
        boolean z10 = (iM448getSecondsComponentimpl == 0 && iM447getNanosecondsComponentimpl == 0) ? false : true;
        if (iM446getMinutesComponentimpl != 0 || (z10 && z9)) {
            z8 = true;
        }
        if (z9) {
            sb.append(jM440getInWholeHoursimpl);
            sb.append('H');
        }
        if (z8) {
            sb.append(iM446getMinutesComponentimpl);
            sb.append('M');
        }
        if (z10 || (!z9 && !z8)) {
            b(j8, sb, iM448getSecondsComponentimpl, iM447getNanosecondsComponentimpl, 9, "S", true);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m465toLongimpl(long j8, EnumC5917d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j8 == f34122c) {
            return Long.MAX_VALUE;
        }
        if (j8 == f34123d) {
            return Long.MIN_VALUE;
        }
        return C5918e.convertDurationUnit(d(j8), c(j8), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m468toStringimpl(long j8) {
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f34122c) {
            return "Infinity";
        }
        if (j8 == f34123d) {
            return "-Infinity";
        }
        boolean zM452isNegativeimpl = m452isNegativeimpl(j8);
        StringBuilder sb = new StringBuilder();
        if (zM452isNegativeimpl) {
            sb.append('-');
        }
        long jM430getAbsoluteValueUwyO8pc = m430getAbsoluteValueUwyO8pc(j8);
        long jM439getInWholeDaysimpl = m439getInWholeDaysimpl(jM430getAbsoluteValueUwyO8pc);
        int iM431getHoursComponentimpl = m431getHoursComponentimpl(jM430getAbsoluteValueUwyO8pc);
        int iM446getMinutesComponentimpl = m446getMinutesComponentimpl(jM430getAbsoluteValueUwyO8pc);
        int iM448getSecondsComponentimpl = m448getSecondsComponentimpl(jM430getAbsoluteValueUwyO8pc);
        int iM447getNanosecondsComponentimpl = m447getNanosecondsComponentimpl(jM430getAbsoluteValueUwyO8pc);
        int i8 = 0;
        boolean z8 = jM439getInWholeDaysimpl != 0;
        boolean z9 = iM431getHoursComponentimpl != 0;
        boolean z10 = iM446getMinutesComponentimpl != 0;
        boolean z11 = (iM448getSecondsComponentimpl == 0 && iM447getNanosecondsComponentimpl == 0) ? false : true;
        if (z8) {
            sb.append(jM439getInWholeDaysimpl);
            sb.append('d');
            i8 = 1;
        }
        if (z9 || (z8 && (z10 || z11))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(iM431getHoursComponentimpl);
            sb.append('h');
            i8 = i9;
        }
        if (z10 || (z11 && (z9 || z8))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(iM446getMinutesComponentimpl);
            sb.append('m');
            i8 = i10;
        }
        if (z11) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (iM448getSecondsComponentimpl != 0 || z8 || z9 || z10) {
                b(j8, sb, iM448getSecondsComponentimpl, iM447getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM447getNanosecondsComponentimpl >= 1000000) {
                b(j8, sb, iM447getNanosecondsComponentimpl / AbstractC5916c.NANOS_IN_MILLIS, iM447getNanosecondsComponentimpl % AbstractC5916c.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iM447getNanosecondsComponentimpl >= 1000) {
                b(j8, sb, iM447getNanosecondsComponentimpl / 1000, iM447getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM447getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i8 = i11;
        }
        if (zM452isNegativeimpl && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m470toStringimpl$default(long j8, EnumC5917d enumC5917d, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return m469toStringimpl(j8, enumC5917d, i8);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m471truncateToUwyO8pc$kotlin_stdlib(long j8, EnumC5917d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        EnumC5917d enumC5917dC = c(j8);
        if (unit.compareTo(enumC5917dC) <= 0 || m451isInfiniteimpl(j8)) {
            return j8;
        }
        return AbstractC5916c.toDuration(d(j8) - (d(j8) % C5918e.convertDurationUnit(1L, unit, enumC5917dC)), enumC5917dC);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m472unaryMinusUwyO8pc(long j8) {
        return AbstractC5916c.a(-d(j8), ((int) j8) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m473compareToLRDsOJo(((C5914a) obj).m474unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m473compareToLRDsOJo(long j8) {
        return m423compareToLRDsOJo(this.f34124a, j8);
    }

    public boolean equals(Object obj) {
        return m428equalsimpl(this.f34124a, obj);
    }

    public int hashCode() {
        return m449hashCodeimpl(this.f34124a);
    }

    public String toString() {
        return m468toStringimpl(this.f34124a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m474unboximpl() {
        return this.f34124a;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m423compareToLRDsOJo(long j8, long j9) {
        long j10 = j8 ^ j9;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return Intrinsics.compare(j8, j9);
        }
        int i8 = (((int) j8) & 1) - (((int) j9) & 1);
        return m452isNegativeimpl(j8) ? -i8 : i8;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m460toComponentsimpl(long j8, f7.r action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m440getInWholeHoursimpl(j8)), Integer.valueOf(m446getMinutesComponentimpl(j8)), Integer.valueOf(m448getSecondsComponentimpl(j8)), Integer.valueOf(m447getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m459toComponentsimpl(long j8, q action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m443getInWholeMinutesimpl(j8)), Integer.valueOf(m448getSecondsComponentimpl(j8)), Integer.valueOf(m447getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m458toComponentsimpl(long j8, p action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return (T) action.invoke(Long.valueOf(m445getInWholeSecondsimpl(j8)), Integer.valueOf(m447getNanosecondsComponentimpl(j8)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m426divUwyO8pc(long j8, double d9) {
        int iRoundToInt = AbstractC5560b.roundToInt(d9);
        if (iRoundToInt == d9 && iRoundToInt != 0) {
            return m427divUwyO8pc(j8, iRoundToInt);
        }
        EnumC5917d enumC5917dC = c(j8);
        return AbstractC5916c.toDuration(m462toDoubleimpl(j8, enumC5917dC) / d9, enumC5917dC);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m456timesUwyO8pc(long j8, double d9) {
        int iRoundToInt = AbstractC5560b.roundToInt(d9);
        if (iRoundToInt == d9) {
            return m457timesUwyO8pc(j8, iRoundToInt);
        }
        EnumC5917d enumC5917dC = c(j8);
        return AbstractC5916c.toDuration(m462toDoubleimpl(j8, enumC5917dC) * d9, enumC5917dC);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m469toStringimpl(long j8, EnumC5917d unit, int i8) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i8 >= 0) {
            double dM462toDoubleimpl = m462toDoubleimpl(j8, unit);
            if (Double.isInfinite(dM462toDoubleimpl)) {
                return String.valueOf(dM462toDoubleimpl);
            }
            return AbstractC5915b.formatToExactDecimals(dM462toDoubleimpl, s.coerceAtMost(i8, 12)) + f.shortName(unit);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i8).toString());
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    public static /* synthetic */ void getInDays$annotations() {
    }

    public static /* synthetic */ void getInHours$annotations() {
    }

    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    public static /* synthetic */ void getInMinutes$annotations() {
    }

    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    public static /* synthetic */ void getInSeconds$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }
}
