package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Co0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1239Co0 {
    static final C4242rw0 a(AbstractC1730Oo0 abstractC1730Oo0) {
        try {
            return ((C3553lt0) Js0.zzc().zze(null, C3553lt0.class)).zzc();
        } catch (GeneralSecurityException e8) {
            throw new C5034yt0("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e8);
        }
    }

    public static final AbstractC1730Oo0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
        return abstractC1730Oo0 != null ? abstractC1730Oo0 : AbstractC2058Wo0.zza(a(null).zzaV());
    }
}
