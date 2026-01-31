package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Wo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2058Wo0 {
    public static AbstractC1730Oo0 zza(byte[] bArr) throws GeneralSecurityException {
        try {
            C4242rw0 c4242rw0Zzf = C4242rw0.zzf(bArr, Iy0.zza());
            Js0 js0Zzc = Js0.zzc();
            C3553lt0 c3553lt0Zza = C3553lt0.zza(c4242rw0Zzf);
            return !js0Zzc.zzk(c3553lt0Zza) ? new C4348ss0(c3553lt0Zza) : js0Zzc.zzb(c3553lt0Zza);
        } catch (IOException e8) {
            throw new GeneralSecurityException("Failed to parse proto", e8);
        }
    }

    public static byte[] zzb(AbstractC1730Oo0 abstractC1730Oo0) {
        return ((C3553lt0) Js0.zzc().zze(abstractC1730Oo0, C3553lt0.class)).zzc().zzaV();
    }
}
