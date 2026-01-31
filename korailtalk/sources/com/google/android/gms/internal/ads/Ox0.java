package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class Ox0 extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private int f15176a;

    Ox0(InputStream inputStream, int i8) {
        super(inputStream);
        this.f15176a = i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f15176a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f15176a <= 0) {
            return -1;
        }
        int i8 = super.read();
        if (i8 >= 0) {
            this.f15176a--;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) {
        int iSkip = (int) super.skip(Math.min(j8, this.f15176a));
        if (iSkip >= 0) {
            this.f15176a -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) throws IOException {
        int i10 = this.f15176a;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = super.read(bArr, i8, Math.min(i9, i10));
        if (i11 >= 0) {
            this.f15176a -= i11;
        }
        return i11;
    }
}
