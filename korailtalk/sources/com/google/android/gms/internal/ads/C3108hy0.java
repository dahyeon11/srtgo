package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.hy0 */
/* loaded from: classes2.dex */
public final class C3108hy0 extends OutputStream {

    /* renamed from: f */
    private static final byte[] f19871f = new byte[0];

    /* renamed from: c */
    private int f19874c;

    /* renamed from: e */
    private int f19876e;

    /* renamed from: a */
    private final int f19872a = 128;

    /* renamed from: b */
    private final ArrayList f19873b = new ArrayList();

    /* renamed from: d */
    private byte[] f19875d = new byte[128];

    C3108hy0(int i8) {
    }

    private final void a(int i8) {
        this.f19873b.add(new C2993gy0(this.f19875d));
        int length = this.f19874c + this.f19875d.length;
        this.f19874c = length;
        this.f19875d = new byte[Math.max(this.f19872a, Math.max(i8, length >>> 1))];
        this.f19876e = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i8) {
        try {
            if (this.f19876e == this.f19875d.length) {
                a(1);
            }
            byte[] bArr = this.f19875d;
            int i9 = this.f19876e;
            this.f19876e = i9 + 1;
            bArr[i9] = (byte) i8;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int zza() {
        return this.f19874c + this.f19876e;
    }

    public final synchronized AbstractC3677my0 zzb() {
        try {
            int i8 = this.f19876e;
            byte[] bArr = this.f19875d;
            if (i8 >= bArr.length) {
                this.f19873b.add(new C2993gy0(this.f19875d));
                this.f19875d = f19871f;
            } else if (i8 > 0) {
                this.f19873b.add(new C2993gy0(Arrays.copyOf(bArr, i8)));
            }
            this.f19874c += this.f19876e;
            this.f19876e = 0;
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC3677my0.zzu(this.f19873b);
    }

    public final synchronized void zzc() {
        this.f19873b.clear();
        this.f19874c = 0;
        this.f19876e = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = this.f19875d;
        int length = bArr2.length;
        int i10 = this.f19876e;
        int i11 = length - i10;
        if (i9 <= i11) {
            System.arraycopy(bArr, i8, bArr2, i10, i9);
            this.f19876e += i9;
            return;
        }
        System.arraycopy(bArr, i8, bArr2, i10, i11);
        int i12 = i9 - i11;
        a(i12);
        System.arraycopy(bArr, i8 + i11, this.f19875d, 0, i12);
        this.f19876e = i12;
    }
}
