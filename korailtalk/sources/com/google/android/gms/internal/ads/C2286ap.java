package com.google.android.gms.internal.ads;

import N1.InterfaceC0680e;
import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2286ap implements InterfaceC0680e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1566Ko f18035a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2096Xn f18036b;

    C2286ap(BinderC2744ep binderC2744ep, InterfaceC1566Ko interfaceC1566Ko, InterfaceC2096Xn interfaceC2096Xn) {
        this.f18035a = interfaceC1566Ko;
        this.f18036b = interfaceC2096Xn;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(C6521b c6521b) {
        try {
            this.f18035a.zzf(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0680e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        N1.D d9 = (N1.D) obj;
        if (d9 != null) {
            try {
                this.f18035a.zzg(new BinderC5023yo(d9));
            } catch (RemoteException e8) {
                L1.n.zzh("", e8);
            }
            return new C2859fp(this.f18036b);
        }
        L1.n.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f18035a.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
            return null;
        }
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(String str) {
        onFailure(new C6521b(0, str, C6521b.UNDEFINED_DOMAIN));
    }
}
