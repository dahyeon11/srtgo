package com.google.android.gms.internal.ads;

import N1.InterfaceC0680e;
import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.Wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2057Wo implements InterfaceC0680e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1320Eo f17068a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2096Xn f17069b;

    C2057Wo(BinderC2744ep binderC2744ep, InterfaceC1320Eo interfaceC1320Eo, InterfaceC2096Xn interfaceC2096Xn) {
        this.f17068a = interfaceC1320Eo;
        this.f17069b = interfaceC2096Xn;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(C6521b c6521b) {
        try {
            this.f17068a.zzf(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0680e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        android.support.v4.media.session.f.a(obj);
        L1.n.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f17068a.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(String str) {
        onFailure(new C6521b(0, str, C6521b.UNDEFINED_DOMAIN));
    }
}
