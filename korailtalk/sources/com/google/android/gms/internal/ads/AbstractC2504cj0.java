package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.kakao.sdk.auth.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.cj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2504cj0 {
    public static String zza(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.CODE_CHALLENGE_ALGORITHM);
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
