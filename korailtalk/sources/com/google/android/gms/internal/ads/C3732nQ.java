package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3732nQ implements InterfaceC2378bd0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21264a;

    /* renamed from: b, reason: collision with root package name */
    private final C4775we f21265b;

    C3732nQ(C4775we c4775we, Map map) {
        this.f21264a = map;
        this.f21265b = c4775we;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzd(EnumC1952Uc0 enumC1952Uc0, String str) {
        if (this.f21264a.containsKey(enumC1952Uc0)) {
            this.f21265b.zzb(((C3618mQ) this.f21264a.get(enumC1952Uc0)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdC(EnumC1952Uc0 enumC1952Uc0, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdD(EnumC1952Uc0 enumC1952Uc0, String str, Throwable th) {
        if (this.f21264a.containsKey(enumC1952Uc0)) {
            this.f21265b.zzb(((C3618mQ) this.f21264a.get(enumC1952Uc0)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdE(EnumC1952Uc0 enumC1952Uc0, String str) {
        if (this.f21264a.containsKey(enumC1952Uc0)) {
            this.f21265b.zzb(((C3618mQ) this.f21264a.get(enumC1952Uc0)).zza);
        }
    }
}
