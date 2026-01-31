package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.r00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4137r00 implements G1.g {

    /* renamed from: a, reason: collision with root package name */
    private G1.g f22330a;

    @Override // G1.g
    public final synchronized void zza(View view) {
        G1.g gVar = this.f22330a;
        if (gVar != null) {
            gVar.zza(view);
        }
    }

    @Override // G1.g
    public final synchronized void zzb() {
        G1.g gVar = this.f22330a;
        if (gVar != null) {
            gVar.zzb();
        }
    }

    @Override // G1.g
    public final synchronized void zzc() {
        G1.g gVar = this.f22330a;
        if (gVar != null) {
            gVar.zzc();
        }
    }

    public final synchronized void zzd(G1.g gVar) {
        this.f22330a = gVar;
    }
}
