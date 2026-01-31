package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ka0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3401ka0 implements U1.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H1.I0 f20432a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC3629ma0 f20433b;

    C3401ka0(BinderC3629ma0 binderC3629ma0, H1.I0 i02) {
        this.f20432a = i02;
        this.f20433b = binderC3629ma0;
    }

    @Override // U1.a
    public final void onAdMetadataChanged() {
        if (this.f20433b.f20943i != null) {
            try {
                this.f20432a.zze();
            } catch (RemoteException e8) {
                L1.n.zzl("#007 Could not call remote method.", e8);
            }
        }
    }
}
