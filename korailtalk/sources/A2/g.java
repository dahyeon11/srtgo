package A2;

import java.io.OutputStream;

/* loaded from: classes2.dex */
final class g extends OutputStream {
    g() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i8) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        e.zza(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i8, int i9) {
        e.zza(bArr);
    }
}
