package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.protobuf.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5233n0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f26599a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f26600b;

    /* renamed from: c, reason: collision with root package name */
    private int f26601c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f26602d;

    /* renamed from: e, reason: collision with root package name */
    private int f26603e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26604f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f26605g;

    /* renamed from: h, reason: collision with root package name */
    private int f26606h;

    /* renamed from: i, reason: collision with root package name */
    private long f26607i;

    C5233n0(Iterable iterable) {
        this.f26599a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f26601c++;
        }
        this.f26602d = -1;
        if (a()) {
            return;
        }
        this.f26600b = AbstractC5227l0.EMPTY_BYTE_BUFFER;
        this.f26602d = 0;
        this.f26603e = 0;
        this.f26607i = 0L;
    }

    private boolean a() {
        this.f26602d++;
        if (!this.f26599a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f26599a.next();
        this.f26600b = byteBuffer;
        this.f26603e = byteBuffer.position();
        if (this.f26600b.hasArray()) {
            this.f26604f = true;
            this.f26605g = this.f26600b.array();
            this.f26606h = this.f26600b.arrayOffset();
        } else {
            this.f26604f = false;
            this.f26607i = L1.k(this.f26600b);
            this.f26605g = null;
        }
        return true;
    }

    private void b(int i8) {
        int i9 = this.f26603e + i8;
        this.f26603e = i9;
        if (i9 == this.f26600b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f26602d == this.f26601c) {
            return -1;
        }
        if (this.f26604f) {
            int i8 = this.f26605g[this.f26603e + this.f26606h] & 255;
            b(1);
            return i8;
        }
        int iX = L1.x(this.f26603e + this.f26607i) & 255;
        b(1);
        return iX;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (this.f26602d == this.f26601c) {
            return -1;
        }
        int iLimit = this.f26600b.limit();
        int i10 = this.f26603e;
        int i11 = iLimit - i10;
        if (i9 > i11) {
            i9 = i11;
        }
        if (this.f26604f) {
            System.arraycopy(this.f26605g, i10 + this.f26606h, bArr, i8, i9);
            b(i9);
        } else {
            int iPosition = this.f26600b.position();
            AbstractC5236o0.e(this.f26600b, this.f26603e);
            this.f26600b.get(bArr, i8, i9);
            AbstractC5236o0.e(this.f26600b, iPosition);
            b(i9);
        }
        return i9;
    }
}
