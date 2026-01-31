package C7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: C7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0479m {

    /* renamed from: a, reason: collision with root package name */
    final F7.g f672a;

    public C0479m() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public int connectionCount() {
        return this.f672a.connectionCount();
    }

    public void evictAll() throws IOException {
        this.f672a.evictAll();
    }

    public int idleConnectionCount() {
        return this.f672a.idleConnectionCount();
    }

    public C0479m(int i8, long j8, TimeUnit timeUnit) {
        this.f672a = new F7.g(i8, j8, timeUnit);
    }
}
