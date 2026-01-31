package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4690vs0 {
    public static final Nu0 zza = new C4576us0(null);

    public static Tu0 zza(C3325jt0 c3325jt0) {
        C1198Bo0 c1198Bo0;
        Pu0 pu0 = new Pu0();
        pu0.zzb(c3325jt0.zzc());
        Iterator it = c3325jt0.zze().iterator();
        while (it.hasNext()) {
            for (C3098ht0 c3098ht0 : (List) it.next()) {
                EnumC3901ow0 enumC3901ow0Zzb = c3098ht0.zzb();
                EnumC3901ow0 enumC3901ow0 = EnumC3901ow0.UNKNOWN_STATUS;
                int iOrdinal = enumC3901ow0Zzb.ordinal();
                if (iOrdinal == 1) {
                    c1198Bo0 = C1198Bo0.zza;
                } else if (iOrdinal == 2) {
                    c1198Bo0 = C1198Bo0.zzb;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c1198Bo0 = C1198Bo0.zzc;
                }
                int iZza = c3098ht0.zza();
                String strZzf = c3098ht0.zzf();
                if (strZzf.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzf = strZzf.substring(34);
                }
                pu0.zza(c1198Bo0, iZza, strZzf, c3098ht0.zzc().name());
            }
        }
        if (c3325jt0.zzb() != null) {
            pu0.zzc(c3325jt0.zzb().zza());
        }
        try {
            return pu0.zzd();
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
