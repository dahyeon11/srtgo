package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3160iO implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1433Hj f19913a;

    /* renamed from: b, reason: collision with root package name */
    private final C4754wO f19914b;

    /* renamed from: c, reason: collision with root package name */
    private final AD0 f19915c;

    public C3160iO(C2696eM c2696eM, SL sl, C4754wO c4754wO, AD0 ad0) {
        this.f19913a = c2696eM.zzc(sl.zzA());
        this.f19914b = c4754wO;
        this.f19915c = ad0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f19913a.zze((InterfaceC4899xj) this.f19915c.zzb(), str);
        } catch (RemoteException e8) {
            L1.n.zzk("Failed to call onCustomClick for asset " + str + ".", e8);
        }
    }

    public final void zzb() {
        if (this.f19913a == null) {
            return;
        }
        this.f19914b.zzl("/nativeAdCustomClick", this);
    }
}
