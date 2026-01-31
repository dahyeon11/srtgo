package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class At0 {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final Mx0 zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i8] = (byte) cCharAt;
        }
        return Mx0.zzb(bArr);
    }

    public static final Mx0 zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new C5034yt0("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i8] = (byte) cCharAt;
        }
        return Mx0.zzb(bArr);
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            if (bArr2[i8] != bArr[i8]) {
                return false;
            }
        }
        return true;
    }
}
