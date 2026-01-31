package com.google.android.gms.internal.ads;

import H1.C0572s1;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.iq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC3205iq extends AbstractBinderC1775Ps {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ T1.b f19985a;

    BinderC3205iq(C3318jq c3318jq, T1.b bVar) {
        this.f19985a = bVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1775Ps, com.google.android.gms.internal.ads.InterfaceC1816Qs
    public final void zzb(String str) {
        this.f19985a.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1775Ps, com.google.android.gms.internal.ads.InterfaceC1816Qs
    public final void zzc(String str, String str2, Bundle bundle) {
        this.f19985a.onSuccess(new T1.a(new C0572s1(str, bundle, str2)));
    }
}
