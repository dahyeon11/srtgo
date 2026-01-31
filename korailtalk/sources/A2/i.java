package A2;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f59a = Logger.getLogger(i.class.getName());

    public static void zza(@NullableDecl InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                try {
                    f59a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e8);
                } catch (IOException e9) {
                    throw new AssertionError(e9);
                }
            }
        }
    }
}
