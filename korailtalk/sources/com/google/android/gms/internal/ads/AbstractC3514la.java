package com.google.android.gms.internal.ads;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3514la {
    public static String zza(byte[] bArr, boolean z8) {
        return Base64.encodeToString(bArr, true != z8 ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z8) {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
