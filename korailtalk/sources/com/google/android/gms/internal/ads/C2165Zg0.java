package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Zg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2165Zg0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f17623a;

    /* renamed from: b, reason: collision with root package name */
    private int f17624b;

    /* renamed from: c, reason: collision with root package name */
    private int f17625c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2271ah0 f17626d;

    /* synthetic */ C2165Zg0(C2271ah0 c2271ah0, byte[] bArr, AbstractC2124Yg0 abstractC2124Yg0) {
        this.f17626d = c2271ah0;
        this.f17623a = bArr;
    }

    public final C2165Zg0 zza(int i8) {
        this.f17625c = i8;
        return this;
    }

    public final C2165Zg0 zzb(int i8) {
        this.f17624b = i8;
        return this;
    }

    public final synchronized void zzc() {
        try {
            C2271ah0 c2271ah0 = this.f17626d;
            if (c2271ah0.f18002b) {
                c2271ah0.f18001a.zzj(this.f17623a);
                this.f17626d.f18001a.zzi(this.f17624b);
                this.f17626d.f18001a.zzg(this.f17625c);
                this.f17626d.f18001a.zzh(null);
                this.f17626d.f18001a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
