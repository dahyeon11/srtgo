package com.google.android.gms.internal.ads;

import H1.InterfaceC0521b0;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ra0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4198ra0 implements U1.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC0521b0 f22487a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC4312sa0 f22488b;

    C4198ra0(BinderC4312sa0 binderC4312sa0, InterfaceC0521b0 interfaceC0521b0) {
        this.f22487a = interfaceC0521b0;
        this.f22488b = binderC4312sa0;
    }

    @Override // U1.a
    public final void onAdMetadataChanged() {
        if (this.f22488b.f22665d != null) {
            try {
                this.f22487a.zze();
            } catch (RemoteException e8) {
                L1.n.zzl("#007 Could not call remote method.", e8);
            }
        }
    }
}
