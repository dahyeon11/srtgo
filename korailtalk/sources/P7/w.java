package P7;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface w extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(c cVar, long j8);

    x timeout();
}
