package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ur, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1979Ur implements U1.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1406Gr f16726a;

    public C1979Ur(InterfaceC1406Gr interfaceC1406Gr) {
        this.f16726a = interfaceC1406Gr;
    }

    @Override // U1.b
    public final int getAmount() {
        InterfaceC1406Gr interfaceC1406Gr = this.f16726a;
        if (interfaceC1406Gr != null) {
            try {
                return interfaceC1406Gr.zze();
            } catch (RemoteException e8) {
                L1.n.zzk("Could not forward getAmount to RewardItem", e8);
            }
        }
        return 0;
    }

    @Override // U1.b
    public final String getType() {
        InterfaceC1406Gr interfaceC1406Gr = this.f16726a;
        if (interfaceC1406Gr != null) {
            try {
                return interfaceC1406Gr.zzf();
            } catch (RemoteException e8) {
                L1.n.zzk("Could not forward getType to RewardItem", e8);
            }
        }
        return null;
    }
}
