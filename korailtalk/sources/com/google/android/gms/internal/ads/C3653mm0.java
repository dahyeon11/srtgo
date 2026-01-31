package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.mm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3653mm0 extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f20979a;

    /* renamed from: b, reason: collision with root package name */
    private long f20980b;

    C3653mm0(InputStream inputStream, long j8) {
        super(inputStream);
        this.f20980b = -1L;
        inputStream.getClass();
        AbstractC1188Bj0.zzf(j8 >= 0, "limit must be non-negative");
        this.f20979a = j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f20979a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i8) {
        ((FilterInputStream) this).in.mark(i8);
        this.f20980b = this.f20979a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f20979a == 0) {
            return -1;
        }
        int i8 = ((FilterInputStream) this).in.read();
        if (i8 != -1) {
            this.f20979a--;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f20980b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f20979a = this.f20980b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f20979a));
        this.f20979a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) throws IOException {
        long j8 = this.f20979a;
        if (j8 == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read(bArr, i8, (int) Math.min(i9, j8));
        if (i10 != -1) {
            this.f20979a -= i10;
        }
        return i10;
    }
}
