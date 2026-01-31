package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.u10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4481u10 {

    /* renamed from: a, reason: collision with root package name */
    private final C2696eM f22956a;

    /* renamed from: b, reason: collision with root package name */
    private final C3000h10 f22957b;

    /* renamed from: c, reason: collision with root package name */
    private final CF f22958c;

    public C4481u10(C2696eM c2696eM, LQ lq) {
        this.f22956a = c2696eM;
        final C3000h10 c3000h10 = new C3000h10(lq);
        this.f22957b = c3000h10;
        final InterfaceC4335sm interfaceC4335smZzg = c2696eM.zzg();
        this.f22958c = new CF() { // from class: com.google.android.gms.internal.ads.t10
            @Override // com.google.android.gms.internal.ads.CF
            public final void zzdB(C0534f1 c0534f1) {
                c3000h10.zzdB(c0534f1);
                InterfaceC4335sm interfaceC4335sm = interfaceC4335smZzg;
                if (interfaceC4335sm != null) {
                    try {
                        interfaceC4335sm.zzf(c0534f1);
                    } catch (RemoteException e8) {
                        L1.n.zzl("#007 Could not call remote method.", e8);
                    }
                }
                if (interfaceC4335sm != null) {
                    try {
                        interfaceC4335sm.zze(c0534f1.zza);
                    } catch (RemoteException e9) {
                        L1.n.zzl("#007 Could not call remote method.", e9);
                    }
                }
            }
        };
    }

    public final CF zza() {
        return this.f22958c;
    }

    public final InterfaceC3941pG zzb() {
        return this.f22957b;
    }

    public final VK zzc() {
        return new VK(this.f22956a, this.f22957b.zzg());
    }

    public final C3000h10 zzd() {
        return this.f22957b;
    }

    public final void zze(H1.J j8) {
        this.f22957b.zzj(j8);
    }
}
