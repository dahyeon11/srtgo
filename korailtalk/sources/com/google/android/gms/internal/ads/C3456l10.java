package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.l10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3456l10 implements InterfaceC0517a, DJ {

    /* renamed from: a, reason: collision with root package name */
    private H1.G f20613a;

    @Override // H1.InterfaceC0517a
    public final synchronized void onAdClicked() {
        H1.G g8 = this.f20613a;
        if (g8 != null) {
            try {
                g8.zzb();
            } catch (RemoteException e8) {
                L1.n.zzk("Remote Exception at onAdClicked.", e8);
            }
        }
    }

    public final synchronized void zza(H1.G g8) {
        this.f20613a = g8;
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final synchronized void zzdG() {
        H1.G g8 = this.f20613a;
        if (g8 != null) {
            try {
                g8.zzb();
            } catch (RemoteException e8) {
                L1.n.zzk("Remote Exception at onPhysicalClick.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final synchronized void zzdf() {
    }
}
