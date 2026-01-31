package o1;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import u1.InterfaceC6407c;

/* loaded from: classes.dex */
abstract class r implements Closeable {

    interface a {
        r build();

        a setApplicationContext(Context context);
    }

    r() {
    }

    abstract InterfaceC6407c a();

    abstract q b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
