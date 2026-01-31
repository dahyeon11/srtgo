package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2703eP0 {

    /* renamed from: a, reason: collision with root package name */
    private int f18761a;

    /* renamed from: b, reason: collision with root package name */
    private int f18762b;

    /* renamed from: c, reason: collision with root package name */
    private int f18763c = 0;

    /* renamed from: d, reason: collision with root package name */
    private XO0[] f18764d = new XO0[100];

    public C2703eP0(boolean z8, int i8) {
    }

    public final synchronized int zza() {
        return this.f18762b * 65536;
    }

    public final synchronized XO0 zzb() {
        XO0 xo0;
        try {
            this.f18762b++;
            int i8 = this.f18763c;
            if (i8 > 0) {
                XO0[] xo0Arr = this.f18764d;
                int i9 = i8 - 1;
                this.f18763c = i9;
                xo0 = xo0Arr[i9];
                if (xo0 == null) {
                    throw null;
                }
                xo0Arr[i9] = null;
            } else {
                xo0 = new XO0(new byte[65536], 0);
                int i10 = this.f18762b;
                XO0[] xo0Arr2 = this.f18764d;
                int length = xo0Arr2.length;
                if (i10 > length) {
                    this.f18764d = (XO0[]) Arrays.copyOf(xo0Arr2, length + length);
                    return xo0;
                }
            }
            return xo0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(XO0 xo0) {
        XO0[] xo0Arr = this.f18764d;
        int i8 = this.f18763c;
        this.f18763c = i8 + 1;
        xo0Arr[i8] = xo0;
        this.f18762b--;
        notifyAll();
    }

    public final synchronized void zzd(YO0 yo0) {
        while (yo0 != null) {
            try {
                XO0[] xo0Arr = this.f18764d;
                int i8 = this.f18763c;
                this.f18763c = i8 + 1;
                xo0Arr[i8] = yo0.zzc();
                this.f18762b--;
                yo0 = yo0.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i8) {
        int i9 = this.f18761a;
        this.f18761a = i8;
        if (i8 < i9) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i8 = this.f18761a;
        int i9 = AbstractC2281am0.zza;
        int iMax = Math.max(0, ((i8 + 65535) / 65536) - this.f18762b);
        int i10 = this.f18763c;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f18764d, iMax, i10, (Object) null);
        this.f18763c = iMax;
    }
}
