package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.xA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4840xA implements WF {

    /* renamed from: a, reason: collision with root package name */
    private final C4087qb0 f23664a;

    public C4840xA(C4087qb0 c4087qb0) {
        this.f23664a = c4087qb0;
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdj(Context context) {
        try {
            this.f23664a.zzg();
        } catch (C2112Ya0 e8) {
            L1.n.zzk("Cannot invoke onDestroy for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdl(Context context) {
        try {
            this.f23664a.zzt();
        } catch (C2112Ya0 e8) {
            L1.n.zzk("Cannot invoke onPause for the mediation adapter.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdm(Context context) {
        try {
            this.f23664a.zzu();
            if (context != null) {
                this.f23664a.zzs(context);
            }
        } catch (C2112Ya0 e8) {
            L1.n.zzk("Cannot invoke onResume for the mediation adapter.", e8);
        }
    }
}
