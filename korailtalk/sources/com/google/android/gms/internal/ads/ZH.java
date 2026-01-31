package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class ZH extends AbstractC4400tI implements InterfaceC4217rk {
    public ZH(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217rk
    public final synchronized void zzb(final String str, final String str2) {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.YH
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((z1.e) obj).onAppEvent(str, str2);
            }
        });
    }
}
