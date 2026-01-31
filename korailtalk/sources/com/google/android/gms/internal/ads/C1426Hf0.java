package com.google.android.gms.internal.ads;

import android.os.Build;
import com.kakao.sdk.auth.Constants;
import e3.AbstractC5358c;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Hf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1426Hf0 {

    /* renamed from: c, reason: collision with root package name */
    protected static final byte[] f13342c = {61, 122, AbstractC5358c.DC2, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d, reason: collision with root package name */
    protected static final byte[] f13343d = {-110, -13, -34, 70, -83, 43, 97, AbstractC5358c.NAK, -44, AbstractC5358c.DLE, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f13344a = f13343d;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f13345b = f13342c;

    public final boolean zza(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrZza = E7.zza(file.getAbsolutePath());
            if (x509CertificateArrZza.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance(Constants.CODE_CHALLENGE_ALGORITHM).digest(x509CertificateArrZza[0][0].getEncoded());
            if (Arrays.equals(this.f13345b, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f13344a, bArrDigest);
        } catch (B7 e8) {
            throw new GeneralSecurityException("Package is not signed", e8);
        } catch (IOException e9) {
            e = e9;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e10) {
            e = e10;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
