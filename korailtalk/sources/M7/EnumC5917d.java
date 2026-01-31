package m7;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5917d {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumC5917d[] f34127b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f34128c;

    /* renamed from: a, reason: collision with root package name */
    private final TimeUnit f34129a;
    public static final EnumC5917d NANOSECONDS = new EnumC5917d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final EnumC5917d MICROSECONDS = new EnumC5917d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final EnumC5917d MILLISECONDS = new EnumC5917d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final EnumC5917d SECONDS = new EnumC5917d("SECONDS", 3, TimeUnit.SECONDS);
    public static final EnumC5917d MINUTES = new EnumC5917d("MINUTES", 4, TimeUnit.MINUTES);
    public static final EnumC5917d HOURS = new EnumC5917d("HOURS", 5, TimeUnit.HOURS);
    public static final EnumC5917d DAYS = new EnumC5917d("DAYS", 6, TimeUnit.DAYS);

    static {
        EnumC5917d[] enumC5917dArrA = a();
        f34127b = enumC5917dArrA;
        f34128c = Z6.b.enumEntries(enumC5917dArrA);
    }

    private EnumC5917d(String str, int i8, TimeUnit timeUnit) {
        this.f34129a = timeUnit;
    }

    private static final /* synthetic */ EnumC5917d[] a() {
        return new EnumC5917d[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static Z6.a getEntries() {
        return f34128c;
    }

    public static EnumC5917d valueOf(String str) {
        return (EnumC5917d) Enum.valueOf(EnumC5917d.class, str);
    }

    public static EnumC5917d[] values() {
        return (EnumC5917d[]) f34127b.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.f34129a;
    }
}
