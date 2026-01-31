package com.google.android.gms.internal.ads;

import N1.InterfaceC0680e;
import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3770no implements InterfaceC0680e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2096Xn f21347a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC4453to f21348b;

    C3770no(BinderC4453to binderC4453to, InterfaceC2096Xn interfaceC2096Xn) {
        this.f21347a = interfaceC2096Xn;
        this.f21348b = binderC4453to;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(C6521b c6521b) {
        try {
            L1.n.zze(this.f21348b.f22926a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + c6521b.getCode() + ". ErrorMessage = " + c6521b.getMessage() + ". ErrorDomain = " + c6521b.getDomain());
            this.f21347a.zzh(c6521b.zza());
            this.f21347a.zzi(c6521b.getCode(), c6521b.getMessage());
            this.f21347a.zzg(c6521b.getCode());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0680e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        android.support.v4.media.session.f.a(obj);
        throw null;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(String str) {
        onFailure(new C6521b(0, str, C6521b.UNDEFINED_DOMAIN));
    }
}
