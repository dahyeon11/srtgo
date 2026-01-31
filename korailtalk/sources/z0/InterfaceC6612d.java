package z0;

import java.io.Closeable;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6612d extends Closeable {
    void bindBlob(int i8, byte[] bArr);

    void bindDouble(int i8, double d9);

    void bindLong(int i8, long j8);

    void bindNull(int i8);

    void bindString(int i8, String str);

    void clearBindings();
}
