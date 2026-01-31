package com.google.android.gms.internal.ads;

import N1.AbstractC0676a;
import N1.InterfaceC0680e;
import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.lo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3542lo implements InterfaceC0680e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2096Xn f20739a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC0676a f20740b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC4453to f20741c;

    C3542lo(BinderC4453to binderC4453to, InterfaceC2096Xn interfaceC2096Xn, AbstractC0676a abstractC0676a) {
        this.f20739a = interfaceC2096Xn;
        this.f20740b = abstractC0676a;
        this.f20741c = binderC4453to;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(C6521b c6521b) {
        try {
            L1.n.zze(this.f20740b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6521b.getCode() + ". ErrorMessage = " + c6521b.getMessage() + ". ErrorDomain = " + c6521b.getDomain());
            this.f20739a.zzh(c6521b.zza());
            this.f20739a.zzi(c6521b.getCode(), c6521b.getMessage());
            this.f20739a.zzg(c6521b.getCode());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0680e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        android.support.v4.media.session.f.a(obj);
        try {
            this.f20741c.getClass();
            this.f20739a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        return new C3314jo(this.f20739a);
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(String str) {
        onFailure(new C6521b(0, str, C6521b.UNDEFINED_DOMAIN));
    }
}
