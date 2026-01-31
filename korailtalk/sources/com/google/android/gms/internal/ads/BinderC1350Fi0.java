package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Fi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC1350Fi0 extends AbstractBinderC3076hi0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1596Li0 f13056a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1391Gi0 f13057b;

    BinderC1350Fi0(C1391Gi0 c1391Gi0, InterfaceC1596Li0 interfaceC1596Li0) {
        this.f13057b = c1391Gi0;
        this.f13056a = interfaceC1596Li0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3076hi0, com.google.android.gms.internal.ads.InterfaceC3190ii0
    public final void zzb(Bundle bundle) {
        int i8 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        AbstractC1514Ji0 abstractC1514Ji0Zzc = AbstractC1555Ki0.zzc();
        abstractC1514Ji0Zzc.zzb(i8);
        if (string != null) {
            abstractC1514Ji0Zzc.zza(string);
        }
        this.f13056a.zza(abstractC1514Ji0Zzc.zzc());
        if (i8 == 8157) {
            this.f13057b.c();
        }
    }
}
