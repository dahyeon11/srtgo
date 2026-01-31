package P7;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface v extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    x timeout();

    void write(c cVar, long j8);
}
