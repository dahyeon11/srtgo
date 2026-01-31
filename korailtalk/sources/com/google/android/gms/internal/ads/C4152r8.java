package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.r8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4152r8 extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final long f22384a;

    /* renamed from: b, reason: collision with root package name */
    private long f22385b;

    C4152r8(InputStream inputStream, long j8) {
        super(inputStream);
        this.f22384a = j8;
    }

    final long a() {
        return this.f22384a - this.f22385b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i8 = super.read();
        if (i8 != -1) {
            this.f22385b++;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) throws IOException {
        int i10 = super.read(bArr, i8, i9);
        if (i10 != -1) {
            this.f22385b += i10;
        }
        return i10;
    }
}
