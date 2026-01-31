package com.google.android.gms.internal.ads;

import Q1.f;
import android.os.RemoteException;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.zp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5139zp implements f.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4899xj f24199a;

    public C5139zp(InterfaceC4899xj interfaceC4899xj) {
        this.f24199a = interfaceC4899xj;
        try {
            interfaceC4899xj.zzm();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.f.a
    public final void setView(View view) {
        try {
            this.f24199a.zzp(r2.b.wrap(view));
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // Q1.f.a
    public final boolean start() {
        try {
            return this.f24199a.zzt();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return false;
        }
    }
}
