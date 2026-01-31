package io.grpc;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f32064d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    private final String f32065a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32066b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32067c;

    U(String str, String str2, long j8) {
        e3.w.checkNotNull(str, "typeName");
        e3.w.checkArgument(!str.isEmpty(), "empty type");
        this.f32065a = str;
        this.f32066b = str2;
        this.f32067c = j8;
    }

    private static String a(Class cls) {
        String simpleName = ((Class) e3.w.checkNotNull(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    public static U allocate(Class<?> cls, String str) {
        return allocate(a(cls), str);
    }

    static long b() {
        return f32064d.incrementAndGet();
    }

    public String getDetails() {
        return this.f32066b;
    }

    public long getId() {
        return this.f32067c;
    }

    public String getTypeName() {
        return this.f32065a;
    }

    public String shortName() {
        return this.f32065a + SimpleComparison.LESS_THAN_OPERATION + this.f32067c + SimpleComparison.GREATER_THAN_OPERATION;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(shortName());
        if (this.f32066b != null) {
            sb.append(": (");
            sb.append(this.f32066b);
            sb.append(')');
        }
        return sb.toString();
    }

    public static U allocate(String str, String str2) {
        return new U(str, str2, b());
    }
}
