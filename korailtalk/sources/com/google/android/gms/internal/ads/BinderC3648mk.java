package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import r2.InterfaceC6172a;
import z1.C6616b;

/* renamed from: com.google.android.gms.internal.ads.mk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3648mk extends AbstractBinderC1719Oj {
    public BinderC3648mk(B1.f fVar) {
    }

    static /* bridge */ /* synthetic */ B1.f b(BinderC3648mk binderC3648mk) {
        binderC3648mk.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1719Oj, com.google.android.gms.internal.ads.InterfaceC1760Pj
    public final void zze(H1.X x8, InterfaceC6172a interfaceC6172a) {
        if (x8 == null || interfaceC6172a == null) {
            return;
        }
        C6616b c6616b = new C6616b((Context) r2.b.unwrap(interfaceC6172a));
        try {
            if (x8.zzi() instanceof H1.T1) {
                H1.T1 t12 = (H1.T1) x8.zzi();
                c6616b.setAdListener(t12 != null ? t12.zzb() : null);
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        try {
            if (x8.zzj() instanceof BinderC3406kd) {
                BinderC3406kd binderC3406kd = (BinderC3406kd) x8.zzj();
                c6616b.setAppEventListener(binderC3406kd != null ? binderC3406kd.zzb() : null);
            }
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
        L1.g.zza.post(new RunnableC3534lk(this, c6616b, x8));
    }
}
