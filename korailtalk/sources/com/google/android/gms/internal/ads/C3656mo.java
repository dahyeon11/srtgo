package com.google.android.gms.internal.ads;

import N1.InterfaceC0677b;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3656mo implements InterfaceC0677b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2280am f20985a;

    C3656mo(BinderC4453to binderC4453to, InterfaceC2280am interfaceC2280am) {
        this.f20985a = interfaceC2280am;
    }

    @Override // N1.InterfaceC0677b
    public final void onInitializationFailed(String str) {
        try {
            this.f20985a.zze(str);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // N1.InterfaceC0677b
    public final void onInitializationSucceeded() {
        try {
            this.f20985a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }
}
