package d7;

import R6.AbstractC0747a;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5332c {
    public static final void closeFinally(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0747a.addSuppressed(th, th2);
            }
        }
    }
}
