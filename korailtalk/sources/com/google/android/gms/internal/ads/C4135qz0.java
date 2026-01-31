package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.qz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4135qz0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f22321a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f22322b;

    /* renamed from: c, reason: collision with root package name */
    private int f22323c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f22324d;

    /* renamed from: e, reason: collision with root package name */
    private int f22325e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22326f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f22327g;

    /* renamed from: h, reason: collision with root package name */
    private int f22328h;

    /* renamed from: i, reason: collision with root package name */
    private long f22329i;

    C4135qz0(Iterable iterable) {
        this.f22321a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f22323c++;
        }
        this.f22324d = -1;
        if (b()) {
            return;
        }
        this.f22322b = AbstractC3793nz0.zze;
        this.f22324d = 0;
        this.f22325e = 0;
        this.f22329i = 0L;
    }

    private final void a(int i8) {
        int i9 = this.f22325e + i8;
        this.f22325e = i9;
        if (i9 == this.f22322b.limit()) {
            b();
        }
    }

    private final boolean b() {
        this.f22324d++;
        if (!this.f22321a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f22321a.next();
        this.f22322b = byteBuffer;
        this.f22325e = byteBuffer.position();
        if (this.f22322b.hasArray()) {
            this.f22326f = true;
            this.f22327g = this.f22322b.array();
            this.f22328h = this.f22322b.arrayOffset();
        } else {
            this.f22326f = false;
            this.f22329i = MA0.m(this.f22322b);
            this.f22327g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f22324d == this.f22323c) {
            return -1;
        }
        if (this.f22326f) {
            int i8 = this.f22327g[this.f22325e + this.f22328h] & 255;
            a(1);
            return i8;
        }
        int i9 = MA0.i(this.f22325e + this.f22329i) & 255;
        a(1);
        return i9;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        if (this.f22324d == this.f22323c) {
            return -1;
        }
        int iLimit = this.f22322b.limit();
        int i10 = this.f22325e;
        int i11 = iLimit - i10;
        if (i9 > i11) {
            i9 = i11;
        }
        if (this.f22326f) {
            System.arraycopy(this.f22327g, i10 + this.f22328h, bArr, i8, i9);
            a(i9);
        } else {
            int iPosition = this.f22322b.position();
            this.f22322b.position(this.f22325e);
            this.f22322b.get(bArr, i8, i9);
            this.f22322b.position(iPosition);
            a(i9);
        }
        return i9;
    }
}
