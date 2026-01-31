package com.google.android.gms.internal.ads;

import N1.InterfaceC0680e;
import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.po, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3998po implements InterfaceC0680e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2096Xn f21805a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC4453to f21806b;

    C3998po(BinderC4453to binderC4453to, InterfaceC2096Xn interfaceC2096Xn) {
        this.f21805a = interfaceC2096Xn;
        this.f21806b = binderC4453to;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(C6521b c6521b) {
        try {
            L1.n.zze(this.f21806b.f22926a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6521b.getCode() + ". ErrorMessage = " + c6521b.getMessage() + ". ErrorDomain = " + c6521b.getDomain());
            this.f21805a.zzh(c6521b.zza());
            this.f21805a.zzi(c6521b.getCode(), c6521b.getMessage());
            this.f21805a.zzg(c6521b.getCode());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0680e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f21806b.f22931f = (N1.D) obj;
            this.f21805a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        return new C3314jo(this.f21805a);
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(String str) {
        onFailure(new C6521b(0, str, C6521b.UNDEFINED_DOMAIN));
    }
}
