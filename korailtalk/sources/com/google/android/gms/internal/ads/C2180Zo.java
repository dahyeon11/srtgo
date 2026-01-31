package com.google.android.gms.internal.ads;

import N1.InterfaceC0680e;
import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.Zo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2180Zo implements InterfaceC0680e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1566Ko f17632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2096Xn f17633b;

    C2180Zo(BinderC2744ep binderC2744ep, InterfaceC1566Ko interfaceC1566Ko, InterfaceC2096Xn interfaceC2096Xn) {
        this.f17632a = interfaceC1566Ko;
        this.f17633b = interfaceC2096Xn;
    }

    @Override // N1.InterfaceC0680e
    public final void onFailure(C6521b c6521b) {
        try {
            this.f17632a.zzf(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0680e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        N1.z zVar = (N1.z) obj;
        if (zVar != null) {
            try {
                this.f17632a.zzg(new BinderC4795wo(zVar));
            } catch (RemoteException e8) {
                L1.n.zzh("", e8);
            }
            return new C2859fp(this.f17633b);
        }
        L1.n.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f17632a.zze("Adapter returned null.");
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
