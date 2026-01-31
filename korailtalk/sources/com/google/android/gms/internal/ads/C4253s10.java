package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.s10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4253s10 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4823x10 f22542a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22543b;

    /* renamed from: c, reason: collision with root package name */
    private H1.S0 f22544c;

    public C4253s10(InterfaceC4823x10 interfaceC4823x10, String str) {
        this.f22542a = interfaceC4823x10;
        this.f22543b = str;
    }

    public final synchronized String zza() {
        H1.S0 s02;
        try {
            s02 = this.f22544c;
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            return null;
        }
        return s02 != null ? s02.zzg() : null;
    }

    public final synchronized String zzb() {
        H1.S0 s02;
        try {
            s02 = this.f22544c;
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
            return null;
        }
        return s02 != null ? s02.zzg() : null;
    }

    public final synchronized void zzd(H1.Y1 y12, int i8) {
        this.f22544c = null;
        C4937y10 c4937y10 = new C4937y10(i8);
        C4139r10 c4139r10 = new C4139r10(this);
        this.f22542a.zzb(y12, this.f22543b, c4937y10, c4139r10);
    }

    public final synchronized boolean zze() {
        return this.f22542a.zza();
    }
}
