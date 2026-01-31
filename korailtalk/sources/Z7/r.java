package Z7;

import Q7.I;
import Q7.O;
import T7.InterfaceC0815z;
import T7.N;
import T7.n0;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m7.AbstractC5916c;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a */
    static final I f5752a = I.of(U7.a.LONG_INT_MIN_VALUE, U7.a.LONG_INT_MAX_VALUE);

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5753a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f5753a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5753a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5753a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5753a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5753a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5753a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5753a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static <T extends Throwable> void accept(InterfaceC0815z interfaceC0815z, Duration duration) {
        if (interfaceC0815z == null || duration == null) {
            return;
        }
        interfaceC0815z.accept(Long.valueOf(duration.toMillis()), Integer.valueOf(getNanosOfMilli(duration)));
    }

    private static Instant c(N n8) {
        Instant instantNow = Instant.now();
        n8.accept(instantNow);
        return instantNow;
    }

    static ChronoUnit d(TimeUnit timeUnit) {
        int[] iArr = a.f5753a;
        Objects.requireNonNull(timeUnit);
        switch (iArr[timeUnit.ordinal()]) {
            case 1:
                return ChronoUnit.NANOS;
            case 2:
                return ChronoUnit.MICROS;
            case 3:
                return ChronoUnit.MILLIS;
            case 4:
                return ChronoUnit.SECONDS;
            case 5:
                return ChronoUnit.MINUTES;
            case 6:
                return ChronoUnit.HOURS;
            case 7:
                return ChronoUnit.DAYS;
            default:
                throw new IllegalArgumentException(timeUnit.toString());
        }
    }

    @Deprecated
    public static int getNanosOfMiili(Duration duration) {
        return getNanosOfMilli(duration);
    }

    public static int getNanosOfMilli(Duration duration) {
        return zeroIfNull(duration).getNano() % AbstractC5916c.NANOS_IN_MILLIS;
    }

    public static boolean isPositive(Duration duration) {
        return (duration.isNegative() || duration.isZero()) ? false : true;
    }

    public static <E extends Throwable> Duration of(final N n8) {
        Objects.requireNonNull(n8);
        return since(c(new N() { // from class: Z7.q
            @Override // T7.N
            public final void accept(Object obj) {
                n8.accept((Instant) obj);
            }
        }));
    }

    public static Duration since(Temporal temporal) {
        return Duration.between(temporal, Instant.now());
    }

    public static Duration toDuration(long j8, TimeUnit timeUnit) {
        return Duration.of(j8, d(timeUnit));
    }

    public static int toMillisInt(Duration duration) {
        Objects.requireNonNull(duration, "duration");
        return ((Long) f5752a.fit(Long.valueOf(duration.toMillis()))).intValue();
    }

    public static Duration zeroIfNull(Duration duration) {
        return g.a(O.defaultIfNull(duration, Duration.ZERO));
    }

    public static <E extends Throwable> Duration of(final n0 n0Var) {
        return of(new N() { // from class: Z7.p
            @Override // T7.N
            public final void accept(Object obj) {
                n0Var.run();
            }
        });
    }
}
