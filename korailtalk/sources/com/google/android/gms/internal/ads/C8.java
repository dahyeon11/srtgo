package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class C8 extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final C3811o8 f12491a;

    public C8(C3811o8 c3811o8, int i8) {
        this.f12491a = c3811o8;
        ((ByteArrayOutputStream) this).buf = c3811o8.zzb(Math.max(i8, 256));
    }

    private final void a(int i8) {
        int i9 = ((ByteArrayOutputStream) this).count;
        if (i9 + i8 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i10 = i9 + i8;
        byte[] bArrZzb = this.f12491a.zzb(i10 + i10);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZzb, 0, ((ByteArrayOutputStream) this).count);
        this.f12491a.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12491a.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f12491a.zza(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i8) {
        a(1);
        super.write(i8);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i8, int i9) {
        a(i9);
        super.write(bArr, i8, i9);
    }
}
