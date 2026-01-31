package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class TR implements InterfaceC2576dJ {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f16479a = new Bundle();

    @Override // com.google.android.gms.internal.ads.InterfaceC2576dJ
    public final void zza(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2576dJ
    public final synchronized void zzb(String str, String str2) {
        this.f16479a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2576dJ
    public final synchronized void zzc(String str) {
        this.f16479a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2576dJ
    public final synchronized void zzd(String str) {
        this.f16479a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2576dJ
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2576dJ
    public final void zzf() {
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.f16479a);
    }
}
