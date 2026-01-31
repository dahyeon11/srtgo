package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3062hb0 {
    public C3062hb0() {
        try {
            AbstractC2140Yo0.zza();
        } catch (GeneralSecurityException e8) {
            AbstractC0667v0.zza("Failed to Configure Aead. ".concat(e8.toString()));
            G1.u.zzo().zzw(e8, "CryptoUtils.registerAead");
        }
    }

    private static final C1567Ko0 a(String str) {
        try {
            return AbstractC4340so0.zza(C3999po0.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e8) {
            AbstractC0667v0.zza("Failed to get keysethandle".concat(e8.toString()));
            G1.u.zzo().zzw(e8, "CryptoUtils.getHandle");
            return null;
        }
    }

    public static final String zza() {
        C3108hy0 c3108hy0Zzt = AbstractC3677my0.zzt();
        try {
            AbstractC4340so0.zzb(C1567Ko0.zzb(AbstractC1239Co0.zza(Fs0.zzb().zza("AES128_GCM"))), C4226ro0.zzb(c3108hy0Zzt));
        } catch (IOException | GeneralSecurityException e8) {
            AbstractC0667v0.zza("Failed to generate key".concat(e8.toString()));
            G1.u.zzo().zzw(e8, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(c3108hy0Zzt.zzb().zzB(), 11);
        c3108hy0Zzt.zzc();
        return strEncodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, FQ fq) {
        C1567Ko0 c1567Ko0A = a(str);
        if (c1567Ko0A == null) {
            return null;
        }
        try {
            byte[] bArrZza = ((InterfaceC3885oo0) c1567Ko0A.zzd(C3895ot0.zza(), InterfaceC3885oo0.class)).zza(bArr, bArr2);
            fq.zzb().put("ds", "1");
            return new String(bArrZza, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e8) {
            AbstractC0667v0.zza("Failed to decrypt ".concat(e8.toString()));
            G1.u.zzo().zzw(e8, "CryptoUtils.decrypt");
            fq.zzb().put("dsf", e8.toString());
            return null;
        }
    }
}
