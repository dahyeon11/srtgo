package com.google.android.gms.internal.ads;

import N1.InterfaceC0680e;
import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4339so implements InterfaceC0680e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2096Xn f22687a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC4453to f22688b;

    C4339so(BinderC4453to binderC4453to, InterfaceC2096Xn interfaceC2096Xn) {
        this.f22687a = interfaceC2096Xn;
        this.f22688b = binderC4453to;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(C6521b c6521b) {
        try {
            L1.n.zze(this.f22688b.f22926a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6521b.getCode() + ". ErrorMessage = " + c6521b.getMessage() + ". ErrorDomain = " + c6521b.getDomain());
            this.f22687a.zzh(c6521b.zza());
            this.f22687a.zzi(c6521b.getCode(), c6521b.getMessage());
            this.f22687a.zzg(c6521b.getCode());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0680e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        android.support.v4.media.session.f.a(obj);
        try {
            this.f22688b.getClass();
            this.f22687a.zzo();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        return new C3314jo(this.f22687a);
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(String str) {
        try {
            L1.n.zze(this.f22688b.f22926a.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            this.f22687a.zzi(0, str);
            this.f22687a.zzg(0);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }
}
