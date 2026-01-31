package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2662e5 {
    public static void zza(InterfaceC2777f5 interfaceC2777f5, C3235j5 c3235j5, InterfaceC3462l40 interfaceC3462l40) {
        for (int i8 = 0; i8 < interfaceC2777f5.zza(); i8++) {
            long jZzb = interfaceC2777f5.zzb(i8);
            List listZzc = interfaceC2777f5.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i8 == interfaceC2777f5.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = interfaceC2777f5.zzb(i8 + 1) - interfaceC2777f5.zzb(i8);
                if (jZzb2 > 0) {
                    interfaceC3462l40.zza(new C2433c5(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
