package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.cp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2515cp implements P1.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1975Uo f18353a;

    C2515cp(BinderC2744ep binderC2744ep, InterfaceC1975Uo interfaceC1975Uo) {
        this.f18353a = interfaceC1975Uo;
    }

    @Override // P1.b
    public final void onFailure(C6521b c6521b) {
        try {
            this.f18353a.zzg(c6521b.zza());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // P1.b
    public final void onSuccess(String str) {
        try {
            this.f18353a.zze(str);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // P1.b
    public final void onFailure(String str) {
        try {
            this.f18353a.zzf(str);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }
}
