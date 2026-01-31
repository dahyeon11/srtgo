package e3;

import Q7.X;
import java.util.concurrent.TimeUnit;

/* renamed from: e3.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5353C {

    /* renamed from: a, reason: collision with root package name */
    private final G f30323a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30324b;

    /* renamed from: c, reason: collision with root package name */
    private long f30325c;

    /* renamed from: d, reason: collision with root package name */
    private long f30326d;

    /* renamed from: e3.C$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30327a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f30327a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30327a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30327a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30327a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30327a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30327a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30327a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    C5353C() {
        this.f30323a = G.systemTicker();
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f30327a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j8) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j8, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j8, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j8, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j8, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j8, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j8, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    private long c() {
        return this.f30324b ? (this.f30323a.read() - this.f30326d) + this.f30325c : this.f30325c;
    }

    public static C5353C createStarted() {
        return new C5353C().start();
    }

    public static C5353C createUnstarted() {
        return new C5353C();
    }

    public long elapsed(TimeUnit timeUnit) {
        return timeUnit.convert(c(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning() {
        return this.f30324b;
    }

    public C5353C reset() {
        this.f30325c = 0L;
        this.f30324b = false;
        return this;
    }

    public C5353C start() {
        w.checkState(!this.f30324b, "This stopwatch is already running.");
        this.f30324b = true;
        this.f30326d = this.f30323a.read();
        return this;
    }

    public C5353C stop() {
        long j8 = this.f30323a.read();
        w.checkState(this.f30324b, "This stopwatch is already stopped.");
        this.f30324b = false;
        this.f30325c += j8 - this.f30326d;
        return this;
    }

    public String toString() {
        long jC = c();
        TimeUnit timeUnitB = b(jC);
        return v.c(jC / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + X.SPACE + a(timeUnitB);
    }

    public static C5353C createStarted(G g8) {
        return new C5353C(g8).start();
    }

    public static C5353C createUnstarted(G g8) {
        return new C5353C(g8);
    }

    C5353C(G g8) {
        this.f30323a = (G) w.checkNotNull(g8, "ticker");
    }
}
