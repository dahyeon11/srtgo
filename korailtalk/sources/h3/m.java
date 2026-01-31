package h3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f31521a = Logger.getLogger(m.class.getName());

    public static void close(Closeable closeable, boolean z8) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e8) {
            if (!z8) {
                throw e8;
            }
            f31521a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e8);
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        try {
            close(inputStream, true);
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public static void closeQuietly(Reader reader) {
        try {
            close(reader, true);
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
