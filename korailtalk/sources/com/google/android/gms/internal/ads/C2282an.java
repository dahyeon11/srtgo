package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;

/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2282an implements InterfaceC1285Dt {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2135Ym f18034a;

    C2282an(C2626dn c2626dn, C2135Ym c2135Ym) {
        this.f18034a = c2135Ym;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1285Dt
    public final void zza() {
        AbstractC0667v0.zza("Rejecting reference for JS Engine.");
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhO)).booleanValue()) {
            this.f18034a.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.f18034a.zzg();
        }
    }
}
