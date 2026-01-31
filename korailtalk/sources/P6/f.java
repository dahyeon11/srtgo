package P6;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    static final f f3760a = new f();

    private f() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.stopTask();
    }
}
