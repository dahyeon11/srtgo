package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.De, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1259De {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f12699a;

    /* renamed from: b, reason: collision with root package name */
    private int f12700b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1300Ee f12701c;

    /* synthetic */ C1259De(C1300Ee c1300Ee, byte[] bArr, AbstractC1218Ce abstractC1218Ce) {
        this.f12701c = c1300Ee;
        this.f12699a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a() {
        try {
            C1300Ee c1300Ee = this.f12701c;
            if (c1300Ee.f12837b) {
                c1300Ee.f12836a.zzj(this.f12699a);
                this.f12701c.f12836a.zzi(0);
                this.f12701c.f12836a.zzg(this.f12700b);
                this.f12701c.f12836a.zzh(null);
                this.f12701c.f12836a.zzf();
            }
        } catch (RemoteException e8) {
            L1.n.zzf("Clearcut log failed", e8);
        }
    }

    public final C1259De zza(int i8) {
        this.f12700b = i8;
        return this;
    }

    public final synchronized void zzc() {
        this.f12701c.f12838c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Be
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.a();
            }
        });
    }
}
