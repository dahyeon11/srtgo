package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class YE implements InterfaceC3941pG, WF {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17356a;

    /* renamed from: b, reason: collision with root package name */
    private final C4654va0 f17357b;

    /* renamed from: c, reason: collision with root package name */
    private final C2100Xp f17358c;

    public YE(Context context, C4654va0 c4654va0, C2100Xp c2100Xp) {
        this.f17356a = context;
        this.f17357b = c4654va0;
        this.f17358c = c2100Xp;
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdl(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.WF
    public final void zzdm(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        C2141Yp c2141Yp = this.f17357b.zzae;
        if (c2141Yp == null || !c2141Yp.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f17357b.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.f17357b.zzae.zzb);
    }
}
