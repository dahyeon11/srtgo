package com.google.android.gms.internal.ads;

import R1.C0746z;
import java.util.Set;

/* loaded from: classes2.dex */
public final class SJ extends AbstractC4400tI {
    SJ(Set set) {
        super(set);
    }

    public final synchronized void zza(final C0746z c0746z) {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.QJ
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((PJ) obj).zze(c0746z);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.RJ
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((PJ) obj).zzf(str);
            }
        });
    }
}
