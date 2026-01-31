package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import y1.C6514A;

/* loaded from: classes2.dex */
public final class HO extends C6514A.a {

    /* renamed from: a, reason: collision with root package name */
    private final SL f13321a;

    public HO(SL sl) {
        this.f13321a = sl;
    }

    private static H1.Y0 a(SL sl) {
        H1.V0 v0Zzj = sl.zzj();
        if (v0Zzj == null) {
            return null;
        }
        try {
            return v0Zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // y1.C6514A.a
    public final void onVideoEnd() {
        H1.Y0 y0A = a(this.f13321a);
        if (y0A == null) {
            return;
        }
        try {
            y0A.zze();
        } catch (RemoteException e8) {
            L1.n.zzk("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // y1.C6514A.a
    public final void onVideoPause() {
        H1.Y0 y0A = a(this.f13321a);
        if (y0A == null) {
            return;
        }
        try {
            y0A.zzg();
        } catch (RemoteException e8) {
            L1.n.zzk("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // y1.C6514A.a
    public final void onVideoStart() {
        H1.Y0 y0A = a(this.f13321a);
        if (y0A == null) {
            return;
        }
        try {
            y0A.zzi();
        } catch (RemoteException e8) {
            L1.n.zzk("Unable to call onVideoEnd()", e8);
        }
    }
}
